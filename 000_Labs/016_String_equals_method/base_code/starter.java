/*
 *	Author:  Jay Randeria
 *  Date: 9/24/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Would you like to be a Wizard, Warrior, or Rogue? "); 
		String input = sc.nextLine();
		
		if (input.equals("wizard")) {
			System.out.println("You've chosen the Wizard! Excelsior!");
		} else if (input.equals("rogue")) {
			System.out.println("You've chosen the Rogue! How cunning!");
		} else if (input.equals("warrior")) {
			System.out.println("You've chosen the Warrior! For honor!");
		} else {
			System.out.println("You've decided not to chose a role. Rerun program.");
		}
	}
}
