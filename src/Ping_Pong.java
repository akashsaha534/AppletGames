import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Ping_Pong extends Applet implements MouseListener,MouseMotionListener
{
	int x1=0,y1,xvel=1,yvel=1;
	int x,y,flag=0;
	Timer timer1,timer2;
	int wall_top=0;
	int wall_bottom=500;
	int wall_left=0;
	int wall_right=500;
	int ball_height=20;
	int ball_width=20;
	public void init()
	{
		setSize(wall_right,wall_bottom);
		setBackground(Color.CYAN);
		timer1=new Timer();
		timer2=new Timer();
		timer1.schedule(new TimerTask()
		{
			public void run()
			{
				repaint();
			}
		},0,20);
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	public void shoot()
	{

		x1=(wall_right/2)-((wall_right/2)-x)/10-ball_width/2;
		y1=wall_bottom-(wall_bottom-y)/10-ball_height;
		timer2.schedule(new TimerTask()
		{
			public void run()
			{
				bounce();
				repaint();
			}
		},0,50);
	}
	
	public void bounce()
	{
		x1=x1-xvel;
		y1=y1-yvel;
		if(x1<=wall_left)
		{
			xvel=-xvel;
		}
		if(y1<=wall_top)
		{
			yvel=-yvel;
		}
		if(x1>=wall_right-ball_width)
		{
			xvel=-xvel;
		}
		if(y1>=wall_bottom-ball_height)
		{
			yvel=-yvel;
		}
	}

	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		if(flag==0)
		g.fillOval((wall_right/2)-(ball_width/2),wall_bottom-ball_height, ball_width,ball_height);
		else
		g.fillOval(x1, y1, ball_width, ball_height);
	}
	
	public void mousePressed(MouseEvent m)
	{
		//oldX=m.getX();
		//oldY=m.getY();
		//x=m.getX();
		//y=m.getY();
		//event="Pressed";
		//repaint();
	}
	public void mouseReleased(MouseEvent m)
	{
		//newX=m.getX();
		//newY=m.getY();
		//x=m.getX();
		//y=m.getY();
		//event="Released";
		//repaint();
	}
	public void mouseClicked(MouseEvent m)
	{
		flag=1;
		x=m.getX();
		y=m.getY();
		shoot();
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
		x=m.getX();
		y=m.getY();
	}
	public void mouseDragged(MouseEvent m)
	{
		/*x=m.getX();
		y=m.getY();
		event="Dragging";
		repaint();
		*/
	}

}
