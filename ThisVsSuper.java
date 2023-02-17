class P1 {
	int x;
	public P1() {
		System.out.println("Parent Class Constructor...");
	}
}

class C1 extends P1{
	int x;
	public C1() {
		super();	// will call parent class default constructor
		// internally super() is written by Java...
		System.out.println("Child Class Constructor...");
		this.x = 100;
	}
	
	public C1(int n) {
		//super();	// it is written internally
		this();	// C1 class default constructor
		x = x + n;
		System.out.println("X is : " + x);
	}
}

public class ThisVsSuper {

	public static void main(String[] args) {
		
		C1 obj = new C1(10);

	}

}
