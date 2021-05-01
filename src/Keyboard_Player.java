import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Keyboard_Player extends Applet implements KeyListener
{
	int x=200,y=200;
	public void init()
	{
		this.requestFocus();
		addKeyListener(this);
		setSize(400,400);
	}
	public void paint(Graphics g)
	{
		g.drawRect(20, 20, 360, 360);
		g.fillOval(x, y, 50, 50);
	}
	public void keyPressed(KeyEvent k)
	{
		if(k.getKeyCode()==k.VK_UP)
		{
			if(y>20)
			{
				y=y-10;
			}
		}
		if(k.getKeyCode()==k.VK_DOWN)
		{
			if(y<=320)
			{
				y=y+10;
			}
		}
		if(k.getKeyCode()==k.VK_LEFT)
		{
			if(x>20)
			{
				x=x-10;
			}
		}
		if(k.getKeyCode()==k.VK_RIGHT)
		{
			if(x<=320)
			{
				x=x+10;
			}
		}
		repaint();
	}
	public void keyReleased(KeyEvent k)
	{
		
	}
	public void keyTyped(KeyEvent k)
	{
		
	}

}
