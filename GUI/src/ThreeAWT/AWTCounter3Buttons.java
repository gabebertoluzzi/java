package ThreeAWT;
import java.awt.*;
import java.awt.event.*;


public class AWTCounter3Buttons extends Frame {
	// Declare component Label
	private Label lblCount;
	// Declare component TextField
	private TextField tfCount;

	// Declare component Buttons
	private Button btnCountUp;
	private Button btnCountDown;
	private Button btnReset;
	// Counter's value
	private int count = 0;
	
	// Constructor to setup UI components and event handlers
	public AWTCounter3Buttons () {
		setLayout(new FlowLayout());
		// 'super' Frame sets layout to FlowLayout, which arranges
		//   components from left-to-right, then top-to-bottom
		
		lblCount = new Label("Counter");		// Construct component Label
		add(lblCount);						// "super" Frame adds Label
		
		// Counter textfield
		tfCount = new TextField(count + "", 5);
		tfCount.setEditable(false);
		add(tfCount);

		
		
		btnCountUp = new Button("Count Up");
		btnCountDown = new Button("Count Down");
		btnReset = new Button("Reset");
		add(btnCountUp);
		add(btnCountDown);
		add(btnReset);
		btnCountUp.addActionListener(new BtnListener());
		btnCountDown.addActionListener(new BtnListener());
		btnReset.addActionListener(new BtnListener());
		
		setSize(450, 100);
		setTitle("AWT Counter 3 Buttons");
		setVisible(true);			// show "super" Frame
	}
	
	
	// Named inner class
	private class BtnListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evt) {
			String btnLabel = evt.getActionCommand();
			
			if (btnLabel.equals("Count Up")) {
				++count;
				tfCount.setText(count + "");
			} else if (btnLabel.equals("Count Down")) {
				--count;
				tfCount.setText(count + "");
			} else {
				count = 0;
				tfCount.setText("");
			}
		}
	}
	
	// the entry main() method
	public static void main(String[] args) {
		// Invoke constructor by allocating anonymous instance
		new AWTCounter3Buttons();
	}

}
