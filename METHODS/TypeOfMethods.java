//WAP to calculate numbers.
public class TypeOfMethods {

	public static void main(String[] args) {
		System.out.println("Main method started !");
		TypeOfMethods t1 = new TypeOfMethods();
		//calling the method
		t1.addition();
		t1.subtraction();
		t1.multiplication();
		t1.division();
		t1.modulus();
		System.out.println("Main method ended !");
	}
	void addition(){
		System.out.println("Addition starts *******");
		byte a = 10;
		byte b = 20;
		System.out.println("Result :" + (a + b));	
	}
	void subtraction(){
		System.out.println("Subtraction starts *******");
		long a = 20;
		short b = 10;
		System.out.println("Result :" + (a - b));	
	}
	void multiplication(){
		System.out.println("Multiplication starts *******");
		float a = 10;
		float b = 20;
		System.out.println("Result :" + (a * b));	
	}
	void division(){
		System.out.println("Division starts *******");
		double a = 40;
		double b = 20;
		System.out.println("Result :" + (a / b));	
	}
	void modulus(){
		System.out.println("Modulus starts *******");
		int b = 8;
		int a = 40;
		System.out.println("Result :" + (a % b));	
	}
	
}
