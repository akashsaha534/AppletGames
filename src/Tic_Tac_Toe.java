import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.applet.*;
import java.net.*;

public class Tic_Tac_Toe extends Applet implements MouseListener,ActionListener
{
	Button l1,l2,l3,l4,l5,l6,l7,l8,l9,reset;
	int flag=0,a1=0,a2=0,a3=0,a4=0,a5=0,a6=0,a7=0,a8=0,a9=0;
	Font f,f1,f2;
	Color c;
	Image pos1;
	AppletContext context;
	URL url;
	public void init()
	{
		l1=new Button();
		l2=new Button();
		l3=new Button();
		l4=new Button();
		l5=new Button();
		l6=new Button();
		l7=new Button();
		l8=new Button();
		l9=new Button();
		l1.setLabel("1");
		l2.setLabel("2");
		l3.setLabel("3");
		l4.setLabel("4");
		l5.setLabel("5");
		l6.setLabel("6");
		l7.setLabel("7");
		l8.setLabel("8");
		l9.setLabel("9");
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		add(l5);
		add(l6);
		add(l7);
		add(l8);
		add(l9);
		l1.addActionListener(this);
		l2.addActionListener(this);
		l3.addActionListener(this);
		l4.addActionListener(this);
		l5.addActionListener(this);
		l6.addActionListener(this);
		l7.addActionListener(this);
		l8.addActionListener(this);
		l9.addActionListener(this);
		reset=new Button("RESET");
		add(reset);
		reset.addActionListener(this);
		setSize(1200,600);
		setBackground(Color.BLACK);
		f=new Font("PLAIN",Font.BOLD ,200);
		f1=new Font("PLAIN",Font.BOLD ,50);
		f2=l1.getFont();
		c=l1.getBackground();
		//pos1=getImage(this.getDocumentBase(),"sky.jpg");
		context = this.getAppletContext();
	      String audioURL = this.getParameter("image");
	      if(audioURL == null)
	      {
	         audioURL = "sky.jpg";
	      }
		try
	      {
	         url = new URL(this.getDocumentBase(), audioURL);
	         pos1 = context.getImage(url);
	      }catch(MalformedURLException e)
	      {
	         e.printStackTrace();
	         // Display in browser status bar
	         context.showStatus("Could not load image!");
	      }
	}
	public void paint(Graphics g)
	{
		g.drawImage(pos1, 990,467,this);
		l1.setLocation(0, 0);
		l1.setSize(200, 200);
		l2.setLocation(201, 0);
		l2.setSize(200, 200);
		l3.setLocation(402, 0);
		l3.setSize(200, 200);
		l4.setLocation(0, 201);
		l4.setSize(200, 200);
		l5.setLocation(201, 201);
		l5.setSize(200, 200);
		l6.setLocation(402, 201);
		l6.setSize(200, 200);
		l7.setLocation(0, 402);
		l7.setSize(200, 200);
		l8.setLocation(201, 402);
		l8.setSize(200, 200);
		l9.setLocation(402, 402);
		l9.setSize(200, 200);
		reset.setSize(170, 150);
		reset.setFont(f1);
		reset.setLocation(700, 300);
		
	}
	public void actionPerformed(ActionEvent a)
	{
		if(flag%2==0)
		{
			if(a.getSource()==l1)
			{
				if(a1==0)
				{
				//l1.setBackground(Color.blue);
					l1.setFont(f);
					l1.setLabel("X");
				a1++;
				flag++;
				}
			}
			if(a.getSource()==l2)
			{
				if(a2==0)
				{
				//l2.setBackground(Color.blue);
					l2.setFont(f);
					l2.setLabel("X");
				a2++;
				flag++;
				}
			}
			if(a.getSource()==l3)
			{
				if(a3==0)
				{
				//l3.setBackground(Color.blue);
					l3.setFont(f);
					l3.setLabel("X");
				a3++;
				flag++;
				}
			}
			if(a.getSource()==l4)
			{
				if(a4==0)
				{
				//l4.setBackground(Color.blue);
				l4.setFont(f);
				l4.setLabel("X");
				a4++;
				flag++;
				}
			}
			if(a.getSource()==l5)
			{
				if(a5==0)
				{
				//l5.setBackground(Color.blue);
				l5.setFont(f);
				l5.setLabel("X");
				a5++;
				flag++;
				}
			}
			if(a.getSource()==l6)
			{
				if(a6==0)
				{
				//l6.setBackground(Color.blue);
				l6.setFont(f);
				l6.setLabel("X");
				a6++;
				flag++;
				}
			}
			if(a.getSource()==l7)
			{
				if(a7==0)
				{
				//l7.setBackground(Color.blue);
				l7.setFont(f);
				l7.setLabel("X");
				a7++;
				flag++;
				}
			}
			if(a.getSource()==l8)
			{
				if(a8==0)
				{
				//l8.setBackground(Color.blue);
				l8.setFont(f);
				l8.setLabel("X");
				a8++;
				flag++;
				}
			}
			if(a.getSource()==l9)
			{
				if(a9==0)
				{
				//l9.setBackground(Color.blue);
				l9.setFont(f);
				l9.setLabel("X");
				a9++;
				flag++;
				}
			}
		}
		else
		{
			if(a.getSource()==l1)
			{
				if(a1==0)
				{
				//l1.setBackground(Color.RED);
				l1.setFont(f);
				l1.setLabel("O");
				a1++;
				flag++;
				}
			}
			if(a.getSource()==l2)
			{
				if(a2==0)
				{
				//l2.setBackground(Color.RED);
				l2.setFont(f);
				l2.setLabel("O");
				a2++;
				flag++;
				}
			}
			if(a.getSource()==l3)
			{
				if(a3==0)
				{
				//l3.setBackground(Color.RED);
				l3.setFont(f);
				l3.setLabel("O");
				a3++;
				flag++;
				}
			}
			if(a.getSource()==l4)
			{
				if(a4==0)
				{
				//l4.setBackground(Color.RED);
				l4.setFont(f);
				l4.setLabel("O");
				a4++;
				flag++;
				}
			}
			if(a.getSource()==l5)
			{
				if(a5==0)
				{
				//l5.setBackground(Color.RED);
				l5.setFont(f);
				l5.setLabel("O");
				a5++;
				flag++;
				}
			}
			if(a.getSource()==l6)
			{
				if(a6==0)
				{
				//l6.setBackground(Color.RED);
				l6.setFont(f);
				l6.setLabel("O");
				a6++;
				flag++;
				}
			}
			if(a.getSource()==l7)
			{
				if(a7==0)
				{
				//l7.setBackground(Color.RED);
				l7.setFont(f);
				l7.setLabel("O");
				a7++;
				flag++;
				}
			}
			if(a.getSource()==l8)
			{
				if(a8==0)
				{
				//l8.setBackground(Color.RED);
				l8.setFont(f);
				l8.setLabel("O");
				a8++;
				flag++;
				}
			}
			if(a.getSource()==l9)
			{
				if(a9==0)
				{
				//l9.setBackground(Color.RED);
				l9.setFont(f);
				l9.setLabel("O");
				a9++;
				flag++;
				}
			}
		}
		
		if(l1.getLabel()==l2.getLabel()&&l1.getLabel()==l3.getLabel())
		{
			l1.setBackground(Color.MAGENTA);
			l2.setBackground(Color.MAGENTA);
			l3.setBackground(Color.MAGENTA);
		}
		else if(l4.getLabel()==l5.getLabel()&&l5.getLabel()==l6.getLabel())
		{
			l4.setBackground(Color.MAGENTA);
			l5.setBackground(Color.MAGENTA);
			l6.setBackground(Color.MAGENTA);
		}
		else if(l7.getLabel()==l8.getLabel()&&l8.getLabel()==l9.getLabel())
		{
			l7.setBackground(Color.MAGENTA);
			l8.setBackground(Color.MAGENTA);
			l9.setBackground(Color.MAGENTA);
		}
		else if(l1.getLabel()==l4.getLabel()&&l4.getLabel()==l7.getLabel())
		{
			l4.setBackground(Color.MAGENTA);
			l1.setBackground(Color.MAGENTA);
			l7.setBackground(Color.MAGENTA);
		}
		else if(l2.getLabel()==l5.getLabel()&&l5.getLabel()==l8.getLabel())
		{
			l2.setBackground(Color.MAGENTA);
			l5.setBackground(Color.MAGENTA);
			l8.setBackground(Color.MAGENTA);
		}
		else if(l3.getLabel()==l6.getLabel()&&l6.getLabel()==l9.getLabel())
		{
			l3.setBackground(Color.MAGENTA);
			l9.setBackground(Color.MAGENTA);
			l6.setBackground(Color.MAGENTA);
		}
		else if(l1.getLabel()==l5.getLabel()&&l5.getLabel()==l9.getLabel())
		{
			l1.setBackground(Color.MAGENTA);
			l5.setBackground(Color.MAGENTA);
			l9.setBackground(Color.MAGENTA);
		}
		else if(l3.getLabel()==l5.getLabel()&&l5.getLabel()==l7.getLabel())
		{
			l3.setBackground(Color.MAGENTA);
			l5.setBackground(Color.MAGENTA);
			l7.setBackground(Color.MAGENTA);
		}

		
		/*
		if(l1.getBackground()==l2.getBackground()&&l1.getBackground()==l3.getBackground())
		{
			l1.setBackground(Color.MAGENTA);
			l2.setBackground(Color.MAGENTA);
			l3.setBackground(Color.MAGENTA);
		}
		else if(l4.getBackground()==l5.getBackground()&&l5.getBackground()==l6.getBackground())
		{
			l4.setBackground(Color.MAGENTA);
			l5.setBackground(Color.MAGENTA);
			l6.setBackground(Color.MAGENTA);
		}
		else if(l7.getBackground()==l8.getBackground()&&l8.getBackground()==l9.getBackground())
		{
			l7.setBackground(Color.MAGENTA);
			l8.setBackground(Color.MAGENTA);
			l9.setBackground(Color.MAGENTA);
		}
		else if(l1.getBackground()==l4.getBackground()&&l4.getBackground()==l7.getBackground())
		{
			l4.setBackground(Color.MAGENTA);
			l1.setBackground(Color.MAGENTA);
			l7.setBackground(Color.MAGENTA);
		}
		else if(l2.getBackground()==l5.getBackground()&&l5.getBackground()==l8.getBackground())
		{
			l2.setBackground(Color.MAGENTA);
			l5.setBackground(Color.MAGENTA);
			l8.setBackground(Color.MAGENTA);
		}
		else if(l3.getBackground()==l6.getBackground()&&l6.getBackground()==l9.getBackground())
		{
			l3.setBackground(Color.MAGENTA);
			l9.setBackground(Color.MAGENTA);
			l6.setBackground(Color.MAGENTA);
		}
		else if(l1.getBackground()==l5.getBackground()&&l5.getBackground()==l9.getBackground())
		{
			l1.setBackground(Color.MAGENTA);
			l5.setBackground(Color.MAGENTA);
			l9.setBackground(Color.MAGENTA);
		}
		else if(l3.getBackground()==l5.getBackground()&&l5.getBackground()==l7.getBackground())
		{
			l3.setBackground(Color.MAGENTA);
			l5.setBackground(Color.MAGENTA);
			l7.setBackground(Color.MAGENTA);
		}
		*/
		if(a.getSource()==reset)
		{
			l1.setBackground(c);
			l2.setBackground(c);
			l3.setBackground(c);
			l4.setBackground(c);
			l5.setBackground(c);
			l6.setBackground(c);
			l7.setBackground(c);
			l8.setBackground(c);
			l9.setBackground(c);
			l1.setFont(f2);
			l1.setLabel("1");
			l2.setFont(f2);
			l2.setLabel("2");
			l3.setFont(f2);
			l3.setLabel("3");
			l4.setFont(f2);
			l4.setLabel("4");
			l5.setFont(f2);
			l5.setLabel("5");
			l6.setFont(f2);
			l6.setLabel("6");
			l7.setFont(f2);
			l7.setLabel("7");
			l8.setFont(f2);
			l8.setLabel("8");
			l9.setFont(f2);
			l9.setLabel("9");
			flag=0;a1=0;a2=0;a3=0;a4=0;a5=0;a6=0;a7=0;a8=0;a9=0;
		}
		repaint();
	}
	public void mousePressed(MouseEvent m)
	{
		
		
		repaint();
	}
	public void mouseReleased(MouseEvent m)
	{
		
		repaint();
	}
	public void mouseClicked(MouseEvent m)
	{
		
		repaint();
	}
	public void mouseEntered(MouseEvent m)
	{
		
	}
	public void mouseExited(MouseEvent m)
	{
		
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
		
		repaint();
	}
	/*
	public void update(Graphics g)
	{
		paint(g);
	}
	*/
	
}
