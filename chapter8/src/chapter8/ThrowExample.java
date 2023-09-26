package chapter8;

public class ThrowExample {
	static void greet(String n) {
			
		if(n.equals("John")) {
			throw new RuntimeException();
		}
		System.out.println("Hello " + n);
	}	
	
	
	public static void main(String[] args) {
		try {
			greet("John");
		}catch(RuntimeException e) {
			System.out.println("Bad Guy !!");
		}

	}
}
