
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import oracle.jdbc.OracleTypes;


public class Client implements ActionListener, Runnable {

private Container mainPanel;
private JFrame frame;
private JPanel tab, logIntab, logOuttab, msgPanel, msgInsert ;
private JScrollPane scrollPanel;

private CardLayout clayout;

private JLabel logInLabel, logOutLabel;
private JTextField  msgInsertText; //logInTextBox, 
private JTextArea msgText;
private JButton logInButton, logOutButton, exitButton;

//static private String userName,id,ip = "127.0.0.1";
private String userName,id,ip = "192.168.0.194";
private Socket socket;
private boolean status;
private BufferedReader inMsg = null;
private PrintWriter outMsg = null;

private String driver = "oracle.jdbc.driver.OracleDriver";
//private String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
private String url = "jdbc:oracle:thin:@192.168.0.194:1521:orcl";
private Connection con = null;
private CallableStatement cstmt = null;
private BufferedReader br =null;
private ResultSet rs =null;

private Thread thread;

Client(String ip){
	userName = null;
	
	frame = new JFrame("멀티 채팅");
	frame.setLocation(800,300);
	frame.setPreferredSize(new Dimension(400,500));
	frame.setResizable(false);
	
	//main panel
	mainPanel =  frame.getContentPane();
	
	//tab ui
	tab = new JPanel();
		clayout = new CardLayout();
		tab.setLayout(clayout);
	
		logIntab = new JPanel(new BorderLayout());	
		logInLabel = new JLabel("대화명 : " +  UserData.id);
		logInButton = new JButton("접속");
//		logInTextBox = new JTextField();	
		logIntab.add(logInLabel,BorderLayout.WEST);
		logIntab.add(logInButton,BorderLayout.EAST);
//		logIntab.add(logInTextBox,BorderLayout.CENTER);
		//버튼 이벤트 등록
		logInButton.addActionListener(this);
	System.out.println(this);
		logOuttab = new JPanel(new BorderLayout());
		logOutLabel = new JLabel("대화명 :");
		logOutButton = new JButton("로그아웃");	
		logOuttab.add(logOutLabel,BorderLayout.WEST);
		logOuttab.add(logOutButton,BorderLayout.EAST);
		//버튼 이벤트 등록
		logOutButton.addActionListener(this);
		
	tab.add(logIntab,"login");
	tab.add(logOuttab,"logout");
	
	//Text ui
	msgPanel = new JPanel(new BorderLayout());
	msgText = new JTextArea("",10,30);
	msgText.setEditable(false);
	
	
	scrollPanel = new JScrollPane(msgText,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);	
	scrollPanel.setPreferredSize(new Dimension(50, 50));
	msgPanel.setLayout(new BorderLayout());
	msgPanel.add(scrollPanel, BorderLayout.CENTER);
	
	//Text Insert ui
	msgInsert = new JPanel();
	exitButton = new JButton("종료");
	msgInsertText = new JTextField();
	
	msgInsertText.addActionListener(this);
	exitButton.addActionListener(this);
	
	msgInsert.setLayout(new BorderLayout());
	msgInsert.add(exitButton,BorderLayout.EAST);
	msgInsert.add(msgInsertText,BorderLayout.CENTER);
	
	mainPanel.add(tab,BorderLayout.NORTH);
	mainPanel.add(msgPanel,BorderLayout.CENTER);
	mainPanel.add(msgInsert,BorderLayout.SOUTH);
	
	clayout.show(tab,"login");

 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.pack();
	frame.setVisible(true);
}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Object obj = arg0.getSource();
		
		//종료 처리
		if(obj == exitButton) {
			System.out.println("종료");
			System.exit(0);
		}else if(obj == logInButton ) {
			System.out.println("로그인");
			clayout.show(tab, "logout");
			System.out.println("탭모습 바꾸기");
			id = UserData.id;
			logInLabel.setText("대화명 : ");
			logOutLabel.setText("대화명 : "+ id);
			connectServer();
			
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, "PDuser", "123456");
				
				cstmt = con.prepareCall("{call textData(?)}"); //call 다음 call_selectp는 db에 등록되있는 프로시저 식별자다!
				cstmt.registerOutParameter(1, OracleTypes.CURSOR);
				cstmt.executeQuery();
				
				rs = (ResultSet)cstmt.getObject(1);
				while(rs.next()) {
//					outMsg.println(rs.getString("userID") + "/" + msgInsertText.getText());
					outMsg.println(rs.getString("userID") + "/" + rs.getString("text"));
				}
			}catch(Exception e) {
				
			}
			
//			outMsg.println(id + "/" + msgInsertText.getText());
			msgInsertText.setText("");
			
			
		}else if(obj ==logOutButton  ) {
			System.out.println("로그아웃");
			outMsg.println(id+"/"+"logint");
			logOutLabel.setText(" ");
//			logInTextBox.setText("");
			clayout.show(tab, "login");
			try {
				outMsg.close();
				socket.close();
			}catch(Exception e) {
				
			}
			status =false;
			
			
			
		}else if(obj == msgInsertText) {
			System.out.println("메세지 입력");
			outMsg.println(id + "/" + msgInsertText.getText());
			try {
				Class.forName(driver);
				con = DriverManager.getConnection(url, "PDuser", "123456");
				
				cstmt = con.prepareCall("{call insertText(?,?)}"); //call 다음 call_selectp는 db에 등록되있는 프로시저 식별자다!
				cstmt.setString(1,id);
				cstmt.setString(2, msgInsertText.getText());
				cstmt.executeQuery();
			}catch(Exception e) {
				
			}
			
			
			msgInsertText.setText(" ");
		}
		
	}
	
	public void connectServer() {
		try {
			socket = new Socket("192.168.0.194",8888);
			
			inMsg = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			outMsg = new PrintWriter(socket.getOutputStream(),true);
			outMsg.println(id+"/"+"login");
			thread = new Thread(this);
			thread.start();
			System.out.println("서버 연결 성공");
			
		}catch(Exception ignored) {
			
		}
	}
	
	public void run() {
		String msg;
		String [] rmsg;
		
		status = true;
		while(status) {
			try {
				msg = inMsg.readLine();
				rmsg = msg.split("/");
				msgText.append(rmsg[0] + ">"+ rmsg[1] + "\n");
				
				msgText.setCaretPosition(msgText.getDocument().getLength());
				
			}catch(Exception e){
				status = false;
				
			}
		}
	}

}
