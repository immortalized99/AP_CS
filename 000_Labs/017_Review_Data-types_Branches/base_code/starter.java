/*
 *	Author:  Jay Randeria
 *  Date: 9/26/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		String input1 = sc.nextLine();
		
		System.out.println("What is your title? Ex: Slayer of Dragons");
		String input2 = sc.nextLine();
		
		System.out.println("Would you like to be a Wizard, Warrior, or Rogue? "); 
		String input3 = sc.nextLine();
		
		if (input3.equals("wizard")) {
			System.out.println("You've chosen the Wizard! Excelsior!");
		} else if (input3.equals("rogue")) {
			System.out.println("You've chosen the Rogue! How cunning!");
		} else if (input3.equals("warrior")) {
			System.out.println("You've chosen the Warrior! For honor!");
		} else {
			System.out.println("You've decided not to chose a role. Rerun program.");
		}
		
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		
		System.out.println("Strength (1-10): ");
		int input4 = sc.nextInt();
		
		if(input4 <= 10) {
			System.out.println("You have " + (20 - input4) + " left to spend.");
		} else {
			System.out.println("Please input a smaller value. Strength (1-10): ");
		}
		
		System.out.println("Dexterity (1-10): ");
		int input5 = sc.nextInt();
		
		if(input4 <= 10) {
			System.out.println("You have " + (20 - input4 - input5) + " left to spend.");
		} else {
			System.out.println("Please input a smaller value. Dexterity (1-10): ");
		}
		
		System.out.println("Intelligence (1-10): ");
		int input6 = sc.nextInt();
		
		if(input4 <= 10) {
			System.out.println("You have " + (20 - input4 - input5 - input6) + " left to spend.");
		} else {
			System.out.println("Please input a smaller value. Intelligence (1-10): ");
		}
		
		System.out.println("Charisma (1-10): ");
		int input7 = sc.nextInt();
		
		if(input4 <= 10) {
			System.out.println("You have " + (20 - input4 - input5 - input6 - input7) + " left to spend.");
		} else {
			System.out.println("Please input a smaller value. Charisma (1-10): ");
		}
		
		System.out.println();
		System.out.println("--------------------------------------------------");
		System.out.println("You are " + input1 + ", the " + input2 + " of CVHS.");
		System.out.println("You are a " + input3 + " with the following stats!");
		System.out.println("Strength - " + input4);
		System.out.println("Dexterity - " + input5);
		System.out.println("Intelligence - " + input6);
		System.out.println("Charisma - " + input7);
		System.out.println();
		System.out.println("Good luck on your quest " + input1 + "!");
	}
}