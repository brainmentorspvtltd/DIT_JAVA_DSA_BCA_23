import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {
	
	// DAO - Data access object
	static void dao() throws InputMismatchException, ArithmeticException {
		System.out.println("Connection Open...");
		Scanner scanner = new Scanner(System.in);;
		try {
			System.out.println("Enter first num : ");
			System.out.println("Enter second num : ");
		}
//		catch(Exception e) {
//			System.out.println("Some exception...");
//		}
		finally {
			scanner.close();
		}
	}
	
	static void helper() throws InputMismatchException, ArithmeticException {
		dao();
	}
	
	static void view() {
		try {
			helper();
		}
		catch (InputMismatchException e) {
			// TODO: handle exception
		}
		catch(ArithmeticException e) {
			
		}
	}

	public static void main(String[] args) {
		view();
	}

}
