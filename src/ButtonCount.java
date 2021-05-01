import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class ButtonCount extends Applet implements ActionListener
{
	Button tester;
	int count;
	
	public void init()
	{
		tester = new Button("Press Here");
		add(tester);
		tester.addActionListener(this);
	}
	
	public void paint(Graphics g)
	{
		g.drawString("Number of button presses is "+ count, 20, 120);
	}
	
	public void actionPerformed(ActionEvent a)
	{
		count++;
		repaint();
	}

}
