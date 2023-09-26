package lab_assignment2;

public class Employee {
	private int id;
	private String firstName;
	private String lastName;
	private int salary;
	//Constructor
	public Employee(int id,String firstName,String lastName,int salary) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	//Getter
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getName() {
		return firstName+" "+lastName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAnnualSalary(int salary) {
		return salary*12;
	}
	public int raiseSalary(int percent) {
		return ((salary*percent)/100)+salary;
	}
	public String toString() {
		return "Employee[id="+getId()+
				"name="+getFirstName()+" "+getLastName()+
				"salary="+getSalary()+"]";
	}
	
	//Test	
	/*public static void main(String[] args) {
		Employee e1 = new Employee(8, "Supanat", "Kamol", 2500);
		System.out.println(e1);  // toString();
		e1.setSalary(999);
		System.out.println(e1);  // toString();
		System.out.println("id is: " + e1.getId());
		System.out.println("firstname is: " + e1.getFirstName());
		System.out.println("lastname is: " + e1.getLastName());
		System.out.println("salary is: " + e1.getSalary());
		System.out.println("name is: " + e1.getName());
		System.out.println("annual salary is: " + e1.getAnnualSalary(2500)); // Test method
		System.out.println(e1.raiseSalary(10));
		System.out.println(e1);
	}
	*/
}

