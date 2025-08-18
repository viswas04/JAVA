public class Movie {
	String name;
	String director;
	String hero;
	String heroine;
	double budget;
	
	public Movie() {
		System.out.println("No-arg constructer called");
	}
	
	public Movie(String director) {
		this.director = director;
	}
	
	public Movie(Movie m,String hero, double budget) {
		this.director = m.director;
		this.hero = hero;
		this.budget = budget;
	}
	public Movie(Movie m,String heroine, String name) {
		this.name = name;
		this.heroine = heroine;
		this.hero = m.hero;
		this.director = m.director;
		this.budget = m.budget;	
	}

	public static void main(String[] args) {
		System.out.println("Main method started !");
		Movie m1= new Movie();
		m1.show();
		
		Movie m2 = new Movie("NELSON");
		m2.show();
		System.out.println("Main method ended !");
		
		Movie m3 = new Movie(m2,"RAJINIKANTH",200000000);
		m3.show();
		m3.budget = 100000000; 
		System.out.println("Main method ended !");
		Movie m4 = new Movie(m3,"RAMYA KRISHNA","JAILER");
		m4.show();
		System.out.println("Main method ended !");
		
		
	}
	
	void show() {
		System.out.println("**********MOIVE INFO**********");
		System.out.println("Name of the movie : "+name);
		System.out.println("Director of the movie : "+director);
		System.out.println("Hero of the movie : "+hero);
		System.out.println("Heroine of the movie : "+heroine);
		System.out.println("Budget of the movie : "+budget);
	}

}
