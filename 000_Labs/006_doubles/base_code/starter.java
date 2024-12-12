/*
 *	Author:  Jay Randeri
 *  Date: 9/9/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		double farenheit;
		double celsius;
		
		farenheit = 32.0;
		celsius = (farenheit - 32.0) / (5.0/9.0);
		System.out.print("The Celsius value for " + farenheit + " degrees Farenheit is " + celsius + " degrees."); 
	}
}
