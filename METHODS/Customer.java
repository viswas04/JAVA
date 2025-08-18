public class Customer {
	int cID ;
	String cName ;
	//NO ARGUMENT CONSTRUCTOR
	Customer(){
		System.out.println("Hello no argument constructor !!");
	}
	//INSTANCE BLOCK
	{
		System.out.println("Hello Instance Block !!!");
	}

	public static void main(String[] args) {
		System.out.println("Main method started ********");
		Customer c = new Customer();
		c.cID = 12;
		c.cName = "Deepak";
		System.out.println(c.cID);
		System.out.println(c.cName);
		
		
	}

}
