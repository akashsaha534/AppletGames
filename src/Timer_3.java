import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Timer;
import java.util.TimerTask;

public class Timer_3 extends Applet implements KeyListener,MouseMotionListener
{
	Timer timer;
	int ball_size=50;
	int rect_width=1350;
	int rect_height=600;
	int rect_left=0;
	int rect_top=0;
	int rect_right=rect_left+rect_width;
	int rect_bottom=rect_top+rect_height;
	int wall_left=rect_left+20;
	int wall_right=rect_right-20;;
	int wall_top=rect_top;
	int wall_bottom=rect_bottom;
	Font myFont,myFont1;
	int speed=15;
	int n=0;
	int p1=0;
	int p2=0;
	int x1=30;
	int y1=10;
	int x2=rect_left;
	int y2=rect_bottom/2;
	int x3=rect_right-20;
	int y3=rect_bottom/2;
	int xvel1=3;
	int yvel1=5;
	//int xvel2=5;
	//int yvel2=2;
	
	public void init()
	{
		myFont = new Font("TimesRoman", Font.BOLD, 38);
		myFont1 = new Font("TimesRoman", Font.BOLD, 100);
		setSize(1350,600);
		setBackground(Color.GREEN);
		addKeyListener(this);
		this.requestFocus();
		addMouseMotionListener(this);
		timer=new Timer();
		timer.schedule(new TimerTask()
		{
			public void run()
			{
				ballBounce();
				repaint();
			}
		}, 0, speed);
	}
	public void ballBounce()
	{
		x1=x1+xvel1;
		y1=y1+yvel1;
		if(y1<=wall_bottom-80)
		y3=y1;
		if(x1<=wall_left)
		{
			if(y1+ball_size/2>=y2 && y1+ball_size/2<=y2+80)
			{
				xvel1=-xvel1+1;
				p1++;
			}
			else
			{
				timer.cancel();
				n=2;
			}
		}
		if(y1<=rect_top)
		{
			yvel1=-yvel1;
		}
		if(x1>=wall_right-ball_size)
		{
			if(y1+ball_size/2>=y3 && y1+ball_size/2<=y3+80)
			{
				xvel1=-xvel1;
				p2++;
			}
			else
			{
				timer.cancel();
				n=1;
			}
		}
		if(y1>=rect_bottom-ball_size)
		{
			yvel1=-yvel1;
		}
		
	}
	public void paint(Graphics g)
	{
		g.drawRect(0, 0, 1350, 600);
		g.setColor(Color.BLUE);
		g.drawLine(wall_left, wall_top, wall_left, wall_bottom);
		g.drawLine(wall_right, wall_top, wall_right, wall_bottom);
		g.setColor(Color.red);
		g.fillOval(x1, y1, ball_size, ball_size);
		g.setColor(Color.magenta);
		g.fillRect(x2, y2, 20, 80);
		g.fillRect(x3, y3, 20, 80);
		g.setFont(myFont);
		//g.drawString(""+p1, 80, 30);
		//g.drawString(""+p2, 190, 30);
		if(n==1)
		{
			g.setFont(myFont1);
			g.drawString("!!!Winner!!!", 150,200);
			//g.drawString("Player "+n, 60, 200);
		}
		else if(n==2)
		{
			g.setFont(myFont1);
			g.drawString("!!!Losser!!!", 150,200);
			//g.drawString("Player "+n, 60, 200);
		}
	}
	
	public void keyPressed(KeyEvent k)
	{
		if(k.getKeyCode()==k.VK_W)
		{
			if(y2>wall_top)
			y2=y2-15;
		}
		if(k.getKeyCode()==k.VK_S)
		{
			if(y2+40<wall_bottom)
			y2=y2+15;
		}
		/*if(k.getKeyCode()==k.VK_UP)
		{
			if(y3>wall_top)
			y3=y3-15;
		}
		if(k.getKeyCode()==k.VK_DOWN)
		{
			if(y3+40<wall_bottom)
			y3=y3+15;
		}*/
		repaint();
	}
	public void keyReleased(KeyEvent k)
	{
		if(k.getKeyCode()==k.VK_W)
		{
			if(y2>wall_top)
			y2=y2-10;
		}
		if(k.getKeyCode()==k.VK_S)
		{
			if(y2+40<wall_bottom)
			y2=y2+10;
		}
		/*if(k.getKeyCode()==k.VK_UP)
		{
			if(y3>wall_top)
			y3=y3-10;
		}
		if(k.getKeyCode()==k.VK_DOWN)
		{
			if(y3+40<wall_bottom)
			y3=y3+10;
		}*/
		repaint();
	}
	
	public void keyTyped(KeyEvent k)
	{
		
	}
	public void mousePressed(MouseEvent m)
	{
	
	}
	public void mouseReleased(MouseEvent m)
	{
		
	}
	public void mouseClicked(MouseEvent m)
	{
		
	}
	public void mouseEntered(MouseEvent m)
	{
		
	}
	public void mouseExited(MouseEvent m)
	{
		
	}
	public void mouseMoved(MouseEvent m)
	{
		if(m.getY()<=wall_bottom-80)
		y2=m.getY();
		
	}
	public void mouseDragged(MouseEvent m)
	{
		
	}
}
