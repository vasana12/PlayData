package scoreGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

public class ActionEventClass1 implements ActionListener{
	JTextField kor, eng, mat;
	int ko ,en, ma;
	Drawing dw;
	
	ActionEventClass1(JTextField kor,JTextField eng,JTextField mat, Drawing dw){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.dw = dw;
	}
	@Override
	public void actionPerformed(ActionEvent e) {

		System.out.println("이벤트");
		if(kor.getText().equals("")||eng.getText().equals("")|| mat.getText().equals("")) 
		{
			System.out.println("점수 미입력");
		}
		else 
		{
			this.ko = Integer.parseInt(this.kor.getText());
			this.en = Integer.parseInt(this.eng.getText());
			this.ma = Integer.parseInt(this.mat.getText());				
;
			System.out.println("점수 입력");
			
			dw.setData(this.ko, this.en, this.ma, true);
			dw.repaint();
			
		}
	}
}
