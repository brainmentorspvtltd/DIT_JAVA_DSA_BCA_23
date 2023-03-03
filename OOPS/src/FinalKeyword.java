//S.O.L.I.D
//O - Open Close Principle
//Class is open for extension but closed for modification

//final class - class cannot be inherited
//final class A1 {
//	
//}

class A1 {
	void show() {
		
	}
	// final method - method cannot be overrided
	final void takeInput() {
		
	}
}

class B1 extends A1 {
	@Override
	void show() {
		// TODO Auto-generated method stub
		super.show();
	}
//	@Override
//	void takeInput() {
//		
//	}
}

public class FinalKeyword {

	public static void main(String[] args) {
		
		// final variable - we cannot change value of a final variable
		final double PI = 3.14;

	}

}
