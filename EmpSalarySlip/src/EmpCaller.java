import java.util.Scanner;

public class EmpCaller {

	public static void main(String[] args) {
		//System.out.println("Employee Salary Slip");
		MessageResourceBundleReader mr = new MessageResourceBundleReader();
		System.out.println(mr.getValue("msg"));
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(mr.getValue("input.id"));
		int id = scanner.nextInt();		// 101\n
		
		scanner.nextLine();
		
		System.out.println(mr.getValue("input.name"));
		String name = scanner.nextLine();
		
		System.out.println(mr.getValue("input.dept"));
		String dept = scanner.nextLine();
		
		System.out.println(mr.getValue("input.salary"));
		double salary = scanner.nextDouble();
		
		Employee emp_1 = new Employee(id, name, dept, salary);
//		System.out.println("Company : " + emp_1.getCompany());
//		System.out.println("ID : " + emp_1.getId());
//		System.out.println("Name : " + emp_1.getName());
//		System.out.println("Department : " + emp_1.getDept());
//		System.out.println("Basic Salary : " + emp_1.getSalary());
//		System.out.println("Net Salary : " + emp_1.netSalary());
		
		// When we try to print object variable then 
		// it will always print Hashcode
		//System.out.println(emp_1.toString());

		// internally toString will be called 
		System.out.println(emp_1);
		
		scanner.close();
	}

}
