/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard[] wizards = new Wizard[100];
		for (int i = 0; i < wizards.length; i++) {
			wizards[i] = new Wizard();
		}
		
		Warrior[] warriors = new Warrior[100];
		for (int i = 0; i < warriors.length; i++) {
			warriors[i] = new Warrior();
		}
		
		int j = 0;
		int k = 0;
		
		while(!warriors[99].isDead() || !wizards[99].isDead()) {
			for (int i = 0; i < wizards.length - 1; i++) {
				if (!wizards[i].isDead() && !warriors[i].isDead()) {
					wizards[i].attack(warriors[i]);
					warriors[i].attack(wizards[i]);
				} else if (wizards[i].isDead()) {
					wizards[i].attack(warriors[i + 1]);
					warriors[i + 1].attack(wizards[i]);
					k++;
				} else if (warriors[i].isDead()) {
					warriors[i].attack(wizards[i + 1]);
					j++;
				}
			}
			if (warriors[99].isDead() || wizards[99].isDead()) {
				break;
			}
		}
		
		if (warriors[99].isDead()) {
			System.out.println("Wizards won with " + (100 - k) + " left in their army.");
		}
		
		if (wizards[99].isDead()) {
			System.out.println("Warriors won with " + (100 - j) + " left in their army.");
		}
	}
}
