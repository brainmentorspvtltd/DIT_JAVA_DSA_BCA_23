class Account {
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
class SavingAccount extends Account {
	@Override
	void withdraw() {
		System.out.println("Withdraw Limit is 1 Lac for Saving Acc");
	}
	void roi() {
		System.out.println("ROI for Saving Acc is 5.6%");
	}
}

class CurrentAccount extends Account {
	@Override
	void deposit() {
		System.out.println("Deposit Limit is 3 Lac");
	}
	void emi() {
		System.out.println("EMI will be deducted on 1st date of month");
	}
}

public class IsADemo {

	public static void main(String[] args) {
		// DRY
//		SavingAccount sa = new SavingAccount();
//		sa.withdraw();
//		sa.deposit();
//		sa.roi();
//		
//		System.out.println("=================");
//		
//		CurrentAccount ca = new CurrentAccount();
//		ca.withdraw();
//		ca.deposit();
//		ca.emi();
		
		Account acc = new SavingAccount();		// UpCasting
		acc.withdraw();		// will execute SavingAccount withdraw
		acc.deposit();		// will execute Account withdraw
		//acc.roi();
		
		System.out.println("=================");
		
		acc = new CurrentAccount();
		acc.withdraw();		// will execute Account withdraw
		acc.deposit();		// will execute CurrentAccount withdraw
		//acc.emi();
	}

}
