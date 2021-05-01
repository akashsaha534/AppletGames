import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Switch_Case extends Applet implements ActionListener
{
	Label nameField;
	TextField nameInput;
	char userInput;
	public void init()
	{
		nameField=new Label("PLS enter any character: ");
		add(nameField);
		nameInput=new TextField(2);
		add(nameInput);
		nameInput.addActionListener(this);
	}
	
	public void paint(Graphics g)
	{
		if(userInput=='\u0000')
		{
			
		}
		else
		{
		switch(userInput)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
				
					g.drawString(userInput+" is a vowel", 20, 50);
					break;
		default:
					g.drawString(userInput+" is a consonant", 20, 50);
		}
		}
	}
	
	public void actionPerformed(ActionEvent a)
	{
		userInput=nameInput.getText().charAt(0);
		//userInput=Character.toLowerCase(userInput);
		repaint();
	}
}
