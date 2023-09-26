
public class Airplane implements canFly {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Airplane fly.");
		System.out.println(canFly.x + 10);
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Airplane Stop.");
	}

}
