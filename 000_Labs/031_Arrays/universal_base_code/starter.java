/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		int[] array = new int[10];
		int i = 0;
		int j = 9;
		while (i < 10) {
			array[i] = j;
			System.out.println(array[i]);
			i++;
			j--;
		}

		
	}
}
