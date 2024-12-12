/*
 *	Author:  Jay Randeria
 *  Date: 9/16/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.println("Please enter an integer: ");
		int num1 = sc.nextInt();
		System.out.println("Please enter another integer (bigger than the first): ");
		sc.nextLine();
		int num2 = sc.nextInt();
		System.out.println("Your range is " + num1 + " to " + num2 + ".");
		System.out.println("Here are 5 numbers generated in that range.");
		System.out.print((int) (Math.random() * num1) + num1);
		System.out.print(", ");
		System.out.print((int) (Math.random() * num1) + num1);
		System.out.print(", ");
		System.out.print((int) (Math.random() * num1) + num1);
		System.out.print(", ");
		System.out.print((int) (Math.random() * num1) + num1);
		System.out.print(", ");
		System.out.print((int) (Math.random() * num1) + num1);
	}
}
