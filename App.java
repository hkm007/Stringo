import javax.swing.*;
import java.awt.event.*;

public class App extends JFrame
{
	JLabel l1, l2, l3, l4, l5, l6;
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
		l6 = new JLabel();
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
		l6.setBounds(50, 230, 300, 20);

		b1.addActionListener(new Handler());

		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
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
			int v = 0, c = 0;
			for(int i = 0; i < len; i++)
			{
				if(text.charAt(i) == 'a' || text.charAt(i) == 'A' || text.charAt(i) == 'e' || text.charAt(i) == 'E' || text.charAt(i) == 'i' || text.charAt(i) == 'I' || text.charAt(i) == 'o' || text.charAt(i) == 'O' || text.charAt(i) == 'u' || text.charAt(i) == 'U')
					v++;
				else if(text.charAt(i) != ' ') 
					c++;
			}
			l3.setText("Length of string: " + len);
			l4.setText("Upper Case: " + res1);
			l5.setText("Lower Case: " + res2);
			l6.setText("Vowels/Consonants: " + v + "/" + c);
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
