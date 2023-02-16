import java.util.Date;
import java.util.Iterator;

public class Employee // extends Object 
{
//	Instance Variables
	private int id;
	private String name;
	private String dept;
	private double salary;
	private String companyName;
	
	public Employee() {
		this.companyName = "Brain Mentors";
	}
	
	public Employee(int id, String name, String dept, double salary) {
		this();		//will call default constructor
//		Instance Variable = Local Variables
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public String getCompany() {
		return companyName;
	}
	
	// Earnings
	private double hra() {
		return salary * 0.50;
	}
	private double da() {
		return salary * 0.20;
	}
	private double ta() {
		return salary * 0.15;
	}
	private double ma() {
		return salary * 0.15;
	}
	// Deductions
	private double tds() {
		return salary * 0.10;
	}
	private double pf() {
		return salary * 0.05;
	}
	
	// Gross Salary = Basic Salary + Earnings
	private double grossSalary() {
		return salary + hra() + da() + ta() + ma();
	}
	
	private double tax() {
		return grossSalary() * 0.10;
	}
	
	private double netSalary() {
		return grossSalary() - pf() - tds() - tax();
	}
	
	@Override
	public String toString() {
		Date date = new Date();
		Formatting format = new Formatting("en","US");
		String dateFormat = format.dateFormat(date);
		this.name = format.getTitleCase(name);
		String salaryFormat = format.format(netSalary());		
		return "Date : " + dateFormat + 
				"\n" + "Name : " + getName() + 
				"\n" + "Department : " + getDept() + 
				"\n" + "Net Salary : " + salaryFormat;
	}
	
}
