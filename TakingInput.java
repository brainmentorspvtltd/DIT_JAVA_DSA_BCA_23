import java.io.IOException;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) throws IOException {
        
        // read() - reads 1 byte at a time
        // read() returns int type of value i.e., ASCII of input data
        // int name = System.in.read();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your ID : ");
        int id = scanner.nextInt(); // 101  \n

        scanner.nextLine();  // this statement will eat the remanining \n

        System.out.println("Enter your name : ");
        // nextLine takes input till \n
        String name = scanner.nextLine();

        // next takes input till space only
        // String name = scanner.next();

        System.out.println("Enter your age : ");
        byte age = scanner.nextByte();

        System.out.println("Enter your salary : ");
        double salary = scanner.nextDouble();

        System.out.println("ID : " + id);
        System.out.println("Welcome : " + name);
        System.out.println("Age : " + age);
        System.out.println("Salary : " + salary);

        scanner.close();
    }
}
