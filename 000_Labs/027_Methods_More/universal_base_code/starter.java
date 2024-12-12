/*
 *	Author:  Jay Randeria
 *  Date: 10/24/24
*/

import java.util.Scanner;
import pkg.*;

class starter {
   public static void main(String args[]) {
      myCharacter char1 = new myCharacter();
      System.out.println(char1.setRole("No Role"));
      System.out.println("Your strength trait is " + char1.setStrength(0));
      System.out.println("Your dexterity trait is " + char1.setDexterity(0));
      System.out.println("Your intelligence trait is " + char1.setIntelligence(0));
      System.out.println("Your constitution trait is " + char1.setConstitution(0));
      System.out.println("Your charisma trait is " + char1.setCharisma(0));
      System.out.println("------------------------------------------------");
      
      Scanner sc = new Scanner(System.in);
      System.out.println("What class would you like to be?");
      String input = sc.nextLine();
      
      char1.setAll(input, 0, 0, 0, 0, 0);
   }
}
