/*
 *	Author:  Jay Randeria
 *  Date: 10/11/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your base number?");
		int userNum1 = sc.nextInt();
		System.out.println("What is your exponent number?");
		int userNum2 = sc.nextInt();
		pow(userNum1, userNum2);

		
	}
	
	public static int pow(int num1, int num2) {
		int num3 = 1;
		while (num2 > 0) {
			num3 *= num1;
			num2--;
		}
		System.out.println("Your answer is " + num3);
		return num3;
	}
}
