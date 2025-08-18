public class StudentRegistration {
	int rollno;
	String name;
	String course;
	static int nextroll = 101;
	StudentRegistration(){
		System.out.println("No arg constructer called");
	}
	StudentRegistration(String name,String course){
		this.name = name;
		this.course = course;
		this.rollno = nextroll++;
	}
	public static void main(String[] args) {
		StudentRegistration S = new StudentRegistration("Siddu","JFS");
		S.show();
		
		StudentRegistration S1 = new StudentRegistration("Viswas","JFS");
		S1.show();
		
		StudentRegistration S2 = new StudentRegistration("Moni","JFS");
		S2.show();
		
		StudentRegistration S3 = new StudentRegistration("Puneeth","JFS");
		S3.show();
	}
	
	void show() {
		System.out.println("Roll no of the Student : "+nextroll);
		System.out.println("Name of the Student : "+name);
		System.out.println("Course : "+course);
	}

}
