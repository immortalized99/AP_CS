/*
 *	Author:  Jay Randeria
 *  Date: 9/24/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Pick a number between 1 - 1000: ");
		int userNum = sc.nextInt();
		
		int compNum = (int) (Math.random() * 999) + 1;
		
		if(compNum == userNum) {
			System.out.println("You guessed the correct number! Congrats!");
		} else if(userNum > compNum) {
			System.out.println("Your number was larger than the number. The number was " + compNum + ".");
		} else if(userNum < compNum) {
			System.out.println("Your number was smaller than the number. The number was " + compNum + ".");
		}
	}
}