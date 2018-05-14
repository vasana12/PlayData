package panel;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PanelEX {

	public static void main(String[] args) {
		//프레임
		JFrame frame = new JFrame("참가자 명단 프로그램");
		frame.setPreferredSize(new Dimension(700,400));
		frame.setLocation(500,400);
		//메인 컨테이너 페널
		Container contentPane = frame.getContentPane();
		
		//데이터
		String colNames[] = {"학번", "이름","국어","영어","수학","총점","평균","학점"};	
		
		//데이터 테이블
		DefaultTableModel model = new DefaultTableModel(colNames,0);
		JTable table = new JTable(model);
		
		//스크롤 판넬
		JScrollPane scrollPande = new JScrollPane(table);
		contentPane.add(scrollPande, BorderLayout.CENTER);
		
		//버튼담을 판넬
		JPanel panel = new JPanel();
		
		//텍스트
		JTextField text1 = new JTextField(3);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(3);
		JTextField text4 = new JTextField(3);
		JTextField text5 = new JTextField(3);
		
		//버튼
		JButton button1 = new JButton("추가");
		JButton button2 = new JButton("수정");
		JButton button3 = new JButton("삭제");
			
		//판넬 객체 추가
		panel.add(new JLabel("학번"));
		panel.add(text1);
		panel.add(new JLabel("이름"));
		panel.add(text2);
		panel.add(new JLabel("국어"));
		panel.add(text3);
		panel.add(new JLabel("영어"));
		panel.add(text4);
		panel.add(new JLabel("수학"));
		panel.add(text5);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		
		//버튼 판넬을 메인 판넬에 삽입
		contentPane.add(panel, BorderLayout.SOUTH);
		
		//이벤트 버튼에 추가
		ActionListener ic = new InsertClass(table,text1,text2,text3,text4,text5 );
		ActionListener mc= new ModifyClass(table,text1,text2,text3,text4,text5);
		ActionListener dc = new DeleteClass(table,text1);
		button1.addActionListener(ic);
		button2.addActionListener(mc);
		button3.addActionListener(dc);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);

	}
}
