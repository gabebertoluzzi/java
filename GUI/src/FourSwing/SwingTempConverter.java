package FourSwing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SwingTempConverter extends JFrame	 {
	private JTextField tfCelcius, tfFarenheit;
	
	public SwingTempConverter () {
		// Swing components require a Content Pane to be added to
		Container cp = new ContentPane();
		// set it to a grid layout
		cp.setLayout(new GridLayout(2, 2));
		
		cp.add(new JLabel("Celcius: "))
	}
}
