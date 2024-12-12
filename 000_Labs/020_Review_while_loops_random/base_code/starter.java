/*
 *	Author:  Jay Randeria
 *  Date: 10/1/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a number: ");
		int guess = sc.nextInt();
		int secretNum = (int) (Math.random() * 1000) + 1;
		
		while(guess != secretNum) {
			if (guess < secretNum) {
				System.out.println("You're a little to low!");
			} else if (guess > secretNum) {
				System.out.println("You're a little to high!");
			}
			System.out.println("Guess a number: ");
			guess = sc.nextInt();
		}
		System.out.println("You guessed it!");



		
	}
}
