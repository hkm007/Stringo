import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame
{
	JLabel l1, l2, l3, l4, l5;
	JTextField t1;
	JButton b1;

	public App(String s)
	{
		super(s);
	}

	public void setComponent()
	{
		l1 = new JLabel("Welcome to Stringo");
		l2 = new JLabel("Enter your string...");
		l3 = new JLabel();
		l4 = new JLabel();
		l5 = new JLabel();
		t1 = new JTextField();
		b1 = new JButton("Submit");

		setLayout(null);
		l1.setBounds(130, 50, 200, 20);
		l2.setBounds(50, 80, 200, 20);
		t1.setBounds(50, 110, 300, 20);
		b1.setBounds(140, 140, 100, 20);
		l3.setBounds(50, 170, 200, 20);
		l4.setBounds(50, 190, 300, 20);
		l5.setBounds(50, 210, 300, 20);

		b1.addActionListener(new Handler());

		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(t1);
		add(b1);
	}

	class Handler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			String text = t1.getText();
			int len = text.length();
			String res1 = text.toUpperCase();
			String res2 = text.toLowerCase();
			l3.setText("Length of string: " + len);
			l4.setText("Upper Case: " + res1);
			l5.setText("Lower Case: " + res2);
		}
	}
 
	public static void main(String[] args) 
	{
		App jf = new App("Stringo");
		jf.setComponent();
		jf.setSize(400, 400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}