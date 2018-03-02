package OneAWT;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;

// an applet extends java.applet.Applet
public class AWTAccumulatorApplet extends Applet implements ActionListener {
	private TextField tfInput;
	private int sum = 0;
	
	// init() runs when the applet is loaded.Setup the UI components and event
	public void init() {
		add(new Label("Enter an integer"));		// Anonymous label
		
		tfInput = new TextField(10);
		add(tfInput);
		tfInput.addActionListener(this);
			// Hitting enter key on tfInput invokes actionPerformed
	}
	
	// ActionEvent handler - Called back when enter key was hit on TextField.
	public void actionPerformed(ActionEvent evt) {
		int numberIn = Integer.parseInt(evt.getActionCommand());
			// getActionCommand returns the String entered
		sum += numberIn;
		tfInput.setText("");
		showStatus("The accumulated sum is: " + sum);
	}
}
