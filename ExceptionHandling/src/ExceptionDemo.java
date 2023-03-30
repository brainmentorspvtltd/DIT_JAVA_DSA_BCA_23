import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number : ");
			int num_1 = scanner.nextInt();
			System.out.println("Enter another number : ");
			int num_2 = scanner.nextInt();
			
			int sum = num_1 + num_2;
			System.out.println(sum);
			int sub = num_1 - num_2;
			System.out.println(sub);
			int div = num_1 / num_2;
			System.out.println(div);
			int mul = num_1 * num_2;
			System.out.println(mul);
			scanner.close();
		}
		
		catch (InputMismatchException e) {
			System.out.println("Invalid Input...");
		}
		catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero...");
		}
		catch (Exception e) {
			System.out.println("Something went wrong...");
		}
		

	}

}
