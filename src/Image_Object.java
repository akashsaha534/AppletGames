import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Image_Object extends Applet implements ActionListener
{
	Image poster1,poster2;
	Button show1,show2;
	int action;
	
	public void init()
	{
		setSize(300,300);
		poster1=getImage(getDocumentBase(),"aaaa.jpg");
		poster2=getImage(getDocumentBase(),"20140421_151212.jpg");
		show1=new Button("SHOW Image 1");
		show2=new Button("SHOW Image 2");
		add(show1);
		add(show2);
		show1.addActionListener(this);
		show2.addActionListener(this);
	}
	
	public void paint(Graphics g)
	{
		int width=poster1.getWidth(this);
		int height=poster1.getHeight(this);
		if(action==1)
		{
		g.drawImage(poster1, 20, 40, this);
		}
		else if(action==2)
		g.drawImage(poster2,20,40,width,height*2,this);
		else
		{
			
		}
	}
	
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource()==show1)
			action=1;
		else if(a.getSource()==show2)
			action=2;
		else
		{
			action=0;
		}
		repaint();
	}

}
