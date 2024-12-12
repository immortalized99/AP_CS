/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a name: ");
		String name = new String(sc.nextLine());
		
		System.out.println("How many times would you like this name to be repeated? ");
		int times = sc.nextInt();
		
		int count = 0;
		while(count < times) {
			System.out.println(name);
			count++;
		}
	}
}
