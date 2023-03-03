class A2 {
	int x = 12;
	void c_show() {
		System.out.println("Parent Class Show : X is : " + x);
	}
}

class B2 extends A2 {
	int x = 20;
	void c_show() {
		System.out.println("Child Class Show : X is : " + x);
	}
}

public class MethodVsVariableOverriding {

	public static void main(String[] args) {
		
		A2 obj_a = new A2();
		B2 obj = new B2();
		//obj.p_show();
		obj_a.c_show();
		obj.c_show();
		System.out.println("X is : " + obj.x);

	}

}
