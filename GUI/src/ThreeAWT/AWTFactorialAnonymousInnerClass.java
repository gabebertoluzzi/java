package ThreeAWT;
import java.awt.*;
import java.awt.event.*;

public class AWTFactorialAnonymousInnerClass extends Frame {
	private Label lblInput;
	private Label lblOutput;
	private TextField tfInput;
	private TextField tfOutput;
	private int factorial = 1;
	
	// Constructor
	public AWTFactorialAnonymousInnerClass () {
		setLayout(new FlowLayout());		// "super" Frame sets to FlowLayout
		
		// i. Create label :=lblInput
		// ii. add to Frame set to FlowLayout
		lblInput = new Label("Enter an integer");
		add(lblInput);
		
		// Create TextField, then add to the Frame
		// Input
		tfInput = new TextField(10);
		add(tfInput);
		
		// Add this part to the anonymous class
		//tfInput.addActionListener(this);
		tfInput.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				int numberIn = Integer.parseInt(tfInput.getText());
				for (int i = 1; i <= numberIn; i++) {
					factorial = factorial * i;
					tfOutput.setText("" + factorial);
				}
			}
		});
		
		// Output Label
		lblOutput = new Label("Factorial is ");
		add(lblOutput);
		
		// Output TextField
		tfOutput = new TextField(10);
		tfOutput.setEditable(false);
		add(tfOutput);
		
		setTitle("AWT Factorial w/Anon Class");
		setSize(600, 400);
		setVisible(true);	
	}
	public static void main(String[] args) {
		// Invoke constructor with Anonymous class embedded
		new AWTFactorialAnonymousInnerClass();
	}
}
