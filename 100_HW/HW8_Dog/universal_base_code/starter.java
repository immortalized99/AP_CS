/*
 *	Author: Jay Randeria
 *  Date: 10/27/24
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dog name?");
		String name = sc.nextLine();
		
		System.out.println("What age should " + name + " be?");
		int age = sc.nextInt();
		
		Dog dog1 = new Dog(name, age);
		Dog dog2 = new Dog();
		
		System.out.println(name + " is a dog dog that is " + age + " years old!");
		System.out.println("Clifford is a big red dog that is 1 year old!");
		
		if (dog1.isSleeping() == false) {
			System.out.println(name + " is awake!");
			dog1.bark();
		} else {
			System.out.println(name + " is sleeping! Don't wake " + name + " up!");
		}
		
		if (dog1.isSleeping() == false && dog2.isSleeping() == false) {
			dog2.bark();
			System.out.println(name + " wakes up from Clifford");
			dog1.bark();
		} else if (dog1.isSleeping() == true && dog2.isSleeping() == true) {
			System.out.println("Clifford wakes up");
			dog2.bark();
		}
		



	}
}
