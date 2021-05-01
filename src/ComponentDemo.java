import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;		//Handles events such as mouse clicks

// Simple class to demonstrate the use of Graphics Components. 
// It provides the user interface to add two numbers  by including an actionPerformed() method.
// The class definition includes implements ActionListener  which tells the class to "listen" for
// "events" activated by the user. In this case, the event being listened to is the press of a "button"
// in the applet window.

public class ComponentDemo extends Applet implements ActionListener 
{ 	Label 			myPrompt1, myPrompt2;	// declare prompts (Labels)
	TextField 	value1, value2;		// declare user input (text)
	Button 		addButton;		// declare a button to start addition
	int				num1, num2, answer;		// variables used in actionPerformed()
	/* The init method sets up the GUI components that have been declared globally 
		To do this we must:
		instantiate the components using the new command. This provides space in memory for the
 		components.
		add the components to the applet window, in the left to right, up to down order in which they
 		 are added in init. 
		wait for the user to activate an event – this may be clicking on a button or pressing the enter
 		key after text has been added to a TextField.
		*/
	public void init( ) 
    {
		setBackground(Color.blue);	// sets the applet window to black
		setForeground(Color.green);	// sets text in the applet window to green    	
		//instantiate components
		myPrompt1 = new Label("This class will add two numbers.");
		myPrompt2 = new Label("Type in the numbers in the spaces.");
		value1 = new TextField(10);	//width of TextField
		value2 = new TextField(10);
		addButton = new Button("Press to add");	//text in Button
   		//Place components in the applet window in the order written left to right, then downwards.
		add (myPrompt1);
		add (myPrompt2);
		add (value1);
		add (value2);
		add (addButton);
		addButton.setBackground(Color.red);	// make the button red
		addButton.setForeground(Color.blue);	// make the text on the button blue
		value1.setBackground(Color.yellow);	// make the TextField yellow
		addButton.addActionListener(this);	// listen to when the button is pressed
	}	// end of init method
 	
   	 public void paint(Graphics g)
	  {
   		 if(num1!=0 && num2!=0)
			g.drawString(num1 + " + " + num2 + " = " + answer,100,100);
	   } // end of paint	
	public void actionPerformed(ActionEvent e)
	{
   		// This method is automatically called when the button is pressed. 
		// Shows conversion of text in TextField to integer – using 2 alternative methods

		num1 = Integer.parseInt(value1.getText());			// Convert text to integer 
		num2 = Integer.valueOf(value2.getText()).intValue();	// Convert text to integer
		answer = num1 + num2;		//Find the sum

		repaint();	// invokes or calls the paint method to display results

	}	// end of actionPerformed
}// end of ComponentDemo class
