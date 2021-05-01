import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class Timer_1 extends Applet implements Runnable
{
	Timer timer;
	int x1=10;
	int y1=10;
	int x2=50;
	int y2=10;
	int xvel1=3;
	int yvel1=5;
	int xvel2=5;
	int yvel2=2;
	int ball_size=20;
	int rect_size=280;
	int rect_left=0;
	int rect_top=0;
	int rect_right=rect_left+rect_size;
	int rect_bottom=rect_top+rect_size;
	Font f1;
	Thread t;
	public void init()
	{
		setSize(280,280);
		setBackground(Color.CYAN);
		f1=new Font("PLAIN",Font.BOLD ,50);
		setFont(f1);
		setForeground(Color.BLUE);
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		while(true)
		{
		ballBounce();
		repaint();
		try{
		Thread.sleep(20);;
		}
		catch(InterruptedException e)
		{}
		}
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
		
	}
	public void paint(Graphics g)
	{
		g.drawString("sky", 195, 270);
		g.setColor(Color.red);
		g.fillOval(x1, y1, ball_size, ball_size);
		g.setColor(Color.DARK_GRAY);
		g.fillOval(x2, y2, ball_size, ball_size);
	}
}
