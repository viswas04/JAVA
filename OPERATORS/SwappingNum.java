public class SwappingNum {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		x = x ^ y;
		y = x ^ y;
		x = x ^ y;
		System.out.println(" X is : " + x + " and Y is : " + y);
		System.out.println("Main method started !");
		System.out.println("************&&***********");
		System.out.println(x < y && x > y);
		System.out.println(x > y && x < y);
		System.out.println(x > y && x > y);
		System.out.println(x < y && x < y);
		System.out.println("***********||***********");
		System.out.println(x < y || x > y);
		System.out.println(x > y || x < y);
		System.out.println(x > y || x > y);
		System.out.println(x < y || x < y);
		System.out.println("***********!***********");
		System.out.println(x != y);
	}
}
