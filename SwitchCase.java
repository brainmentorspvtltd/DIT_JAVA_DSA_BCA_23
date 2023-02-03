package ControlFlow;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Division");
        System.out.println("4. Multiplication");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice : ");

        int choice = scanner.nextInt();

        System.out.println("Enter first number : ");
        int fnum = scanner.nextInt();

        System.out.println("Enter second number : ");
        int snum = scanner.nextInt();

        int result = 0;

        switch(choice) {
            case 1:
            result = fnum + snum;
            System.out.println("Addition is : "+ result);
            break;
            case 2:
            result = fnum - snum;
            System.out.println("Subtraction is : "+ result);
            break;
            case 3:
            result = fnum / snum;
            System.out.println("Division is : "+ result);
            break;
            case 4:
            result = fnum * snum;
            System.out.println("Multiplication is : "+ result);
            break;
            default:
            System.out.println("Invalid Choice...");
        }

        scanner.close();
    }
}
