package chapter5_sec2;

public class Cat extends Animals {
	
	//Attributes
	String color;
	
	public Cat(String cn, int ca, String cs, String cc) {
		super(cn, ca, cs);
		color = cc;
	}
	
	void sleep() {
		System.out.println("Animal sleep");
	}
	
	//setter
	void setColor(String c) {
		color = c;
	}
	//getter
	String getColor() {
		return color;
	}
	//display obj. description
	@Override
	public String toString() {
		return "Cat Name: " + getName() + "\n" +
				"Cat Age:" + getAge() + "\n"+
				"Cat Color:" + getColor();
	}
	
	@Override
	void sleep() {
		System.out.println("Cat sleep");

	}
}
