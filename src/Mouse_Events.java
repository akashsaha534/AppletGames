import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class Mouse_Events extends Applet implements MouseListener,MouseMotionListener
{
	//int oldX,oldY,newX,newY;
	int x,y;
	String event;
	
	public void init()
	{
		addMouseListener(this);
		addMouseMotionListener(this);
	}
	
	public void paint(Graphics g)
	{
		//g.drawString("Mouse is "+event+" at:"+x+","+y, x, y);
		g.fillOval(x, y, 50, 50);
		//g.drawLine(oldX, oldY, newX, newY);
	}
	
	public void mousePressed(MouseEvent m)
	{
		//oldX=m.getX();
		//oldY=m.getY();
		x=m.getX();
		y=m.getY();
		event="Pressed";
		repaint();
	}
	public void mouseReleased(MouseEvent m)
	{
		//newX=m.getX();
		//newY=m.getY();
		x=m.getX();
		y=m.getY();
		event="Released";
		repaint();
	}
	public void mouseClicked(MouseEvent m)
	{
		//x=m.getX();
		//y=m.getY();
		event="Clicked";
		repaint();
	}
	public void mouseEntered(MouseEvent m)
	{
		showStatus("Mouse entered applet area");
	}
	public void mouseExited(MouseEvent m)
	{
		showStatus("Mouse exited applet area");
	}
	public void mouseMoved(MouseEvent m)
	{
		/*x=m.getX();
		y=m.getY();
		event="Moving";
		repaint();*/
	}
	public void mouseDragged(MouseEvent m)
	{
		x=m.getX();
		y=m.getY();
		event="Dragging";
		repaint();
	}
	public void update(Graphics g)
	{
		paint(g);
	}
}
