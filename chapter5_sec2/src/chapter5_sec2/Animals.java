package chapter5_sec2;

public class Animals {
	
	String name;
	int age;
	String species;
	
	
	
	public Animals(String n, int a, String s) {
		name = n;
		age = a;
		species = s;
	}
	
	void eat() {
		System.out.println("Animal eat");
	}
	void sleep() {
		System.out.println("Animal sleep");
	}
	
	//setter Getter
	void setName (String n) {
		name = n;
	}
	String getName() {
		return name;
	}
	void setAge (int a) {
		age = a;
	}
	int getAge() {
		return age;
	}
	void setSpecies (String s) {
		species = s;
	}
	String getSpecies() {
		return species;
	} 
	
	
}
