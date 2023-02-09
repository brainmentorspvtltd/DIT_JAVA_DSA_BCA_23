//POJO - Plain Old Java Object
//SRP - Single Responsibility Principle

public class StudentData {
	int rollNo;
	public String name;
	double fees;
	protected double marks;
	
	public void takeInput(int rollNo, String name, double fees, double marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.fees = fees;
		this.marks = marks;
	}
	
	public void showDetails() {
		System.out.println("Roll No : " + this.rollNo);
		System.out.println("Name : " + this.name);
		System.out.println("Fees : " + fees);
		System.out.println("Marks : " + marks);
	}
}
