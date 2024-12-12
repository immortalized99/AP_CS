/*
 *	Author:  Jay Randeria
 *  Date:  10/3/24
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int money = 100;
		
		System.out.println("Slot Machine Rules: "); 
		System.out.println("1. Each player starts with $100.");
		System.out.println("2. Input a wager less than your total amount of money.");
		System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
		System.out.println("   a. If two numbers match, you double your money.");
		System.out.println("   b. If three numbers match, you triple your money.");
		System.out.println("   c. If none match, you lose your money.");
		System.out.println("--------------------------------------------------");
		
		while(true) {
			System.out.println("Would you like to play the slots? (Yes/yes/Y/y): ");
			String confirm = new String(sc.nextLine());
			if(confirm.equals("Yes") || confirm.equals("yes") || confirm.equals("Y") || confirm.equals("y")){
				System.out.println("You have $" + money + ". How much would you like to wager? ");
				int wager = sc.nextInt();
					if(wager > money) {
						System.out.println("You only have $" + money + "! Please enter a smaller number :");
						wager = sc.nextInt();
					} else if (wager <= money) {
						System.out.println("Great! Let's play!!!");
						System.out.println("Your rolls are:");
						System.out.println("_______________________");
						int num1 = (int) (Math.random() * 10) + 1;
						int num2 = (int) (Math.random() * 10) + 1;
						int num3 = (int) (Math.random() * 10) + 1;
						System.out.println(" | " + num1 + " | " + num2 + " | " + num3 + " | ");
						System.out.println("_______________________");
					
						if(num1 == num2) {
							money = money + wager;
							System.out.println("You won! You're wager has now been doubled!");
							System.out.println("You now have $" + money + ".");
							System.out.println("--------------------------------------------------");
							System.out.println();
						} else if(num1 == num3) {
							money = money + wager;
							System.out.println("You won! You're wager has now been doubled!");
							System.out.println("You now have $" + money + ".");
							System.out.println("--------------------------------------------------");
							System.out.println();
						} else if(num2 == num3) {
							money = money + wager;
							System.out.println("You won! You're wager has now been doubled!");
							System.out.println("You now have $" + money + ".");
							System.out.println("--------------------------------------------------");
							System.out.println();
						} else if (num1 == num2 && num2 == num3) {
							money = money + (num1 * 2);
							System.out.println("JACKPOT!!! You're wager has now been tripled!");
							System.out.println("You now have $" + money + ".");
							System.out.println("--------------------------------------------------");
							System.out.println();
						} else {
							money = money - wager;
							System.out.println("Didn't win this time, better luck next time!");
							System.out.println("You now have $" + money + ".");
							System.out.println("--------------------------------------------------");
							System.out.println();
					}	
					
						if(money == 0) {
							System.out.println();
							System.out.println("You've run out of money! Thanks for coming! Come back soon!");
							break;
						} 
				
					} 
			} else if (confirm.equals("No") || confirm.equals("no") || confirm.equals("N") || confirm.equals("n")){
				System.out.println("Sad to see you go! You still have $" + money + " left. Come again soon! Thanks!");
				break;
			} else {
				System.out.println("That wasn't quite the correct answer. Try again.");
				System.out.println("--------------------------------------------------");
				System.out.println();
				continue;
			}
				
		}
				
	}	
}
