public class Employee {
	int empAge;
	double empSalary;
	double empBonus;

	public Employee(int empAge, double empSalary) {
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	public Employee(double empSalary, double empBonus) {
		this.empSalary = empSalary;
		this.empBonus = empBonus;

	}

	public static void main(String[] args) {
		Employee e1 = new Employee(22, 23000.0);
		e1.siddu();
		Employee e2 = new Employee(23000.00, 1000.00);
		e2.siddu();
	}

	void siddu() {
		System.out.println("*******************");
		System.out.println("Emp age is :" + empAge);
		System.out.println("Emp sal is :" + empSalary);
		System.out.println("Emp bonus is:"+empBonus);
	}
	
}
