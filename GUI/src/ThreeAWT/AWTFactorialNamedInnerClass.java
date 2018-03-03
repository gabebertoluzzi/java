package ThreeAWT;
import java.awt.*;
import java.awt.event.*;

// really a factorial outputer
public class AWTFactorialNamedInnerClass extends Frame {
	private Label lblInput;
	private Label lblOutput;
	private TextField tfInput;
	private TextField tfOutput;
	private int factorial;
	
	// Constructor
	public AWTFactorialNamedInnerClass() {
		setLayout(new FlowLayout());
		
		lblInput = new Label("Enter an int");
		add(lblInput);
		
		tfInput = new TextField(10);
		add(tfInput);
		
		tfInput.addActionListener(new FactorialListener());
		
		lblOutput = new  Label("Factorial is: ");
		add(lblOutput);
		
		tfOutput = new TextField(10);
		tfOutput.setEditable(false);
		add(tfOutput);
		
		setTitle("AWT Factorial");
		setSize(500, 120);
		setVisible(true);
		
	}
	
	// Named inner class to be used as Listener for ActionEvent
	// Inner class can access private variables
	private class FactorialListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evt) {
			int numberIn = Integer.parseInt(tfInput.getText());
			for (int i = 1; i < numberIn; i++) {
				factorial = factorial * i;
			}
			tfInput.setText("");
			tfOutput.setText("" + factorial);
		}
	}

}
