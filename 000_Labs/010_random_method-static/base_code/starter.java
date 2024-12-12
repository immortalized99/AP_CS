/*
 *	Author:  Jay Randeria
 *  Date: 9/19/24
*/

import java.util.Scanner;
import java.util.Random;

class starter{
	public static void main(String args[]) {
		int num1 = (int) (Math.random() * 10);
		System.out.println("A number between 0 - 9: " + num1);
		
		int num2 = (int) (Math.random() *  101);
		System.out.println("A number between 0 - 100: " + num2);
		
		double num3 = (Math.random() * 1) + 2.5;
		System.out.println("A number between 2.5 and 3.5: " + num3);
		
		double num4 = (Math.random() * 575) + 14;
		System.out.println("A number between 14 and 575: " + num4);
	} 
}
	
