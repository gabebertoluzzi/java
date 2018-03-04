package FourSwing;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// A Swing application extends from javax.swint.JFrame
public class SwingAdder extends JFrame {
	private JTextField tfNumber1, tfNumber2, tfResult;
	private JButton btnAdd, btnClear, btnSubtract, btnMultiply, btnDivide, btnMod;
	private int number1, number2, result;
	
	// Constructor to set up UI components and event handlers
	public SwingAdder() {
		// Swing components should be added to the content-pane of the JFrame
		Container cp = getContentPane();
		// Set this Container to grid layout of 4 rows and 2 columns
		cp.setLayout(new GridLayout(4, 2, 10, 3));
		
		// Components are added from left-to-right, top-to-bottom
		// tfNumber1, then tfNumber2, then tfResult
		cp.add(new JLabel("First Number: "));	// at (1.1)
		tfNumber1 = new JTextField(10);
		tfNumber1.setHorizontalAlignment(JTextField.RIGHT);
		cp.add(tfNumber1	);
		
		// tfNumber2
		cp.add(new JLabel("Second Number: "));
		tfNumber2 = new JTextField(10);
		tfNumber2.setHorizontalAlignment(JTextField.RIGHT);
		cp.add(tfNumber2);
		
		// tfResult
		cp.add(new JLabel("Result: "));
		tfResult = new JTextField(10);
		tfResult.setHorizontalAlignment(JTextField.RIGHT);
		tfResult.setEditable(false);
		cp.add(tfResult);
		
		// Add or ( + )
		btnAdd = new JButton("+");
		cp.add(btnAdd);		// At (4, 1)
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				number1 = Integer.parseInt(tfNumber1.getText());
				number2 = Integer.parseInt(tfNumber2.getText());
				result = number1 + number2;
				tfResult.setText(result + "");
			}
		});
		
		// Subtract ( - )
		// TODO
		btnSubtract = new JButton("-");
		cp.add(btnSubtract);		// At (4, 1)
		btnSubtract.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				number1 = Integer.parseInt(tfNumber1.getText());
				number2 = Integer.parseInt(tfNumber2.getText());
				result = number1 - number2;
				tfResult.setText(result + "");
			}
		});
		
		// Multiply ( * )
		btnMultiply = new JButton("*");
		cp.add(btnMultiply);		// At (4, 1)
		btnMultiply.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				number1 = Integer.parseInt(tfNumber1.getText());
				number2 = Integer.parseInt(tfNumber2.getText());
				result = number1 * number2;
				tfResult.setText(result + "");
			}
		});
		
		// Divide ( / )
		btnDivide = new JButton("/");
		cp.add(btnDivide);		// At (4, 1)
		btnDivide.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				number1 = Integer.parseInt(tfNumber1.getText());
				number2 = Integer.parseInt(tfNumber2.getText());
				result = number1 / number2;
				tfResult.setText(result + "");
			}
		});
		
		// Modulo ( % )
		btnMod = new JButton("%");
		cp.add(btnMod);		// At (4, 1)
		btnMod.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				number1 = Integer.parseInt(tfNumber1.getText());
				number2 = Integer.parseInt(tfNumber2.getText());
				result = number1 % number2;
				tfResult.setText(result + "");
			}
		});
		
		btnClear = new JButton("Clear");
		cp.add(btnClear);
		btnClear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent evt) {
				tfNumber1.setText("");
				tfNumber2.setText("");
				tfResult.setText("");
				number1 = 0;
				number2 = 0;
				result = 0;
			}
		});
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Swing Adder");
		setSize(350, 200);
		setVisible(true);
	}
	
	// the entry main() method
	public static void main(String[] args) {
		// for thread safety use the event-dispatching thread to construct UI
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new SwingAdder();
			}
		});
	}
}
