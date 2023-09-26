package chapter5_sec2;

public class Fish extends Animals {

	public Fish(String n, int a, String s) {
		super(n, a, s);
		// TODO Auto-generated constructor stub
	}
	
	void swim() {
		System.out.println("Fish are swimming");
		
	}
	
	@Override
	public String toString() {
		return "Fish Name: " + getName() + "\n" +
				"Fish Age: " + getAge() + "\n"+
				"Fish Species: " + getSpecies() + "\n";
				//"Fish:" + swim();
	}
	
	

}
