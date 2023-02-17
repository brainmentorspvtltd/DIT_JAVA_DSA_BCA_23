class Account1 {
	String name;
	int acc_no;
	void withdraw() {
		System.out.println("Withdraw Limit is 50K");
	}
	void deposit() {
		System.out.println("Deposit Limit is 1 Lac");
	}
}

//IsA Relationship
class SavingAccount1 extends Account1 {
	@Override
	void withdraw() {
		System.out.println("Withdraw Limit is 1 Lac for Saving Acc");
	}
	void roi() {
		System.out.println("ROI for Saving Acc is 5.6%");
	}
}

class CurrentAccount1 extends Account1 {
	@Override
	void deposit() {
		System.out.println("Deposit Limit is 3 Lac");
	}
	void emi() {
		System.out.println("EMI will be deducted on 1st date of month");
	}
}

public class IsADemoP2 {
	
//	Polymorphic Call
	void caller(Account1 acc) {
		acc.withdraw();
		acc.deposit();
		if(acc instanceof SavingAccount1) {
			// Downcasting
			((SavingAccount1) acc).roi();
		}
		else if(acc instanceof CurrentAccount1) {
			((CurrentAccount1) acc).emi();
		}
		System.out.println("=====================");
	}

	public static void main(String[] args) {
		
		IsADemoP2 obj = new IsADemoP2();
		obj.caller(new SavingAccount1());
		obj.caller(new CurrentAccount1());

	}

}
