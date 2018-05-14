package winform;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class WinFormMain {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Hello Java Programing");
		frame.setPreferredSize(new Dimension(200,70));
		frame.setLocation(500,400);
		Container contentPane = frame.getContentPane();
		JLabel label = new JLabel("Hello Java",SwingConstants.CENTER);
		JTextField text = new JTextField();
		JButton button = new JButton("확인");
		contentPane.add(text,BorderLayout.CENTER);
		contentPane.add(button,BorderLayout.EAST);
		contentPane.add(label,BorderLayout.SOUTH);
		ActionListener listener = new ConfirmButtonActionListener(text,label);
		button.addActionListener(listener);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
		
	}
}
