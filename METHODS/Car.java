//NO-ARG CONSTRUCTOR
public class Car {

	String brand;
	String model;
	String color;
	//NO-ARG CONSTRUCTOR
	Car() {
		System.out.println("No arg constructor called !!");
		model = "unknown";
		brand = "unknown";
		color = "unknown";
	}
	// PARAMETERIZED CONSTRUCTOR
	Car(String model, String brand, String color) {
		this.model = model;
		this.brand = brand;
		this.color = color;
	}

	public static void main(String[] args) {
		System.out.println("Main method started **********");
		Car c = new Car();
		c.show();
		System.out.println("*******************");
		Car c1 = new Car("PUNCH","TATA","BLUE");
		c1.show();
		Car c2 = new Car();
		c2.brand = "BMW";
		c2.model = "M5";
		c2.color = "Green";
		c2.show();
	}

	void show() {
		System.out.println("Model of the car :"+model);
		System.out.println("Brand of the car :"+brand);
		System.out.println("Color of the car :"+color);
	}
}
