public class TypesOfMethods2 {

	public static void main(String[] args) {

		System.out.println("Main method started !!");
		
		System.out.println(addition());
		System.out.println(getName());
		method1(); 

//		int a= addition();//4000
//		String f = getName();//Siddu
//		
//		System.out.println("Addition of values : "+ a);
//		System.out.println("Name of the person : "+f);
		
		
		System.out.println("Main method ended !!");

	}
	
	static void method1() {
		System.out.println("Hello method1 !");
		return;
		
	}

	static int addition() {
		int sum = 0;
		sum = 1000+3000;
		return sum;
		//System.out.println("");
	}
	static String getName() {
		String n = "";
		n = "Siddu";
		return n;
	}

}
