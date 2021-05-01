import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class Timer_2 extends Applet implements MouseListener,MouseMotionListener
{
	Timer timer;
	int x1=10;
	int y1=10;
	int x2=0;
	int y2=0;
	int xvel1=3;
	int yvel1=5;
	//int xvel2=5;
	//int yvel2=2;
	int ball_size=20;
	int rect_size=280;
	int rect_left=0;
	int rect_top=0;
	int rect_right=rect_left+rect_size;
	int rect_bottom=rect_top+rect_size;
	
	public void init()
	{
		setSize(280,280);
		setBackground(Color.CYAN);
		addMouseListener(this);
		addMouseMotionListener(this);
		timer=new Timer();
		timer.schedule(new TimerTask()
		{
			public void run()
			{
				ballBounce();
				repaint();
			}
		}, 0, 100);
	}
	public void ballBounce()
	{
		x1=x1+xvel1;
		y1=y1+yvel1;
		if(x1<=rect_left)
		{
			xvel1=-xvel1;
		}
		if(y1<=rect_top)
		{
			yvel1=-yvel1;
		}
		if(x1>=rect_right-ball_size)
		{
			xvel1=-xvel1;
		}
		if(y1>=rect_bottom-ball_size)
		{
			yvel1=-yvel1;
		}
		/*
		x2=x2+xvel2;
		y2=y2+yvel2;
		if(x2<=rect_left)
		{
			xvel2=-xvel2;
		}
		if(y2<=rect_top)
		{
			yvel2=-yvel2;
		}
		if(x2>=rect_right-ball_size)
		{
			xvel2=-xvel2;
		}
		if(y2>=rect_bottom-ball_size)
		{
			yvel2=-yvel2;
		}
		*/
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.fillOval(x1, y1, ball_size, ball_size);
		//g.fillOval(x2, y2, ball_size, ball_size);
		g.setColor(Color.magenta);
		g.fillRect(x2, y2, 20, 20);
	}
	
	public void mousePressed(MouseEvent m)
	{
		
	}
	public void mouseReleased(MouseEvent m)
	{
		
	}
	public void mouseClicked(MouseEvent m)
	{
		x2=m.getX();
		y2=m.getY();
		if(x1>=x2-ball_size && x1<=x2+20 && y1>=y2-ball_size && y1<=y2+20)
			timer.cancel();
		repaint();
	}
	public void mouseMoved(MouseEvent m)
	{
		x2=m.getX();
		y2=m.getY();
		repaint();
	}
	public void mouseDragged(MouseEvent m)
	{
		
	}
	public void mouseEntered(MouseEvent m)
	{
		
	}
	public void mouseExited(MouseEvent m)
	{
		
	}
}
