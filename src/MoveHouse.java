import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class MoveHouse extends Applet implements ActionListener
{
	int		x, y;
	TextField	xvalue, yvalue;
	Label		xprompt,  yprompt;
	Button		moveHouse;
	
	public void init()
	{	
		x = 100;
		y = 100;
		xprompt = new Label("x coordinate");
		yprompt = new Label("y coordinate");
		xvalue = new TextField(5);
		yvalue = new TextField(5);
		moveHouse = new Button("Press to move house");
		
		add(xprompt);
		add(xvalue);
		add(yprompt);
		add(yvalue);
		add(moveHouse);	
		xvalue.addActionListener(this);
		yvalue.addActionListener(this);
		moveHouse.addActionListener(this);

	}	// end of init

public void paint(Graphics g)
	{
		g.setColor(Color.red);	// Draw the roof
		int xs[] = {x, x+60, x+120};
		int ys[] = {y, y-50,y};
		Polygon poly=new Polygon(xs, ys, 3);
		g.fillPolygon(poly);

		g.setColor(Color.blue); 	// Draw the body of house
		g.fillRect(x, y, 120, 120);
		
		g.setColor(Color.white); 	// draw the door
		g.fillRect(x+45, y+60, 30, 60);
		
		g.setColor(Color.yellow); 	// draw sun
		g.fillOval(x+150, y-50, 50, 50);
				
		g.setColor(Color.black); 	//draw chimney
		g.fillRect(x+20, y-45, 10, 30);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		x = Integer.parseInt(xvalue.getText());
		y = Integer.parseInt(yvalue.getText());
		repaint();	// show the new house position in the applet window

	}	// end of actionPerformed
}
