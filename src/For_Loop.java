import java.awt.*;
import java.applet.*;

public class For_Loop extends Applet
{
	int ypos=20;
	public void init()
	{
		setSize(200,300);
	}

	public void paint(Graphics g)
	{
		ypos=20;
		for(char i='a';i<='b';i++)
		{
			g.drawString(""+i,20,ypos);
			ypos=ypos+20;
		}
		/*ypos=20;
		int i=0;
		while(i<=100)
		{
			g.drawString(""+i, 50, ypos);
			ypos=ypos+20;
			i=i+15;
		}*/
	}
}
