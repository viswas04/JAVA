import java.util.Scanner;
//If you want to execute only one condition you no need to give {}
//If you want to check through two conditions you can use {}
//They works with or without the {}
//If we have only one statement to execute, whenever the if condition is true we can go without the {}
//If we want to execute multiple statements whenever the if condition is true then we need the {}
If we write the if else inside the if else statements then they are called as nested if else statements 
public class CSDemo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your age : ");
		int age = sc.nextInt();

		if (age >= 18 && age <= 70) {
			System.out.println("You are eligible for driving !");
			System.out.println("Please enter your salary : ");
			int salary = sc.nextInt();

			if (salary >= 15000 && salary <= 100000) {
				System.out.println("He is financially stable !");
				System.out.println("Congrats !!");

				System.out.println("Please enter your BMI : ");
				int bmi = sc.nextInt();
				if (bmi >= 17 && bmi <= 25)
					System.out.println("He is healthy");
				else
					System.out.println("He is unhealthy");
			} else {
				System.out.println("He is financially unstable !");
			}
		} else {
			System.out.println("You are ineligible for driving !");
		}
		sc.close();
	}
}
