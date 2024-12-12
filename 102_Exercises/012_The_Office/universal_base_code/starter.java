/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		michael.raiseSalary(50);
		michael.getSalary();
		michael.getAnnualSalary();
		michael.employeeToString();
		System.out.println("Annual Salary " + michael.getAnnualSalary());
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		dwight.raiseSalary(50);
		dwight.getSalary();
		dwight.getAnnualSalary();
		dwight.employeeToString();
		System.out.println("Annual Salary " + dwight.getAnnualSalary());
		
		
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		jim.raiseSalary(50);
		jim.getSalary();
		jim.getAnnualSalary();
		jim.employeeToString();
		System.out.println("Annual Salary " + jim.getAnnualSalary());
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		pam.employeeToString();
		pam.raiseSalary(50);
		pam.getSalary();
		pam.getAnnualSalary();
		pam.employeeToString();
		System.out.println("Annual Salary " + pam.getAnnualSalary());
		
		Employee jay = new Employee(3854, "Jay", "Randeria", 239050);
		jay.employeeToString();
		jay.raiseSalary(1000);
		jay.getSalary();
		jay.getAnnualSalary();
		jay.employeeToString();
		System.out.println("Annual Salary " + jay.getAnnualSalary());
	}
}
