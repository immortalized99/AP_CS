/* 
    Lecture note example - If Statements
*/

import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You've joined an Alien Exchange Program!");
        System.out.println("Pick an Alien to take in!");
        System.out.println("1. Joe, a fat bellied alien who loves eating");
        System.out.println("2. Bob, a blue alien who loves tree");
        System.out.println("3. Barney, a purple tailed alien who eats butterflies");
        
        int answer1 = sc.nextInt();
        if(answer1 == 1) {
            System.out.println("You picked Joe!!! WOO!!");
        } else if(answer1 == 2) {
            System.out.println("You picked Bob!!! WOO!!");
        } else if(answer1 == 3) {
            System.out.println("You picked Barney!!! WOO!!");
        } else {
            System.out.println("You get Jerry.");
        }
        
        sc.nextLine();
        System.out.println("What stuff should your alien do?");
        System.out.println("1. Eat");
        System.out.println("2. Sleep");
        System.out.println("3. Swim");
        int answer2 = sc.nextInt();
        if(answer2 == 1) {
            System.out.println("You eat too much and die.");
        } else if(answer2 == 2) {
            System.out.println("You sleep.");
        } else if(answer2 == 3) {
            System.out.println("You drown.");
        } else {
            System.out.println("You miraculously die by breathing.");
        }
        
        sc.nextLine();
        System.out.println("A rival alien comes, and challenges you to a fight.");
        System.out.println("1. Accept the fight");
        System.out.println("2. Decline the fight");
        System.out.println("3. Run away and hide like a chicken");
        int answer3 = sc.nextInt();
        
        if (answer3 == 1) {
            System.out.println("You win the fight!!");
        } else if(answer3 == 2) {
            System.out.println("The alien doesn't care you declined and kills you");
        } else if(answer3 == 3) {
            System.out.println("You suck.");
        } else {
            System.out.println("Really? You can't just not follow directions. That's how it works");
        }
        
        sc.nextLine();
        System.out.println("Do you return to your planet?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int answer4 = sc.nextInt();
        if(answer4 == 1) {
            System.out.println("Yay! You make it home safely! The end.");
        } else if(answer4 == 2) {
            System.out.println("You can't survive on Earth any longer and die.");
        } else {
            System.out.println("...");
        }
	}
}