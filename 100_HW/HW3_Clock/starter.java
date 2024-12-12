/*
 *	Author:Jay Randeria
 *  Date:  9/20/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter what day it is (0-6): ");
		int day = sc.nextInt();
		
		if (day == 6 || day == 0) {
			System.out.println("It's the weekend! It's 10AM!");
		} else if (day > 0 && day < 6) {
			System.out.println("It's a weekday! Wake up! It's 7AM!");
		} else {
			System.out.println("You input something not valid!");
		}
	}
}
