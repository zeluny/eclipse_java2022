package unit1;
public class SportCar implements Printable {
	String nameCar;
	int num;
	
	public SportCar(String nameCar, int num) {
		this.nameCar = nameCar;
		this.num = num;
	}
	public void print() {
		System.out.println("SportCar name: "+nameCar+" Price: "+num);
	}
}

