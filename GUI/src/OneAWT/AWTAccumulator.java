package OneAWT;
import java.awt.*;
import java.awt.event.*;

public class AWTAccumulator extends Frame implements ActionListener {
	private Label lblInput;
	private Label lblOutput;
	private TextField tfInput;
	private TextField tfOutput;
	private int sum = 1;
	
	// Constructor to setup the UI components and event handlers
	public AWTAccumulator() {
		setLayout(new FlowLayout());		// "super" Frame sets to FlowLayout
		
		lblInput = new Label("Enter an integer");
		add(lblInput);
		
		tfInput = new TextField(10);
		add(tfInput);
		
		tfInput.addActionListener(this);
		
		lblOutput = new Label("Factorial is ");
		add(lblOutput);
		
		tfOutput = new TextField(10);
		tfOutput.setEditable(false);
		add(tfOutput);
		
		setTitle("AWT Accumulator");
		setSize(500, 120);
		setVisible(true);
	}
	
	// the entry main() method
	public static void main(String[] args) {
		// Invoke constructor by allocating anonymous Accumulator instance
		new AWTAccumulator();
	}
	
	// ActionEvent handler - called back when enter key was hit on TextField.
	@Override
	public void actionPerformed(ActionEvent evt) {
		int numberIn = Integer.parseInt(tfInput.getText());
		for (int i = 1; i <= numberIn; i++) {
			sum = sum * i;
		}
		tfInput.setText("");
		tfOutput.setText("" + sum);
	}
	
}
