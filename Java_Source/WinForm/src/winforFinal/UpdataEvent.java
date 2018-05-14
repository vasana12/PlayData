package winforFinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class UpdataEvent implements ActionListener {
	int ikor,ieng,imat,itot;
	float favg1;
	int iavg2;
	boolean graphRendering;
	String arr[];
	JTextField num,name,kor,eng,mat;
	JTable table;
	InsertEvent ie;
	
	UpdataEvent(JTextField num,JTextField name, JTextField kor,JTextField eng ,JTextField mat, JTable table ){
		ie = new InsertEvent(num, name, kor, eng ,mat, table);
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
		
		 check();
	}
	
	public void check() {
		
		for(int i = 0; i < table.getRowCount(); i++) 
		{
			if(table.getValueAt(i, 0).equals(this.num.getText())) 
			{
				ie.insertData();
				updateTheTable(ie.arr, i);
	
				this.num.setText("");
				this.name.setText("");
				this.kor.setText("");
				this.eng.setText("");
				this.mat.setText("");
				return;
			}
		}
		System.out.print("데이터없음");
		this.num.setText("");
		this.name.setText("");
		this.kor.setText("");
		this.eng.setText("");
		this.mat.setText("");
		return;
	}
	
	public void updateTheTable(String arr[], int i) {
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();

		for( int j = 0; j < table.getColumnCount(); j ++)
		{
			model.setValueAt(arr[j], i, j);
		}
	}
}
