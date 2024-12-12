package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	
	public Dog() {
		name = "Clifford";
		age = 1;
		breed = "big red dog";
	}
	
	public Dog(String Name) {
		name = Name;
		age = 1;
		breed = "dog dog";
	}
	
	public Dog(String Name, int Age) {
		name = Name;
		age = Age;
		breed = "dog dog";
	}
	
	public void setName(String Name) {
		name = Name;
	}
	
	public void setAge(int Age) {
		age = Age;
	}
	
	public void setBreed(String Breed) {
		breed = Breed;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getBreed() {
		return breed;
	}
	
	public boolean isSleeping() {
		int num = (int) (Math.random() * 10) + 1;
		if (num <= 5) {
			return true;
		} else {
			return false;
		}
	}
	
	public void bark() {
		System.out.println(name + " barks");
	}
}
