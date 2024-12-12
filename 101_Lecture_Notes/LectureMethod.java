/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        greeting("Jay");
        greeting("Daniel");
        
        double num = raise(200000.42, 5);
        System.out.println(num);
        num = raise(num, 5);
        System.out.println(num);
        num = raise(num, 5);
        System.out.println(num);
	}
	
	public static double raise(double salary, int percent) {
	    double amount = salary + (salary * (percent / 100.0));
	    return amount;
	}
	
	public static void greeting(String name) {
	    System.out.println("Howdy, " + name);
	}
	
	public static void printAnimal() {
	    System.out.println(" /\\ /\\ ");
	    System.out.println("((ovo))");
	    System.out.println("():::()");
	    System.out.println("  VVV");

	}
}