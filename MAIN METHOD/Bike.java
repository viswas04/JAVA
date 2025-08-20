public class Bike {
	String name;
	double price;

	Bike() {
		this.name = "Unknown";
		this.price = 10000;
	}

	public static void main(String[] args) {
		System.out.println("Main method started !");
		
		Bike b = new Bike();
		b.display();
		
		
		Bike b1 = new Bike();
		b1.name = "JAWA";
		b1.price = 200000;
		b1.display();
		
	}

	void display() {
		System.out.println(name);
		System.out.println(price);
	}

}
