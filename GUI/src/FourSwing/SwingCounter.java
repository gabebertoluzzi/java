package FourSwing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

// A Swing application extends javax.swing.JFrame
//  instead of java.awt.Frame
public class SwingCounter extends JFrame {
	// variables
	private JTextField tfCount;
		// Use Swing's JTextFField instead of AWT's TextField
	private JButton btnCount;
		// Using Swing's JButton instead of AWT's Button
	private int count = 0;
	
	public SwingCounter () {
		// Get the content-pane of top-level container JFrame
		// Components are added onto content pane
		Container cp = getContentPane();
		cp.setLayout(new FlowLayout());
		
		cp.add(new JLabel("Counter"));
		tfCount = new JTextField(count + "", 10);
		tfCount.setEditable(false);
		tfCount.setHorizontalAlignment(JTextField.RIGHT);
		cp.add(tfCount);
		
		btnCount = new JButton("Count");
		cp.add(btnCount);
		btnCount.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				++count;
				tfCount.setText(count + "");
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setTitle("Swing Counter");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new SwingCounter();
			}
		});
	}
	
}
