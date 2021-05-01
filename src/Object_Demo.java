import java.applet.Applet;
import java.awt.*;

	//This class is a development of the house class in introductory exercise 1. 
	// It demonstrates simple Graphics with colors and fonts declared and then instantiated in init.

public class Object_Demo extends Applet 

{
	// This class is similar to the house class except that the init method (another standard 
	// method used in java applets) is used to initialise the colors and fonts used in paint. 
	// To transfer the information from init to paint we must first declare the color and font as 
	// "objects"	 that can be accessed or used in both paint and init.

    Color  color1, color2, color3,color4;		//declare three Color objects
    Font   font1;				//declare a Font object     
    // The init method is used in this case to set some global colours and fonts.
    // Note init is only called once during any running of a program
    public void init() 
   {
	setBackground(Color.cyan);				//background color
	color1 = new Color(255, 0, 0);				//instantiate color1 (red)
	color2 = color1.brighter();				    //instantiate color2
	color3 = new Color(0, 0, 255);		
	color4=new Color(234,123,222);           //instantiate color3 (blue)
	font1 = new Font("SansSerif", Font.ITALIC, 14);	//instantiate font1     } // end init
   }
    //The paint method can now make use of the colours and fonts defined in init(). 
    public void paint (Graphics g) 
    {
	g.setColor(color1);
	g.drawRect(20,20,120,60);
	g.setColor(color2);
	g.fillOval(20,20,120,60);
	g.setColor (color3);
	g.setFont(font1);
	g.drawString("Hello World", 50, 50);
	g.setColor (color4);
	g.fillOval(20, 100, 100, 50);
    }
} //end of program 

