package OneAWT;
import java.awt.*;
import java.awt.event.*;


public class AWTCounterWithClose extends Frame implements ActionListener {
	// Declare component Label
	private Label lblCount;
	// Declare component TextField
	private TextField tfCount;
	// Declare component Label
	private Label lblFactorial;
	// Declare component TextField
	private TextField tfFactorial;
	// Declare component Button
	private Button btnCount;
	// Counter's value
	private int count = 0;
	// factorial value
	private int factorial = count;
	
	// Constructor to setup UI components and event handlers
	public AWTCounter() {
		setLayout(new FlowLayout());
		// 'super' Frame sets layout to FlowLayout, which arranges
		//   components from left-to-right, then top-to-bottom
		
		lblCount = new Label("n");		// Construct component Label
		add(lblCount);						// "super" Frame adds Label
		
		// Counter textfield
		tfCount = new TextField(count + "", 5);
		tfCount.setEditable(false);
		add(tfCount);
		
		// Factorial Label
		lblFactorial = new Label("factorial(n)");
		add(lblFactorial);
		
		// Factorial Textfield
		tfFactorial = new TextField(factorial + "", 5);
		tfFactorial.setEditable(false);
		add(tfFactorial);
		
		
		btnCount = new Button("Next");
		add(btnCount);
		btnCount.addActionListener(this);
		
		setSize(250, 100);
		setTitle("AWT Counter - n!");
		setVisible(true);			// show "super" Frame
	}
	
	// ActionEvent handler = Called back when the button is clicked
	@Override
	public void actionPerformed(ActionEvent evt) {
		++count;
		tfCount.setText(count + "");
		
		factorial = count * count;
		tfFactorial.setText(factorial + "");
		
	}
	
	// the entry main() method
	public static void main(String[] args) {
		// Invoke constructor by allocating anonymous instance
		new AWTCounter();
	}
	
	 public AWTCounterWithClose () {
	      addWindowListener(this);
	        // "super" Frame fires WindowEvent.
	        // "super" Frame add "this" instance as the WindowEvent listener
	   }

}
