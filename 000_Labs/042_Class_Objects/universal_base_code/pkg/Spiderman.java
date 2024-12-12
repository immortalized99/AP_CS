/*
 *	Author:  Jay Randeria
 *  Date: 12/4/24
*/

package pkg;
import java.util.*;

public class Spiderman {
	String spidey;
	String villain;
	int age;
	
	public Spiderman() {
		spidey = "Miles Morales";
		villain = "King Pin";
		age = 13;
	}
	
	public Spiderman(String spidey) {
		this.spidey = spidey;
		villain = "None";
		age = 0;
	}
	
	public Spiderman(String spidey, int age) {
		this.spidey = spidey;
		villain = "None";
		this.age = age;
	}
	
	public Spiderman(String spidey, String villain) {
		this.spidey = spidey;
		this.villain = villain;
		age = 0;
	}
	
	public void print() {
		System.out.println("--------------------------------");
		System.out.println("The actor " + spidey + " is " + age + " years old.");
		System.out.println("They play Spiderman who's villain is " + villain + ".");
		System.out.println("--------------------------------");
		System.out.println();
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setVillain(String villain) {
		this.villain = villain;
	}
}
