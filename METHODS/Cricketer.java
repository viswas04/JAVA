public class Cricketer {
	// Declaration
	// instance variables or Non-static variables
	int jerseyNo;
	String cricketerName;
	static{
		System.out.println("In INDIAN TEAM");
	}
	
	{
		System.out.println("Welcome to Indian Cricket Team !!");
	}
	// Static variables
	static int countryID = 91;            // Assigning at the time of declaration
	static String countryName = "India";  
	static Cricketer D = new Cricketer();
	static {
		D.jerseyNo = 7;
		D.cricketerName = "MSD";
	}
	public static void main(String[] args) {
		System.out.println("Indian Team info");
		System.out.println("First Object Info*****************");
		// Creating a object reference variable
		// Accessing the static data
		System.out.println("Country ID :" + countryID);
		System.out.println("Country Name :" + countryName);
		// Accessing the instance data
		System.out.println("Jersey Number :" + D.jerseyNo);
		System.out.println("Name of the Cricketer :" + D.cricketerName);
		System.out.println("Second Object Info*****************");
		Cricketer K = new Cricketer();
		K.jerseyNo = 18;
		K.cricketerName = "KOHLI";
		// Accessing the static data
		System.out.println("Country ID :" + countryID);
		System.out.println("Country Name :" + countryName);
		// Accessing the instance data
		System.out.println("Jersey Number :" + K.jerseyNo);
		System.out.println("Name of the Cricketer :" + K.cricketerName);
		System.out.println("Third Object Info*****************");
		Cricketer J = new Cricketer();
		J.jerseyNo = 8;
		J.cricketerName = "JADEJA";
		// Accessing the static data
		System.out.println("Country ID :" + countryID);
		System.out.println("Country Name :" + countryName);
		// Accessing the instance data
		System.out.println("Jersey Number :" + J.jerseyNo);
		System.out.println("Name of the Cricketer :" + J.cricketerName);
		System.out.println("Fourth Object Info*****************");
		Cricketer P = new Cricketer();
		countryID = 92;
		countryName = "BHARATH";
		P.jerseyNo = 33;
		P.cricketerName = "HARDIK PANDYA";
		// Accessing the static data
		System.out.println("Country ID :" + countryID);
		System.out.println("Country Name :" + countryName);
		// Accessing the instance data
		System.out.println("Jersey Number :" + P.jerseyNo);
		System.out.println("Name of the Cricketer :" + P.cricketerName);
		System.out.println("Fifth Object Info*****************");
		Cricketer R = new Cricketer();
		R.jerseyNo = 45;
		R.cricketerName = "ROHIT";
		// Accessing the static data
		System.out.println("Country ID :" + countryID);
		System.out.println("Country Name :" + countryName);
		// Accessing the instance data
		System.out.println("Jersey Number :" + R.jerseyNo);
		System.out.println("Name of the Cricketer :" + R.cricketerName);
		System.out.println("Sixth Object Info*****************");
		Cricketer A = new Cricketer();
		A.jerseyNo = 99;
		A.cricketerName = "ASHWIN";
		// Accessing the static data
		System.out.println("Country ID :" + countryID);
		System.out.println("Country Name :" + countryName);
		// Accessing the instance data
		System.out.println("Jersey Number :" + A.jerseyNo);
		System.out.println("Name of the Cricketer :" + A.cricketerName);
	}
}
