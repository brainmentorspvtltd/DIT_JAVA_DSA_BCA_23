package Programs;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 100000007;
        boolean prime = true;
        int iter = 0;
        for(int i = 2; i < num/2; i++) {
            iter++;
            if(num % i == 0) {
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
