import java.util.Scanner;

public class HRDep {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Employee name : ");
		//String name = sc.nextLine();
		System.out.println("Enter years of Experience :");
		int exp = sc.nextInt();
		if (exp > 10) {
			System.out.println("Your bonus is : 20000");
		} else if (exp > 9) {
			System.out.println("Your bonus is : 10000");
		} else if (exp > 4) {
			System.out.println("Your bonus is : 5000");
		} else if (exp >=0 && exp <=1) {
			System.out.println("Your bonus is : 1000");
		}
		else {
			System.out.println("Invalid experience entered!");
		}
		System.out.println("Employee Name is :" + name);
		System.out.println("Years of Experience : " + exp);
		sc.close();
	}

}
