import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class tuna extends JFrame {  //extension lets us use window
	

	private JTextField item1;
	private JTextField item2;
	private JTextField item3;
	private JPasswordField passwordField;  
	
	public tuna() {   //Whole thing pretty much is constructor for the tuna class
		super("The title"); //Title of window
		setLayout(new FlowLayout()); //Layout of window
		
		item1 = new JTextField(10);
		add(item1);
		
		item2 = new JTextField("enter text here"); //default text - like prompt
		add(item2);
		
		item3 = new JTextField("uneditable", 20);
		item3.setEditable(false);
		add(item3);
		
		passwordField = new JPasswordField("mypass");
		add(passwordField);
		
		thehandler handler = new thehandler();
		item1.addActionListener(handler);
		item1.addActionListener(handler);
		item1.addActionListener(handler);
		passwordField.addActionListener(handler);
	
	
	}
	//The following class inside the tuna class inherits from tuna class
	private class thehandler implements ActionListener{
		
		public void actionPerformed(ActionEvent event) {
			String string = "";
			
			if(event.getSource()==item1)
				string=String.format("field 1: %s", event.getActionCommand()); //get the text from the location
			else if(event.getSource()==item2)
				string=String.format("field 2: %s", event.getActionCommand()); //get the text from the location
			else if(event.getSource()==item3)
				string=String.format("field 3: %s", event.getActionCommand()); //get the text from the location
			else if(event.getSource()==passwordField)
				string=String.format("password field is : %s", event.getActionCommand());
		
			JOptionPane.showMessageDialog(null, string);
		
		}
		
	}
}
