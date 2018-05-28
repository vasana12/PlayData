package winforFinal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class DeleteEvent implements ActionListener {
	JTextField text1;
	JTable table;
	DeleteEvent(JTable table,JTextField text1){
		this.table = table;
		this.text1 = text1;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i = 0; i < table.getRowCount(); i++) {
			System.out.print(table.getValueAt(i, 0));
			if(table.getValueAt(i, 0).equals(this.text1.getText())) {
				DefaultTableModel model = (DefaultTableModel)table.getModel();
				model.removeRow(i);
				text1.setText("");
				return;
			}		
		}
		text1.setText("없음");
		System.out.print("해당 데이터 없음");
		return;
	}
}