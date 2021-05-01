import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEvents_ClickRegions extends Applet implements ActionListener,MouseListener
{
	int x,y;
	AudioClip cats;
	Button play,loop,stop;
	Sound_Object akash;
	public void init()
	{
		cats=getAudioClip(getDocumentBase(),"small-bell-ringing-02.wav");
		play=new Button("PLAY");
		loop=new Button("LOOP");
		stop=new Button("STOP");
		play.addActionListener(this);
		loop.addActionListener(this);
		stop.addActionListener(this);
		play.setBackground(Color.blue);
		loop.setBackground(Color.blue);
		stop.setBackground(Color.blue);
		add(play);
		add(loop);
		add(stop);
		akash=new Sound_Object();
		addMouseListener(this);
	}
	
	public void paint(Graphics g)
	{
		play.setLocation(20, 20);
		play.setSize(50, 50);
		loop.setLocation(80, 20);
		loop.setSize(50, 50);
		stop.setLocation(140,20);
		stop.setSize(50, 50);
		if(x>50 && x<150 && y>50 && y<150)
		{
			g.setColor(Color.red);
			g.fillRect(50, 50, 100, 100);
		}
		else
		{
			g.setColor(Color.green);
			g.fillRect(50, 50, 100, 100);
		}
	}
	
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource()==play)
		{
			play.setBackground(Color.GREEN);
			cats.play();
		}
		else
		{
			play.setBackground(Color.blue);
		}
		if(a.getSource()==loop)
		{
			loop.setBackground(Color.ORANGE);
			cats.loop();
		}
		else
		{
			loop.setBackground(Color.blue);
		}
		if(a.getSource()==stop)
		{
			stop.setBackground(Color.red);
			cats.stop();
		}
		else
		{
			stop.setBackground(Color.blue);
		}
		repaint();
	}
	
	public void mousePressed(MouseEvent m)
	{
		x=m.getX();
		y=m.getY();
		repaint();
	}
	public void mouseReleased(MouseEvent m)
	{
		x=m.getX();
		y=m.getY();
		repaint();
	}
	public void mouseClicked(MouseEvent m)
	{
		x=m.getX();
		y=m.getY();
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
		/*x=m.getX();
		y=m.getY();
		event="Moving";
		repaint();*/
	}
	public void mouseDragged(MouseEvent m)
	{
		x=m.getX();
		y=m.getY();
		repaint();
	}
	/*
	public void update(Graphics g)
	{
		paint(g);
	}
	*/
	
}
