import java.applet.Applet;
import java.awt.*; 
// Prac3 demonstrates the use of integer and real variables in a Java Applet

public class Prac3 extends Applet 
{
 	int n, m, sum, diff, prod, quot, remainder;	 //global declaration of int variables
	double x =13.5, y = 2.2, total, differ, mult, quotient; // global declaration of double   
 								//variables
								// variables can be assigned a value here too

	public void init() 
	{
		int localSum;	//local declaration of an int variable.
		n = 25;	//initialise values of n and m.
		m = 6;
		localSum = n + m;		//These calculations could be carried out in paint() or in init.
		sum = localSum;	
		diff = n - m;		//Because the variables have been declared globally, the values
		prod = n*m;		//can be transferred between the methods paint() and init().
		quot = n/m;

		remainder = n%m;
	 	total = x + y;		// Calculations involving double variables
		differ = x - y;
		mult = x * y;
		quotient = x / y;
	}	// End of init

	public void paint (Graphics g)
    {
		g.drawString("The original values are " + n + " and " + m, 25, 25);
		g.drawString("The sum is " + sum, 25, 50);
		g.drawString("The difference is " + diff, 25, 75);
		g.drawString("The product is " + prod, 25, 100);
		g.drawString("The quotient is " + quot, 25, 125);
		g.drawString("The remainder is " + remainder, 25, 150);
    }	// End of paint
}	// End of Prac3

