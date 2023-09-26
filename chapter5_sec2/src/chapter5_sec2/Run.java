package chapter5_sec2;

public class Run {

	public static void main(String[] args) {
		
		Cat c01 = new Cat("Dang",3,"American Shorthair","Grey");
		Fish f01 = new Fish("jjj",3,"Shado");
		Monkey m01 = new Monkey("gorilla",5,"Black");
		f01.setAge(5);
		f01.setName("55555");
				
		System.out.println(c01);
		System.out.println(f01);
		f01.swim();
		System.out.println(m01);
		m01.getCoconut();
		
	}

}
