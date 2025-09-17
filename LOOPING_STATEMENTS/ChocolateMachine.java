import java.util.Scanner;
public class ChocolateMachine {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number of chocolates : ");
			int total_choco = sc.nextInt();
			int price = 1;
			int buy = 5;
			int get = 3;
			int wrap_free = 3;
			int bought = total_choco / price;
			int free = (bought / buy) * get;
			int total = bought + free;
			int wrappers = total;

			while (wrappers >= wrap_free) {
				int extra = wrappers / wrap_free;
				total = total + extra;
				wrappers = wrappers % wrap_free + extra;
			}
			System.out.println("Maximum chocolates are :" + total);
		}

	}

}
