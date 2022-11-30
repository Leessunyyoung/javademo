package java007_class.part09;

public class Employees {
	String name;
	int salary;
	
	public Employees() {
		// TODO Auto-generated constructor stub
	}

	public Employees(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public void display() {
		System.out.printf("%s,%d\n",name,salary);
	}

}
