/*
 *	Author:  Jay Randeria
 *  Date: 12/4/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence.");
		String sentence = sc.nextLine();
		String result = "";
		String arr[] = new String[sentence.length()];
		
		for (int i = 0; i < sentence.length(); i++) {
			if (sentence.indexOf(" ") == -1) {
				break;
			} else {
				int space = sentence.indexOf(" ");
				String word = sentence.substring(0, space);
				sentence = sentence.substring(space + 1);
				arr[i] = word;
			}
		}
		System.out.println(sentence.length());
		System.out.print(sentence + " ");
		printsArrayBack(arr);
	}
	public static void printsArrayBack(String[] arr){
		for(int i = arr.length - 1; i >= 0; i--){
			if(arr[i] != null) {
				System.out.print(arr[i] + " ");
			}
        }
	}
}
