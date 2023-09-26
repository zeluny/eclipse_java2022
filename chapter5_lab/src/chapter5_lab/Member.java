package chapter5_lab;

class Member{
	  String name;
	  int age;
	  String number;
	  String address;
	  int salary;

	  public void printSalary(){
	    System.out.println(salary);
	  }

	}

	class Employee extends Member{
	  String specialization;
	}

	class Manager extends Member{
	  String department;
	}

	class Output2{
	  public static void main(String[] args){
	    Employee e = new Employee();
	    e.name = "panupong";
	    e.age = 22;
	    e.number = "088888888";
	    e.address = "Thailand";
	    e.salary = 50000;
	    e.specialization = "Programming";

	    Manager m = new Manager();
	    m.name = "panupong";
	    m.age = 22;
	    m.number = "088888888";
	    m.address = "Thailand";
	    m.salary = 50000;
	    m.department = "Programming";

	    System.out.println(":: Employee ::\nName: " + e.name + "\nAge: " 
	    + e.age + "\nNumber: " + e.number + "\nAddress: " + e.address 
	    + "\nSalary: " + e.salary + "\nSpecialization: " + e.specialization);
	    System.out.println();
	    System.out.println(":: Manager ::\nName: " + m.name + "\nAge: " 
	    + m.age + "\nNumber: " + m.number + "\nAddress: " + m.address 
	    + "\nSalary: " + m.salary + "\nDepartment: " + m.department);
	    
	  }
	}
