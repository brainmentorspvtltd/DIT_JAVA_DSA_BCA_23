class A {
	int x;
	int timer;
	// Default Const...
	public A() {
		//this.x = 10;
		System.out.println("Const. Called..." + x);
	}
	
	// will be executed only once
	// will be executed even before init block...
	// because it gets loaded with class
	static {
		System.out.println("Static Block Executed...");
	}
	
	// Init Block - we use init block when we have to invoke something
	// even before constructor calling...
	// it will always execute
	{
		x = 20;
		timer = 1;
		System.out.println("Init Block Called..." + x);
	}
	
	// Parameterized Const...
	public A(int y) {
		this.x = y;
	}
}

public class InitBlock {
	// Static Block
	static {
		System.out.println("Static Block Executed...");
	}
	// Init Block
	{
		System.out.println("Init Block Executed...");
	}
	// Constructor Block
	public InitBlock() {
		System.out.println("Default Const. Executed...");
	}

	public static void main(String[] args) {
		
//		A obj = new A();
//		A obj_2 = new A(50);

	}

}
