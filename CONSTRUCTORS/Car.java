public class Car {
	String model;
	double pricePerDay;
	int days;
	double total_rent;
	
	Car(String model,double pricePerDay){
		this(model,pricePerDay,1);
		this.model = model;
		this.pricePerDay = pricePerDay;
		System.out.println("1st constructor called");
	}
	
	Car(String c,double total_rent,int days){
		this.model = c;
		this.pricePerDay = total_rent;
		this.days=days;
	}
	
	public static void main(String[] args) {
		Car c = new Car("Scorpio",25000.00,8);
		c.show();
		
		Car c1 = new Car("Bolero",20000.00,10);
	    c1.show();
	    
	    Car c2 = new Car("Baleno",15000.00);
	    c2.show();
	    
	    Car c3 = new Car("City",14000.00,12);
	    c3.show();
	}
	    
	void show() {
		total_rent = days*pricePerDay;
		System.out.println("Model is : "+model);
		System.out.println("Price Per Day is : "+pricePerDay);
		System.out.println("Default days is : "+days);
		System.out.println("Total rent is : "+total_rent);
	}
}