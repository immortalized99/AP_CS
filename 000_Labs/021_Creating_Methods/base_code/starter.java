/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String sentence = new String(sc.nextLine());
		String sentence2 = new String(sc.nextLine());
		toString(sentence);
		toString(sentence2);
		toStringCombined(sentence, sentence2);
		


		
	}
	
	public static void toString(String sentence) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a sentence!");
		sentence = sc.nextLine();
	}
	
	public static void toStringCombined(String sentence, String sentence2) {
		Scanner sc = new Scanner(System.in);
		sentence = sc.nextLine();
		sentence2 = sc.nextLine();
		System.out.println(toString(sentence) + " " + toString(sentence2));
	}
}
