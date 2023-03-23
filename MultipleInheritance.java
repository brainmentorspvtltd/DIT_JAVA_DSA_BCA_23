// class X {
//     X() {}
// }

// class Y {
//     Y() {}
// }

// class Z extends X, Y {
//     Z() {
//         super();
//     }
// }

interface X {
    int bal = 12;
    void show(int x);
}

interface Y {
    int bal = 20;
    void show(String name);
}

interface I1 extends X,Y {
    int bal = 30;
    void show(byte x);
    // void show();
}

// class Z implements X, Y {
abstract class Z implements I1 {
    int x;
    Z() {
        x = 12;
        System.out.println("Constructor of abstract class");
        int total = X.bal + Y.bal + bal;
        System.out.println("Total : " + total);
    }
    // @Override
    // public void show() {

    // }
    @Override
    public void show(int x) {
        
    }
    @Override
    public void show(String name) {
        
    }
    @Override
    public void show(byte x) {
        
    }

    // public void caller() {
    //     show();
    // }
}

public class MultipleInheritance extends Z {
    MultipleInheritance() {
        super();
    }
    public static void main(String[] args) {
        MultipleInheritance obj = new MultipleInheritance();
        // Z obj_2 = new Z();
        System.out.println(X.bal);
    }
}
