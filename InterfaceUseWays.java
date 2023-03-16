// SAM Interface - Single Abstract Method
// FunctionalInterface - which contains SAM

@FunctionalInterface
interface Calc {
    int compute(int x, int y);
    // void add();
}

// class MyCalc implements Calc {

//     @Override
//     public int compute(int x, int y) {
//         System.out.println("Computer x and y");
//         return x + y;
//     }
    
// }

public class InterfaceUseWays {
    public static void main(String[] args) {
        // Class Way
        // MyCalc obj = new MyCalc();
        // obj.compute(12, 20);

        // here it's not creating object of interface
        // here java creates an anonymous class on runtime
        // so it creates object of that class
        // internally this class is now implementing interface calc

        // Calc obj = new Calc() {
        //     @Override
        //     public int compute(int x, int y) {
        //         System.out.println("Compute...");
        //         return x + y;
        //     }
        // };
        // obj.compute(12, 20);

        // the drawback of this code is that it creates a separate byte code
        // for anonymous class


        // Lambda Expressions
        // (a,b) - arguments
        // a + b - function returns a + b
        Calc c = (a,b) -> a + b;
        System.out.println(c.compute(12, 32));

        Calc c1 = (a,b) -> {
            // it's like we are overriding compute and adding some logic in it
            int z = a + b;
            System.out.println("Perform Addition...");
            return z;
        };
        System.out.println(c1.compute(12, 60));

        
        // Example of lambda expression
        // new Thread(() -> {
        //     System.out.println("Thread created...");
        // }).start();

    }
}
