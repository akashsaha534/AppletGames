import java.awt.*;
import java.applet.*;

// Program to draw a house
public class House extends Applet 
{	
	public void paint(Graphics g) 
	{
		g.setColor(Color.cyan);
		g.fillRect(0, 0, 400, 400);
		g.setColor(Color.green);
		g.fillRect(0,200, 400, 200);
		g.setColor(Color.WHITE);
		g.fillOval(50, 50, 50, 40);
		g.fillOval(70, 50, 40, 35);
		g.fillOval(40, 50, 30, 30);
		// Draw the roof
		g.setColor(Color.magenta);
		int xs[] = {100,160,220};
		int ys[] = {100,50,100};
		Polygon poly=new Polygon(xs,ys,3);
		g.fillPolygon(poly);
		
		// Draw the body of house
		g.setColor(Color.blue);
		g.fillRect(100,100,120,120);
		
		// draw the door
		g.setColor(Color.black);
		g.fillRect(145,160,30,60);
		
		//draw the windows
		g.setColor(Color.GREEN);
		g.fillRect(110, 140, 30, 40);
		g.fillRect(180, 140, 30, 40);
		// draw sun
		g.setColor(Color.yellow);
		g.fillOval(240,30,50,50);
		//draw chimney
		g.setColor(Color.black);
		g.fillRect(120,55,10,30);
	}
}
