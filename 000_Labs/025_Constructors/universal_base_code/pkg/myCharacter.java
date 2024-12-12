package pkg;

public class myCharacter {
   public String role;
   public int strength;
   public int dexterity;
   public int intelligence;
   public int constitution;
   public int charisma;

   public myCharacter() {
      role = new String("No Role");
      strength = 0;
      dexterity = 0;
      intelligence = 0;
      constitution = 0;
      charisma = 0;
   }

   public myCharacter(String var1) {
      role = var1;
      if(role.equals("Wizard") || role.equals("wizard")) {
          System.out.println("You've chosen the Wizard! Excelsior!");
      } else if (role.equals("Rogue") || role.equals("rogue")) {
          System.out.println("You've chosen the Rogue! How cunning!");
      } else if (role.equals("Warrior") || role.equals("warrior")) {
          System.out.println("You've chosen the Warrior! For honor!");
      } else {
          System.out.println("No role");
      }

      strength = 0;
      dexterity = 0;
      intelligence = 0;
      constitution = 0;
      charisma = 0;
   }
}