//Super vs This
//- reserved keywords in java
//- this keyword refers to current class object
//- super keyword refers to the parent class object

class Parent {
	int x;
	public Parent() {
		x = 10;
		System.out.println("Parent class default constructor...");
	}
}

class Child extends Parent{
	int x;
	public Child() {
		super();		// internally java uses super to call parent class const.
		this.x = 20;
		System.out.println("Child class default constructor...");
	}
	public Child(int x) {
		//super();
		this();	// calling default constructor of Child Class
		//Local Variable + Instance Variable + Parent Class Variable
		int n = x + this.x + super.x;
		System.out.println("Sum is : " + n);
	}
}

public class SuperVsThis {

	public static void main(String[] args) {
		
//		Child obj = new Child();
		Child obj = new Child(11);

	}

}
