//S.O.L.I.D
//D - DRY - Don't Repeat Yourself
//S - SRP - Single Responsibility Principle

class StudentDetails {
	// default scope - accessible within the package only
	int rollNo;
	// public scope - accessible from anywhere
	public String name;
	// private scope - accessible only within class
	// private double fees;
	double fees;
	// protected scope - accessible outside package using Inheritance
	protected double marks;
	
	public void takeInput(int rollNo, String name, double fees, double marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
		this.marks = marks;
	}
	
	public void showDetails() {
		// this = refers to the current object
		// using this here is optional
		//System.out.println("Roll No : " + rollNo);
		System.out.println("Roll No : " + this.rollNo);
		//System.out.println("Name : " + name);
		System.out.println("Name : " + this.name);
		System.out.println("Fees : " + fees);
		System.out.println("Marks : " + marks);
	}
	 
}

public class Student {

	public static void main(String[] args) {
		StudentDetails ram = new StudentDetails();
//		ram.rollNo = 101;
//		ram.name = "Ram";
//		ram.fees = 4500.00;
//		ram.marks = 67.45;
		ram.takeInput(101, "Ram", 4500.00, 66.55);
		ram.showDetails();
		
		/*
		 * System.out.println("Roll No : " + ram.rollNo); 
		 * System.out.println("Name : " +ram.name); 
		 * System.out.println("Fees : " + ram.fees);
		 * System.out.println("Marks : " + ram.marks);
		 */
		
		StudentDetails shyam = new StudentDetails();
//		shyam.rollNo = 102;
//		shyam.name = "Shyam";
//		shyam.fees = 4500.00;
//		shyam.marks = 85.00;
		shyam.takeInput(102, "Shyam", 80.33, 4500.00);
		
//		System.out.println("Roll No : " + shyam.rollNo);
//		System.out.println("Name : " + shyam.name);
//		System.out.println("Fees : " + shyam.fees);
//		System.out.println("Marks : " + shyam.marks);
		
		shyam.showDetails();
		
		// Local variables
		// int x;
		// int y;
		// System.out.println(x + "," + y);

	}

}
