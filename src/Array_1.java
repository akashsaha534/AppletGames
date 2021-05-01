import java.applet.*;
import java.awt.*;
public class Array_1 extends Applet
{
	String shoppingList[]=new String[6];
	

	public void init()
	{
		shoppingList[0]="Bread";
		shoppingList[1]="Egg";
		shoppingList[2]="Butter";
		shoppingList[3]="Milk";
		shoppingList[4]="Biscuit";
		shoppingList[5]="Rice";
	}
	
	public void paint(Graphics g)
	{
		for(int i=0;i<shoppingList.length;i++)
		{
			g.drawString(i+1+shoppingList[i], 20, (i+1)*20);
		}
	}
}
