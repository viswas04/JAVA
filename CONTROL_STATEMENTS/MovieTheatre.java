import java.util.Scanner;
public class MovieTheatre {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter show : ");
		String showtime = sc.next();
		int actualprice = 0;
		String showname = "";

		switch (showtime) {
		case "mor":
			actualprice = 100;
			showname = "Morning";
			break;
		case "mat":
			actualprice = 150;
			showname = "Matinee";
			break;
		case "eve":
			actualprice = 200;
			showname = "Evening";
			break;
		default:
			System.out.println("Invalid input !");
		}

		System.out.print("Enter your age: ");
		int age = sc.nextInt();

		double discount = 0;
		double finalprice = actualprice;
		if (age <= 12) {
			discount = actualprice / 2;
			finalprice = actualprice - discount;
		}
		else {
			System.out.println("Invalid age for discount !!");
		}
		System.out.println("Show name is :"+showname);
		System.out.println("Discount is : " + discount);
		System.out.println("Actual price :" + actualprice);
		System.out.println("Final price :" + finalprice);

		sc.close();
	}

}
