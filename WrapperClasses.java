import java.math.BigInteger;

public class WrapperClasses {
    public static void main(String[] args) {
        int x = 12;
        Integer x1 = 21;

        byte b = 10;
        Byte b1 = 102;

        short s = 111;
        Short s1 = 343;

        String str = "Ravi";
        String str_2 = new String("Ravi");
        String str_3 = "Ravi";

        // compare references of 2 strings
        // System.out.println(str == str_2);
        System.out.println(str == str_3);

        // compare value of string
        System.out.println(str.equals(str_2));

        BigInteger a = new BigInteger("232553353434242343242342");
        BigInteger b2 = new BigInteger("10");
        BigInteger c = a.add(b2);
        System.out.println(c);
    }
}
