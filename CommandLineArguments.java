public class CommandLineArguments {
    public static void main(String[] args) {
        // String firstName = args[0];
        // String lastName = args[1];
        // String fullName = firstName + " " + lastName;
        // System.out.println("Welcome : " + fullName);

        // Type Casting
        // Integer - wrapper class
        // converting string into int data type using Integer wrapper class
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = x + y;
        System.out.println("Sum is : " + z);
    }
}
