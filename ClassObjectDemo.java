class FirstClass {
	// Data Members
	int x = 12;
	int y = 20;
	// Member Function
	void showDetails() {
		System.out.println("Show Details Called...");
	}
}

public class ClassObjectDemo {
	int x = 12;
	int y = 20;

	public static void main(String[] args) {
		
		// creating object class FirstClass
		FirstClass obj = new FirstClass();
		// FirstClass = data type of obj variable
		// obj = reference variable, that refers to object
		// new = allocates new memory to the object
		// FirstClass() - Default Constructor of FirstClass
		System.out.println(obj.x + "," + obj.y);
		obj.showDetails();
	}

}
