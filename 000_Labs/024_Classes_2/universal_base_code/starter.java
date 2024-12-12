/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		myCharacter Char = new myCharacter();
		System.out.println("Your role is " + Char.role());
		System.out.println("Your stength trait is " + Char.strength());
		System.out.println("Your dexterity trait is " + Char.dexterity());
		System.out.println("Your intelligence trait is " + Char.intelligence());
		System.out.println("Your charisma trait is " + Char.charisma());
	}
}