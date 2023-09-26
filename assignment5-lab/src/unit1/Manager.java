package unit1;
public class Manager implements Printable {
	String name;
	int num;
	public Manager(String name, int num) {
		this.name = name;
		this.num = num;
	}
	public void print() {
		System.out.println("Manager name: "+name+" Age: "+num);
	}
}

