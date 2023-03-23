import static java.lang.System.out;

class User {
    static int AUTO_INCREMENT;
    int id;
    String name;

    // loads with class
    static {
        AUTO_INCREMENT = 100;
    }

    // Init block - loaded when we create object
    // but loaded before constructor
    {
        System.out.println("Init block...");
    }

    public User(String name) {
        AUTO_INCREMENT++;
        this.id = AUTO_INCREMENT;
        this.name = name;
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        User ram = new User("Ram");
        out.println(ram.id + "," + ram.name);

        User shyam = new User("Shyam");
        out.println(shyam.id + "," + shyam.name);

        out.println("Ram ID : " + ram.id);
    }
}
