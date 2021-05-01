import java.awt.*;
import java.applet.*;

public class Methods_2 extends Applet
{
	public void init()
	{
		
	}
	
	public void paint(Graphics g)
	{
		int y=20;
		for(int i=0;i<10;i++)
		{
			g.drawString(""+randNo(), 20, y);
			g.drawString(""+randNo(20), 40, y);
			g.drawString(""+randNo(180,10), 60, y);
			y=y+20;
		}
	}
	
	public int randNo()
	{
		return (int)(Math.random()*10+1);
	}
	
	public int randNo(int max)
	{
		return (int)(Math.random()*max+1);
	}
	
	public int randNo(int max,int min)
	{
		return (min+(int)(Math.random()*(max-min)));
	}

}
