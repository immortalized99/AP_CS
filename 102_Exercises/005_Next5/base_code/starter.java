/*
 *	Author: Jay Randeria
 *  Date: 9/11/24
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int num1 = sc.nextInt();
		
		int num2 = num1 + 1;
		int num3 = num1 + 2;
		int num4 = num1 + 3;
		int num5 = num1 + 4;
		int num6 = num1 + 5;
		int num7 = num1 + num1;
		int num8 = num7 + num1;
		int num9 = num8 + num1;
		int num10 = num9 + num1;
		int num11 = num10 + num1;
		double num12 = num1;
		double num13 = num1 / 100.0;
		double num14 = num1 / 10.0;
		
		System.out.println("Here are the next 5 numbers!");
		System.out.print(num2 + ", ");
		System.out.print(num3 + ", ");
		System.out.print(num4 + ", ");
		System.out.print(num5 + ", ");
		System.out.println(num6);
		
		System.out.println("Here are the next 5 multiples of " + num1 + "!");
		System.out.print(num7 + ", ");
		System.out.print(num8 + ", ");
		System.out.print(num9 + ", ");
		System.out.print(num10 + ", ");
		System.out.println(num11);
		
		System.out.println("Here is " + num1 + " divided by 100!");
		System.out.println(num13);
		
		System.out.println("Here is " + num1 + " divided by 10!");
	}
}
