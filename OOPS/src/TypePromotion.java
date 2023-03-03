import java.util.ArrayList;

public class TypePromotion {
	
	void show(byte x) {
		System.out.println("Byte X...");
	}
	
	void show(short x) {
		System.out.println("Short X...");
	}
	
//	void show(int x) {
//		System.out.println("Int X...");
//	}
	
//	void show(long x) {
//		System.out.println("Long X...");
//	}
	
//	void show(float x) {
//		System.out.println("Float X...");
//	}
	
//	void show(double x) {
//		System.out.println("Double X...");
//	}
	
//	void show(Integer x) {
//		System.out.println("Integer Wrapper Class X...");
//	}
	
//	void show(Float x) {
//		System.out.println("Float Wrapper Class X...");
//	}
	
//	void show(int ...x) {
//		System.out.println("Variable Length Args X...");
//	}

	public static void main(String[] args) {
		
		TypePromotion obj = new TypePromotion();
		//obj.show(5);	// java always gives first chance to int
		// if int is not available then it gives chance to long	
		// (Type Widening)
		// if long is not available, it gives chance to float
		// if float is not available, it gives chance to double
		// Wrapper Classes
		// if double is not available, it gives chance to Integer Wrapper
		// if Integer Wapper is not available, it gives chance to Float Wrapper
		// var args
		//obj.show(3,4,6);
		
		//obj.show((byte)5);
		obj.show((short)5);
		
		// Old style of boxing
		//Integer c = new Integer(5);
		// Old style of unboxing
		//int c1 = c.intValue();
		
		// Autoboxing
		Integer c1 = 23;
		int x = c1;
		
		//ArrayList<Task> obj = new ArrayList<>();
		//obj.add(task)
		
		//obj.get(0);
		

	}

}
