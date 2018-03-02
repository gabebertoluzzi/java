package ThreeAWT;
import java.awt.*;			// Using AWT's components and containers
import java.awt.event.*;		// Using AWT's event classes and lister interfaces

public class AWTCounterNamedInnerClass extends Frame {
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;
	
	// Constructor to setup the UI components and event handlers
	public AWTCounterNamedInnerClass() {
		setLayout(new FlowLayout());		// "super" Frame sets to FlowLayout
		add(new Label("Counter"));
		tfCount = new TextField(count + "", 10);
		tfCount.setEditable(false);
		add(tfCount);
		
		btnCount = new Button("Count");
		add(btnCount);
		
		// Construct anonymous instance of inner class BtnListener
		//  as listener to the source btnCount
		btnCount.addActionListener(new BtnListener());
		
		setSize(250, 100);
		setTitle("AWT Counter");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AWTCounterNamedInnerClass();
	}
	
	// A named inner class to be used as listener of ActionEvent
	// This inner class can access private variables of the outer class
	private class BtnListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent evt) {
			++count;
			tfCount.setText(count + "");
		}
	}

}
