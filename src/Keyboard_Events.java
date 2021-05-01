import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Keyboard_Events extends Applet implements KeyListener
{
	int num=0;
	char key=' ';
	String str1="";
	String str2="";
	String str3="";
	String str4="";
	public void init()
	{
		this.requestFocus();
		addKeyListener(this);
		setSize(400,400);
	}
	public void paint(Graphics g)
	{
		g.drawString("Number of keys pressed: "+num, 20, 20);
		g.drawString("Character key pressed: "+key, 20, 40);
		g.drawString("Key pressed is: "+str1, 20, 60);
		g.drawString("Key released is: "+str4, 20, 80);
		g.drawString("Action key pressed: "+str2, 20, 100);
		g.drawString(str3, 20, 120);
	}
	public void keyPressed(KeyEvent k)
	{
		num++;
		str1=k.getKeyText(k.getKeyCode());
		if(k.getKeyCode()==k.VK_UP)
		{
			str2="UP Key";
		}
		if(k.getKeyCode()==k.VK_ENTER)
		{
			str2="ENTER Key";
		}
		repaint();
	}
	public void keyReleased(KeyEvent k)
	{
		str4=k.getKeyText(k.getKeyCode());
		repaint();
	}
	public void keyTyped(KeyEvent k)
	{
		key=k.getKeyChar();
		if(key=='x')
		{
			str3="Lower case x is pressed";
		}
		repaint();
	}

}
