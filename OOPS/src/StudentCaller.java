public class StudentCaller {

	public static void main(String[] args) {
		
		// will create object using default constructor
//		StudentData obj = new StudentData();
//		obj.takeInput(101, "Ram", 4500.00, 66.55);
//		obj.showDetails();
		
		// will create object using parameterized constructor
		StudentData obj_2 = new StudentData(101,"Ram",4500.00,67.44);
		//obj_2.showDetails();
		
		// we can easily access any member variable of class 
		// if they are not private
		//obj_2.marks = 20.55;
		
		obj_2.setRollNo(102);
		System.out.println("Roll No : " + obj_2.getRollNo());
		
		System.out.println(obj_2);
		
	}

}
