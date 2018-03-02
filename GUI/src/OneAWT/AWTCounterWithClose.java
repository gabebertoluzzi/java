package OneAWT;
import java.awt.*;
import java.awt.event.*;


public class AWTCounterWithClose extends Frame implements ActionListener, WindowListener {
	// Declare component Label
	private Label lblCount;
	// Declare component TextField
	private TextField tfCount;
	// Declare component Label
	//private Label lblFactorial;
	// Declare component TextField
	//private TextField tfFactorial;
	// Declare component Button
	private Button btnCount;
	// Counter's value
	private int count = 0;
	// factorial value
	//private int factorial = count;
	
	// Constructor to setup UI components and event handlers
	public AWTCounterWithClose() {
		setLayout(new FlowLayout());
		// 'super' Frame sets layout to FlowLayout, which arranges
		//   components from left-to-right, then top-to-bottom
		
		lblCount = new Label("Count");		// Construct component Label
		add(lblCount);						// "super" Frame adds Label
		
		// Counter textfield
		tfCount = new TextField(count + "", 5);
		tfCount.setEditable(false);
		add(tfCount);
	
		
		btnCount = new Button("Count");
		add(btnCount);
		btnCount.addActionListener(this);
		
		addWindowListener(this);
		
		setSize(250, 100);
		setTitle("AWT Counter");
		setVisible(true);			// show "super" Frame
	}
	
	// ActionEvent handler = Called back when the button is clicked
	@Override
	public void actionPerformed(ActionEvent evt) {
		++count;
		tfCount.setText(count + "");
		
	}
	
	// the entry main() method
	public static void main(String[] args) {
		// Invoke constructor by allocating anonymous instance
		new AWTCounterWithClose();
	}
	
	@Override
	public void windowClosing(WindowEvent evt) {
		System.exit(0);		// terminate the program
	}
	
	// Not used, but need to provide an empty body to compile
	@Override public void windowOpened(WindowEvent evt) {}
	@Override public void windowClosed(WindowEvent evt) {}
	@Override public void windowIconified(WindowEvent evt) {}
	@Override public void windowDeiconified(WindowEvent evt) {}
	@Override public void windowActivated(WindowEvent evt) {}
	@Override public void windowDeactivated(WindowEvent evt) {}
}
