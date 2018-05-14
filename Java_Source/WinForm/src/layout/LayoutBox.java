package layout;

import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class LayoutBox {
	public static void main(String args[]) {
		JFrame frame = new JFrame ("Zpp Program");
		frame.setLocation(500,400);
		Container contentPane = frame.getContentPane();
		BoxLayout layout = new BoxLayout(contentPane,BoxLayout.X_AXIS);
		contentPane.setLayout(layout);
		contentPane.add(new JButton("1"));
		contentPane.add(new JButton("2"));
		contentPane.add(new JButton("3"));
		contentPane.add(new JButton("4"));
		contentPane.add(new JButton("5"));
		contentPane.add(new JButton("6"));
		contentPane.add(new JButton("7"));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
