/*
 *	Author:  Jay Randeria
 *  Date: 9/9/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String name = sc.nextLine();
		
		System.out.println("How old are you?");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("What month were you born? (1-12)");
		int month = sc.nextInt();
		sc.nextLine();
		
		System.out.println("What day were you born? (1-31)");
		int day = sc.nextInt();
		sc.nextLine();
		
		System.out.println("What year were you born?");
		int year = sc.nextInt();
		
		System.out.println("If I have a dollar and two quarters, how much money do I have? (0.0-#)");
		double money = sc.nextDouble();
		
		System.out.println("Your name is " + name +" and you were born on " + month + "/" + day + "/" + year + ".");
		System.out.println("You are " + age +" years old!!!");
		System.out.println("You have $" + money +" in your wallet.");
	}
}
