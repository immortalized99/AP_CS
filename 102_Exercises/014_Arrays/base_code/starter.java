/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int[] arr = new int[1001];
		 int[] arr2 = new int[1001];
		 int i = 0;
		 int j = 0;
		 int k = 0;
		 int l = 1000;
		 while (i < arr.length) {
		 	j += 3;
		 	arr[i] = j;
		 	System.out.println(arr[i]);	
		 	i++;
		 }
		 
		 while (k < arr2.length) {
		 	arr2[k] = l;
		 	System.out.println(arr2[k]);
		 	k++;
		 	l--;
		 }
	}
}
