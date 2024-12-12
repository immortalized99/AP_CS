import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
        System.out.println("Please enter a name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello " + name);
        
        System.out.println("Please enter an integer");
        int num1 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Please enter an integer");
        int num2 = sc.nextInt();
        sc.nextLine();
        
        System.out.println("The sum of these  numbers is " + (num1 + num2));
        
        System.out.println("Please enter your favorite food");
        String food = sc.nextLine();
	}
}