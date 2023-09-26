package chapter5_sec2;

public class Monkey extends Animals {

	public Monkey(String n, int a, String s) {
		super(n, a, s);
		// TODO Auto-generated constructor stub
	}
	
	public void getCoconut() {
		System.out.println("A monkey get a coconut");
	}
	
	@Override
	public String toString() {
		return "Monkey Name: " + getName() + "\n" +
				"Monkey Age: " + getAge() + "\n"+
				"Monkey Species: " + getSpecies() + "\n";
				//getCoconut();
	}

}
