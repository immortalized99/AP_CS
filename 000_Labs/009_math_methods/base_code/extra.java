/*
    Author: Jay Randeria
    Date: 9/11/24
*/
import java.util.Scanner;

class extra {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a double:");
		double num1 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Please enter another double:");
		double num2 = sc.nextDouble();
		
		System.out.println();
		System.out.println("Maximum number of x and y is " + Math.max(num1, num2));
		System.out.println("Square root of y is " + Math.sqrt(num2));
		System.out.println("Power of x and y is " + Math.pow(num1, num2));
	}
}