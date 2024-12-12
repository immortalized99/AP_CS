/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	
	public static void toStringArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	public static int getArrayAverage(int[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total += a[i];
		}
		total = total / (a.length + 1);
		System.out.println("The average of 100 random numbers is: " + total);
		return total;
	}
	
	public static void getArrayMax(int[] a) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		
		System.out.println("The maximum of 100 random numbers is: " + max);
	}
	
	public static void getArrayMin(int[] a) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			if(a[i] < min) {
				min = a[i];
			}
		}
		
		System.out.println("The minimum of 100 random numbers is: " + min);
	}
	
	public static void main(String args[]) {
		int[] array = new int[100];
		
		for (int i = 0; i < array.length; i++) {
			int random = (int)(Math.random() * 100 + 1);
			array[i] = random;
		}
		
		toStringArray(array);
		getArrayAverage(array);
		getArrayMax(array);
		getArrayMin(array);
	}
}
