class A3 {
	// default scope
	private void show() {
		
	}
}

class B3 extends A3{
	//@Override
	public void show() {
		System.out.println("Show method inside child...");
	}
}

public class WeakerAccessRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
