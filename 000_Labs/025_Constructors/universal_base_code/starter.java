/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import pkg.*;

class starter {
   public static void main(String args[]) {
      myCharacter char1 = new myCharacter();
      System.out.println("Your role is " + char1.role);
      System.out.println("Your strength trait is " + char1.strength);
      System.out.println("Your dexterity trait is " + char1.dexterity);
      System.out.println("Your intelligence trait is " + char1.intelligence);
      System.out.println("Your constitution trait is " + char1.constitution);
      System.out.println("Your charisma trait is " + char1.charisma);
      System.out.println("------------------------------------------------");
      
      Scanner sc = new Scanner(System.in);
      System.out.println("What class would you like to be?");
      String input = sc.nextLine();
      
      myCharacter char2 = new myCharacter(input);
      System.out.println("Your role is " + char2.role);
      System.out.println("Your strength trait is " + char2.strength);
      System.out.println("Your dexterity trait is " + char2.dexterity);
      System.out.println("Your intelligence trait is " + char2.intelligence);
      System.out.println("Your constitution trait is " + char2.constitution);
      System.out.println("Your charisma trait is " + char2.charisma);
   }
}
