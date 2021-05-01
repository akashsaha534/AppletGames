import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.applet.*;
import java.util.Timer;
import java.util.TimerTask;

public class Shooting extends Applet implements MouseListener,MouseMotionListener
{
	int x1=50,x2,x3,x4,x5,xvel=2;
	int x,y,point,flag=0;
	Timer timer1,timer2;
	int wall_top=0;
	int wall_bottom=600;
	int wall_left=0;
	int wall_right=1350;
	int line_x1=wall_right/2;
	int line_y1=wall_bottom-50;
	int line_x2=line_x1;
	int line_y2=wall_bottom;
	Font f1,f2;
	//Image offscreenImg;
	//Graphics offscreenG;
	public void init()
	{
		setSize(wall_right,wall_bottom);
		setBackground(Color.yellow);
		f1=new Font("PLAIN",Font.BOLD ,150);
		f2=new Font("PLAIN",Font.BOLD ,50);
		//offscreenImg = createImage(this.size().width,this.size().height);
		//offscreenG = offscreenImg.getGraphics();
		timer1=new Timer();
		timer2=new Timer();
		timer1.schedule(new TimerTask()
		{
			public void run()
			{
				moving();
				repaint();
			}
		},0,10);
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	
	public void moving()
	{
		x1=x1+xvel;
		x2=x1-10;
		x3=x2-10;
		x4=x3-10;
		x5=x4-10;
		if(x1>=wall_right-50)
		{
			xvel=-xvel;
		}
		if(x1<=wall_left+40)
		{
			xvel=-xvel;
		}
		if(line_y1<=100 && line_y1>80 && line_x1>=x1 && line_x1<=x1+10)
		{
			timer1.cancel();
			timer2.cancel();
			point=100;
			flag=1;
		}
		else if(line_y1<=80 && line_y1>60 && line_x1>=x2 && line_x1<=x2+30)
		{
			timer1.cancel();
			timer2.cancel();
			point=80;
			flag=1;
		}
		else if(line_y1<=60 && line_y1>40 && line_x1>=x3 && line_x1<=x3+50)
		{
			timer1.cancel();
			timer2.cancel();
			point=60;
			flag=1;
		}
		else if(line_y1<=40 && line_y1>20 && line_x1>=x4 && line_x1<=x4+70)
		{
			timer1.cancel();
			timer2.cancel();
			point=40;
			flag=1;
		}
		else if(line_y1<=20 && line_y1>0 && line_x1>=x5 && line_x1<=x5+90)
		{
			timer1.cancel();
			timer2.cancel();
			point=20;
			flag=1;
		}
		else if(line_y1<0)
		{
			timer1.cancel();
			timer2.cancel();
			point=0;
			flag=1;
		}
	}
	
	public void arrow()
	{
		line_y1-=5;
		line_y2-=5;
	}
	
	public void paint(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillRect(x1, 0, 10, 100);
		g.setColor(Color.BLACK);
		g.fillRect(x2, 0, 30, 80);
		g.setColor(Color.GREEN);
		g.fillRect(x3, 0, 50, 60);
		g.setColor(Color.MAGENTA);
		g.fillRect(x4, 0, 70, 40);
		g.setColor(Color.PINK);
		g.fillRect(x5, 0, 90, 20);
		g.setColor(Color.BLUE);
		g.drawLine(line_x1, line_y1, line_x2, line_y2);
		if(flag==1)
		{
			g.setFont(f1);
			g.drawString("YOU SCORED: "+point, 10, 300);
			g.setColor(Color.RED);
			g.drawString("GAME OVER", 50, 500);
		}
		else
		{
			g.setFont(f2);
			g.drawString("Left Click", 10, 500);
			g.drawString("To Shoot", 10, 550);
		}
		//g.drawImage(offscreenImg,0,0,this);
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
		//x=m.getX();
		//y=m.getY();
		timer2.schedule(new TimerTask()
		{
			public void run()
			{
				arrow();
				repaint();
			}
		},0,7);
		repaint();
	}
	public void mouseEntered(MouseEvent m)
	{
		//showStatus("Mouse entered applet area");
	}
	public void mouseExited(MouseEvent m)
	{
		//showStatus("Mouse exited applet area");
	}
	public void mouseMoved(MouseEvent m)
	{
		//x=m.getX();
		//y=m.getY();
		//repaint();
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
