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

   public String setRole(String role) {
       if (role == "Rogue" || role == "rogue") {
           return "You've chosen the Rogue! How cunning!";
       } else if (role == "Wizard" || role == "wizard") {
           return "You've chosen the Wizard! Excelisior!";
       } else if (role == "Warrior" || role == "warrior") {
           return "You've chosen the Warrior! For honor!";
       } else if (role == "No Role") {
           return "Your role is No Role";
       } else {
           return "You've decided not to chose a role. Rerun program.";
       }
   }
   
   public int setStrength(int strength) {
       if (strength >= 0) {
           return strength;
       } else {
           return 0;
       }
   }
   
   public int setDexterity(int dexterity) {
       if (dexterity >= 0) {
           return dexterity;
       } else {
           return 0;
       }
   }
   
   public int setIntelligence(int intelligence) {
       if (intelligence >= 0) {
           return intelligence;
       } else {
           return 0;
       }
   }
   
   public int setCharisma(int charisma) {
       if (charisma >= 0) {
           return charisma;
       } else {
           return 0;
       }
   }
   
   public int setConstitution(int constitution) {
       if (constitution >= 0) {
           return constitution;
       } else {
           return 0;
       }
   }
   
   public boolean setAll(String Role, int str, int dex, int intel, int cha, int con) {
       Role = role;
       str = strength;
       dex = dexterity;
       intel = intelligence;
       cha = charisma;
       con = constitution;
       
       if (Role == role && str == strength && dex == dexterity && intel == intelligence && cha == charisma && con == constitution) {
           System.out.println("You're role is " + Role);
           System.out.println("Your strength trait is " + str);
           System.out.println("Your dexterity trait is " + dex);
           System.out.println("Your intelligence trait is " + intel);
           System.out.println("Your charisma trait is " + cha);
           System.out.println("Your constitution trait is " + con);
           return true;
       } else {
           return false;
       }
   }
}