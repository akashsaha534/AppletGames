import java.awt.*;
import java.applet.*;

public class String_Type extends Applet
{
	String name=new String("Akash Saha");
	int len=name.length();
	int space=name.indexOf(' ');
	String first=name.substring(0,space);
	String last=name.substring(space+1);
	char fir=first.charAt(0);
	char las=last.charAt(0);
	Font akas=new Font("Arial",Font.ITALIC,30);
	public void init()
	{
		setSize(500,300);
	}
	

	public void paint(Graphics g)
	{
		g.setFont(akas);
		g.setColor(Color.red);
		g.drawString(name,20,100);
		g.drawString(first,20,150);
		g.drawString(last,20,200);
	}
}
