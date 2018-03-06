package FourSwing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingTempConverter extends JFrame	 {
	private JTextField tfCelcius, tfFarenheit;
	private float cInput, fInput, result;
	private String output;
	
	public SwingTempConverter () {
		// Swing components require a Content Pane to be added to
		Container cp = getContentPane();
		// set it to a grid layout
		cp.setLayout(new GridLayout(2, 2));
		
		// Celcius details
		cp.add(new JLabel("Celcius: "));
		tfCelcius = new JTextField(10);
		tfCelcius.setHorizontalAlignment(JTextField.RIGHT);
		tfCelcius.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cInput = Float.parseFloat(tfCelcius.getText());
				cInput = (float) (cInput * 1.8 + 32);
				output = String.format("%.1f", cInput);
				tfFarenheit.setText(output + "");
			}
		});
		cp.add(tfCelcius);
		
		// Farenheit details
		cp.add(new JLabel("Farenheit: "));
		tfFarenheit = new JTextField(10);
		tfFarenheit.setHorizontalAlignment(JTextField.RIGHT);
		tfFarenheit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fInput = Float.parseFloat(tfFarenheit.getText());
				fInput = (float) (fInput * (5/9) - 32);
				output = String.format("%.1f", fInput);
				tfCelcius.setText(output + "");
			}
		});
		cp.add(tfFarenheit);
		
		
		// Window details
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Swing Temp Converter");
		setSize(350, 200);
		setVisible(true);
	}
	
	// the entry main() method
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new SwingTempConverter();
			}
		});
	}
}
