import java.applet.*;
import java.awt.*;
	// This simple class introduces some ideas about char and String variables. 
public class Strings extends Applet 
{  	char ch;	// a char variable can be declared
	char letter = 'X';	// a char variable can be declared and given an initial value
	char other = '#';	
 	String 	s1, s2, s3, s4;	// Strings can be declared and not instantiated
 	String	s5 = "How are you .";		//Strings can be instantiated when declared
	String	s6 = "What are we testing here?";
	String 	s7 = "   How many spaces are in this text?     ";
	int num = 6, x = 0;
	boolean answer;
	
	public void init() 
 	{
		ch = '%'; 	// Setting values in a char variable
		// Instantiating a String using a number of String constructors
		s1 = new String ();	//null string
		s2 = new String ("Hello");	//one way to instantiate with a value
		s3 = new String (s2);	//another way to initialise
		s4 = "    Hello     ";	//still another way.
	}	// end of init
 	public void paint (Graphics g)
	{
		//The following line illustrates concatenation of Strings with +
			g.drawString(s2 + " What a nice day.", 25,25);
			g.drawString("s2 equals " + s2, 25, 50);
		//The following line illustrates the String method length
			g.drawString("Length of s2 is " + s2.length() + " characters", 25,75);	
		// toUppercase and toLowercase methods. In these examples, we have not declared a 
 		//  name for the new strings, so that the new string is lost as soon as the drawString 
 		//  method is over.
			g.drawString("s2 to UpperCase is: " + s2.toUpperCase(), 25, 100);
			g.drawString("s2 to LowerCase is: " + s2.toLowerCase(), 25,125);
		//Trim removes the white spaces on either side of the string.
		//In this example (and the next) we have named the new strings
		//so that the new string remains after the drawString method.
		s1 = s4.trim();
		g.drawString("The original s4 is:" + s4, 25, 150);
		g.drawString("After trimming s4 is:" + s1, 25,175);
	
		//replace changes characters
		//s2 = s2.replace('H', 'h');
		g.drawString("s2 after a replace is  " + s1, 25, 200);
		ch = s4.charAt(num);
		// use of substring method
				s2 = s1.substring(1,4);
				g.drawString("s2 = s1.substring(1,4) returns " + s2, 25, 225) ;
				// but substring(2,2) will return an empty string
				s2 = s1.substring(2,2) ;
				g.drawString("s2 = s1.substring(2,2) returns " + s2, 25, 250) ;

				// taking a String s6 = "What are we testing here?" then
				// Note that to put quotes “ in a String and display them we use 
				//the escape character \ with the “  like \” as seen in the lines below
				g.drawString("With the String  s6 = What are we testing here?", 25, 275) ;
				
				answer = s6.startsWith("Whi"); 
				g.drawString(" answer = s6.startsWith(\"Whi\") returns " + answer, 25, 300) ;
				answer = s6.endsWith("?"); 
				g.drawString("answer = s6.endsWith(\"?\") returns " + answer, 25, 325) ;
			
				// showing use of indexOf
				x = "Woolloomooloo".indexOf("loo", 10);
				g.drawString("x = \"Woolloomooloo\".indexOf(\"loo\", 10) returns " + x + " but ", 25, 350) ;
				// but x = "Woolloomooloo".indexOf("loo", 12);
				x = "Woolloomooloo".indexOf("loo", 12);
			    g.drawString("x = \"Woolloomooloo\".indexOf(\"loo\", 12) returns " + x , 25, 375) ;
			    g.drawString(" which says the substring \"loo\" was not found after position 12",30, 400);
			} // end paint
		}	// end of Prac4
