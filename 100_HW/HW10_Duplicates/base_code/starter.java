/*
 *	Author: Jay Randeria
 *  Date: 11/8/24
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int[] array = new int[20];
		int target = (int) (Math.random() * 10 + 1);
		int total = 0;
		int l;
		int num;
		
		System.out.println("----------------------------------------------------");
		System.out.println("These are the 20 numbers");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 10 + 1);
			System.out.print(array[i] + " ");
		}
		
		System.out.println("");
		System.out.println("----------------------------------------------------");
		System.out.println("The random number to look for is " + target);
		
		for (int j = 0; j < array.length; j++) {
			if (array[j] == target) {
				System.out.println("Duplicate found at index " + (j + 1));
				total++;
			}
		}
		
		System.out.println("Total number of duplicates found for " + target + " is " + total);
		System.out.println("----------------------------------------------------");
		System.out.println("Looking for two in a row:");
		
		for (l = 1; l < array.length; l++) {
			if (array[l] == array[(l - 1)]) {
				System.out.println("Two in a row found at indexes " + (l - 1) + " and " + l +  ". The number is " + array[(l-1)] + ".");
			}
		}
	}
}
