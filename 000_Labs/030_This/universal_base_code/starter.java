/*
 *	Author: Jay Randeria 
 *  Date: 11/1/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();
		PooleDwarf dwarf1 = new PooleDwarf(randName(), 49);
		PooleDwarf dwarf2 = new PooleDwarf(randName(), 50);
		PooleDwarf dwarf3 = new PooleDwarf(randName(), 48);
		PooleDwarf dwarf4 = new PooleDwarf(randName(), 45);
		PooleDwarf dwarf5 = new PooleDwarf(randName(), 52);
		PooleDwarf dwarf6 = new PooleDwarf(randName(), 51);
		PooleDwarf dwarf7 = new PooleDwarf(randName(), 47);
		
		if(dwarf1.isSameName(dwarf2.getName())) {
			System.out.println(dwarf1.getName() + " was the name with 1 match!");
		} else if(dwarf1.isSameName(dwarf3.getName())) {
			System.out.println(dwarf1.getName() + " was the name with 1 match!");
		} else if(dwarf1.isSameName(dwarf4.getName())) {
			System.out.println(dwarf1.getName() + " was the name with 1 match!");
		} else if(dwarf1.isSameName(dwarf5.getName())) {
			System.out.println(dwarf1.getName() + " was the name with 1 match!");
		} else if(dwarf1.isSameName(dwarf6.getName())) {
			System.out.println(dwarf1.getName() + " was the name with 1 match!");
		} else if(dwarf1.isSameName(dwarf7.getName())) {
			System.out.println(dwarf1.getName() + " was the name with 1 match!");
		} else {
			System.out.println("There were no matches!");
		}
	}
}
