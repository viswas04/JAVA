import java.util.Scanner;

public class Ternary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks: ");
		int m = sc.nextInt();
		String g = (m >= 91) ? "A" : (m >= 81) ? "B" : (m >= 71) ? "C" : (m >= 61) ? "D" : (m >= 35) ? "E" : "F";
		//System.out.println("Grade is : " + g);
		//sc.close();
	
	}
}
