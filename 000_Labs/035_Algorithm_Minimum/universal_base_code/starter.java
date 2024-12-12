/*
 *	Author:  Jay Randeria
 *  Date: 11/7/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int i = (int) (Math.random() * 150 + 51);
		int[] array = new int[i];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int l = 0;
		
		for (int j = 0; j < array.length; j++) {
			int k = (int) (Math.random() * 100 + 1);
			array[j] = k;
			l += k;
			if(array[j] < min) {
				min = array[j];
			} 
			if (array[j] > max) {
				max = array[j];
			}
		}
		
		int m = array.length - 1;
		System.out.println("There are " + m + " elements.");
		System.out.println("The maximum of 1000 random numbers is: " + max);
		System.out.println("The minimum of 1000 random numbers is: " + min);
		l /= array.length - 1;
		System.out.println("The average of 1000 random numbers is: " + l);
	}
}
