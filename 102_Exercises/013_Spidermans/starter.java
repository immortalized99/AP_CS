/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Spiderman x = new Spiderman();
		x.setActor("Tobey Maguire");
		x.setAge(49);
		x.setVillain("Green Goblin");
		
		Spiderman y = new Spiderman("Andrew Garfield", 41, "Electro");
		
		Spiderman z = new Spiderman("Tom Holland");
		z.setAge(28);
		z.setVillain("The Vulture");
		
		System.out.println("The villain is " + y.getVillain());
		
		Spiderman a = new Spiderman("Random Monkey", 38);
		a.setVillain("Venom");

		
	}
}
