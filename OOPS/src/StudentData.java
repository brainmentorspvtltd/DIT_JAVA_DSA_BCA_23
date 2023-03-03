//POJO - Plain Old Java Object
//SRP - Single Responsibility Principle

//Encapsulation - wrap methods and variables in a single unit known as class
//Data Hiding - make members private
//Good Encapsulation - Data Hiding + Encapsulation

//Getter and Setter

public class StudentData {
//	int rollNo;
//	public String name;
//	double fees;
//	protected double marks;
//	String college;
	
	private int rollNo;
	private String name;
	private double fees;
	private double marks;
	private String college;
	
	// when we make a class, there is a by default constructor
	// use constructor to initialize variables
	// default constructor will be automatically called when we create object
//	public StudentData() {
//		this.rollNo = 101;
//		this.name = "Ram";
//		this.fees = 4500.00;
//		this.marks = 80.55;
//	}
	
	public StudentData() {
		System.out.println("Default Const. Called...");
		this.college = "DIT";
	}
	
	public StudentData(String college) {
		this();
		this.college = college;
	}

//	Parameterized constructor
	public StudentData(int rollno, String name, double fees, double marks) {
		// Constructor Chaining
		//this(); // will call default constructor...
		this("DU");
		System.out.println("Parameterized Const. Called...");
		this.rollNo = rollno;
		this.name = name;
		this.fees = fees;
		this.marks = marks;
	}
	
	// Getter
//	public int getRollNo() {
//		return this.rollNo;
//	}
	// Setter
//	public void setRollNo(int rollNo) {
//		this.rollNo = rollNo;
//	}
	

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}
	
//	use functions to build logic only
//	public void takeInput(int rollNo, String name, double fees, double marks) {
//		this.rollNo = rollNo;
//		this.name = name;
//		this.fees = fees;
//		this.marks = marks;
//	}
	
//	public void showDetails() {
//		System.out.println("Student College : " + this.college);
//		System.out.println("Roll No : " + this.rollNo);
//		System.out.println("Name : " + this.name);
//		System.out.println("Fees : " + fees);
//		System.out.println("Marks : " + marks);
//	}
	
	@Override
	public String toString() {
		return name + "," + rollNo + "," + fees + "," + marks;
	}
}
