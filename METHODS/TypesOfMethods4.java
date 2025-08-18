import java.util.Scanner;
public class TypesOfMethods4 {
	public static void main(String[] args) {
		System.out.println("Main method started !");
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your name :");
		String name = sc.nextLine();
		getName(name);

		System.out.println("Enter a number :");
		int n1 = sc.nextInt();
		System.out.println("Enter another number :");

		int n2 = sc.nextInt();
		multiplication(n1, n2);

		System.out.println("Enter one number: ");
		float f1 = sc.nextFloat();
		System.out.println("Enter another number :");

		float f2 = sc.nextFloat();
		division(f1, f2);

		System.out.println("Enter your name :");
		char gen = sc.next().charAt(2);
		getgenderInfo(gen);
		System.out.println("Main method ended !");
		sc.close();

	}

	static void getName(String name) {
		System.out.println("Name of the person :" + name);
	}

	static void multiplication(int a, int b) {
		System.out.println("Multiplication method called ");
		System.out.println(a * b);
	}

	static void division(float a, float b) {
		System.out.println("Division method starts :");
		System.out.println(b / a);
	}

	static void getgenderInfo(char c) {
		System.out.println("Gender is :" + c);
	}
	

}
