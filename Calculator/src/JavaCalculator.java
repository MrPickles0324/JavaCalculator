
import javax.swing.*; //import of all Java Swing 
import java.awt.*; //import of all Java AWT 
import java.awt.event.*; //import of all Java AWT Event 

public class JavaCalculator implements ActionListener {

	JFrame frame;
	JTextField textField;
	JButton[] numberButton = new JButton[10];
	JButton[] functionButton = new JButton[8];
	JButton addButton, subButton, mulButton, divButton;
	JButton decButton, delButton, equButton, clrButton;
	JPanel panel;

	Font myFont = new Font("Ink_Free", Font.BOLD, 30);
	double num1 = 0, num2 = 0, result = 0;
	char operator;

	//constructor for JavaCalculator class
	JavaCalculator() {
		// set the overall frame
		frame = new JFrame("JavaCalculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 550);
		frame.setLayout(null);

		// set the text field entry box
		textField = new JTextField();
		textField.setBounds(50, 25, 300, 50);
		textField.setFont(myFont);
		textField.setEditable(true);
		
		addButton = new JButton("+");
		subButton = new JButton("-");
		mulButton = new JButton("*");
		divButton = new JButton("/");
		decButton = new JButton(".");
		equButton = new JButton("=");
		delButton = new JButton("Delete");
		clrButton = new JButton("Clear");		
		
		//assign the function button array
		functionButton[0] = addButton;
		functionButton[1] = subButton;	
		functionButton[2] = mulButton;
		functionButton[3] = divButton;
		functionButton[4] = decButton;
		functionButton[5] = equButton;
		functionButton[6] = delButton;
		functionButton[7] = clrButton;
				
		// add the text field in the frame
		frame.add(textField);
		frame.setVisible(true);
		
	}

	public static void main(String[] args) {

		System.out.println("Hello World");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}

}
