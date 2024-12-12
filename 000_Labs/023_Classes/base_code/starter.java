/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class character {
    public String role;
    public int strength;
    public int dexterity;
    public int intelligence;
    public int charisma;
    
    public String role(String role) {
        return role;
    }
    
    public int strength(int num) {
        return num;
    }
    
    public int dexterity(int num) {
        return num;
    }
    
    public int intelligence(int num) {
        return num;
    }
    
    public int charisma(int num) {
        return num;
    }
}

class starter {
	public static void main(String args[]) {
		character Char = new character();
		System.out.println("Your role is " + Char.role("Wizard"));
		System.out.println("Your stength trait is " + Char.strength(5));
		System.out.println("Your dexterity trait is " + Char.dexterity(5));
		System.out.println("Your intelligence trait is " + Char.intelligence(5));
		System.out.println("Your charisma trait is " + Char.charisma(5));


		
	}
}
