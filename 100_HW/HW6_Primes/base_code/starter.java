/*
 *	Author:  Jay Randeria
 *  Date:  10/10/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number and we'll print out every prime until that number: ");
		int input = sc.nextInt();
		printPrimes(input);
	}
	
	public static boolean checkPrime(int input) {
		int count = 2;
		
		while (count < input) {
			if (input % count != 0) {
				count++;
				return true;
			} else {
				count++;
				return false;
			}
		}
	}
	
	public static void printPrimes(int input) {
		int count = 2;
		
		while (count < input) {
			if (checkPrime(input) == true) {
				System.out.println(input);
				count++;
			} else {
				count++;
			}
		}
	}
}
