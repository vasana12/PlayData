package winforFinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class InsertEvent implements ActionListener{
	int ikor,ieng,imat,itot;
	float favg1;
	int iavg2;
	boolean graphRendering;
	String arr[];
	JTextField num,name,kor,eng,mat;
	JTable table;

	InsertEvent(JTextField num,JTextField name, JTextField kor,JTextField eng ,JTextField mat, JTable table ){
		this.name = name;
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.table = table;
		arr = new String [8];
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		checkOverlap();
		
		this.num.setText("");
		this.name.setText("");
		this.kor.setText("");
		this.eng.setText("");
		this.mat.setText("");
	}
	public void checkOverlap() {
		for(int i = 0; i < table.getRowCount(); i++) {
			
			if(table.getValueAt(i, 0).equals(num.getText())) {
				num.setText("중복");
				name.setText("");
				kor.setText("");
				eng.setText("");
				mat.setText("");
				System.out.print("학번 중복");
				return;
			}	
		}
		insertData();
		insertToTable();
	}
	public void insertData() {
		this.arr[0] = this.num.getText();
		this.arr[1] = this.name.getText();
		
		try {
			this.ikor = Integer.parseInt(kor.getText());
			this.ieng = Integer.parseInt(eng.getText());
			this.imat = Integer.parseInt(mat.getText());
			
			this.itot = ikor + ieng + imat;
			this.favg1 = itot/3.f;
			this.iavg2 = itot/3;
			
			this.arr[2] = kor.getText();
			this.arr[3] = eng.getText();
			this.arr[4] = mat.getText();
			this.arr[5] = Integer.toString(itot);
			this.arr[6] = Float.toString(favg1);
			grade();
			
		}catch(Exception e) {
			System.out.print("캐스트 실패");
			this.num.setText("");
			this.name.setText("");
			this.kor.setText("");
			this.eng.setText("");
			this.mat.setText("");
			return;
		}
	}
	
	public void insertToTable() {
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		model.addRow(arr);
	}
	
	public void grade() {
		int grade = this.iavg2/10;

		switch(grade) {
		case 10:
		case 9:
			this.arr[7] = "수";
			break;
		case 8 :
			this.arr[7] = "우";
			break;
		case 7 :
			this.arr[7] = "미";
			break;
		case 6:
			this.arr[7] = "양";
			break;
		default :
			this.arr[7] = "가";
			break;
				
		}
	}
}
