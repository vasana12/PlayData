package winforFinal;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DrawClass extends JPanel{
	int numCol, kor, eng, mat, tot;
	float avg;	
	boolean b_click;

	public void paint(Graphics g) {
//		System.out.println("페인트");
//		System.out.println(this.kor);
		
		//화면 초기화
		g.clearRect(0, 0, getWidth(), getHeight());
		
		for(int i = 0; i < 11; i++) {
			g.drawLine(100,  100 + i * 50 , 600, 100 +  i * 50);
			numCol = 10 * i;
			g.drawString(Integer.toString(numCol), 75, 600 - 50 * i );
		}
		g.drawLine(100, 600, 100, 70);
		g.drawString("국어", 170, 630);
		g.drawString("수학", 270, 630);
		g.drawString("영어", 370, 630);
		g.drawString("평균", 470, 630);
		
		g.setColor(Color.RED);	
		
		if(this.kor >0) {
			System.out.println("리페인트");
			g.fillRect(170, (600 - this.kor), 50, this.kor );
			g.fillRect(270, (600 - this.eng), 50, this.eng);
			g.fillRect(370, (600 - this.mat), 50, this.mat );
			g.setColor(Color.BLUE);	
			g.fillRect(470, (600 - this.mat), 50, this.mat );
		}
	}
	public void setData(int kor, int eng, int mat, boolean b_click ){
		this.kor = kor*5;
		this.eng = eng*5;
		this.mat = mat*5;
		this.tot = (kor + eng + mat)*5;
		this.avg = tot/3.f * 5;
		this.b_click = b_click ;
	}
	

}
