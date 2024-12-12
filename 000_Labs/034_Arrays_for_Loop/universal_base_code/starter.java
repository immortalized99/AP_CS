/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		 int[] array = new int[1001];
		 for (int i = 0; i < array.length; i++) {
		 	int j = (int) (Math.random() * 1000 + 1);
		 	array[i] = j;
		 	System.out.println(array[i]);
		 }
	}
}
