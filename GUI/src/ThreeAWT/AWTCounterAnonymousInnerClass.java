package ThreeAWT;
import java.awt.*;
import java.awt.event.*;

public class AWTCounterAnonymousInnerClass extends Frame {
	// private variables
	private TextField tfCount;
	private Button btnCount;
	private int count = 0;
	
	// Constructor for UI and event handlers
	public AWTCounterAnonymousInnerClass () {
		setLayout(new FlowLayout());
		add(new Label("Counter"));
		tfCount = new TextField(count + "", 10);
		tfCount.setEditable(false);
		add(tfCount);
		
		Button btnCount = new Button("Count");
		add(btnCount);
		
		// Construct an anonymous instance of an anonymous class
		//  as listener to the source btnCount
		btnCount.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				++count;
				tfCount.setText(count + "");
			}
		});
		
		setSize(250, 100);
		setTitle("AWT Counter");
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new AWTCounterAnonymousInnerClass();
	}
}
