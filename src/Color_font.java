import java.awt.*;
import java.applet.*;

public class Color_font extends Applet
{
	Color skyBlue;
	Font a;
	public void init()
	{
		setSize(500,300);
		skyBlue=new Color(23,234,32);
		a=new Font("PLAIN",Font.BOLD ,50);
	}
	
	public void paint(Graphics g)
	{
		g.setFont(a);
		g.setColor(skyBlue);
		g.drawString("Akash",20,50);
	}
}
