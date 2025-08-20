public class Employee {
	int id;
	String name;
	double salary;
	
	Employee(){
		this.id = 0;
		this.name = "Dummy";
		this.salary = 0.0;
	}
	
	Employee(int id, String name ,double salary){
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	Employee(Employee e){
		this.id = e.id;
		this.name = e.name;
		this.salary = e.salary;
	}

	public static void main(String[] args) {
	    Employee e = new Employee();
	    e.show();
	    Employee e1 = new Employee(101, "Bunny", 12000.0);
	    e1.show();
	    Employee e2 = new Employee(e1);
	    e2.show();
	    e1.name = "Bunny Updated";
	    e1.salary = 15000.0;
	    e1.show();
	    e2.show();
	}

	void show() {
		System.out.println("*****EMPLOYEE INFO******");
		System.out.println("Id : "+id);
		System.out.println("Name : "+name);
		System.out.println("Salary :"+salary);
	}

}
