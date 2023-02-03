package Programs;

public class PrimeNumberP3 {
    public static void main(String[] args) {
        int num = 100000007;
        boolean prime = true;

        if(num % 2 == 0 || num % 3 == 0) {
            prime = false;
            return;
        }

        int iter = 0;
        for(int i = 5; i*i <= num; i += 6) {
            iter++;
            if(num % i == 0 || num % (i + 2) == 0) {
                prime = false;
                break;
            }
        }
        System.out.println("Number of iterations : " + iter);
        if(prime) {
            System.out.println("Prime Number...");
        }
        else {
            System.out.println("Not Prime...");
        }
    }
}
