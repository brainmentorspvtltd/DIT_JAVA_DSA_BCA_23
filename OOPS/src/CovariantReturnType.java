class AmazonUser {
	void showDetails() {
		System.out.println("Show Details of Amazon User...");
	}
}

class PrimeUser extends AmazonUser{
	@Override
	void showDetails() {
		System.out.println("Show Details of Amazon User...");
		return;
	}
}

class NormalUser {
	AmazonUser showUser() {
		System.out.println("P1 show method...");
		AmazonUser obj = new AmazonUser();
		return obj;
	}
}

class PrimeMember extends NormalUser {
	@Override
	PrimeUser showUser() {
		System.out.println("P1 show method...");
		PrimeUser obj = new PrimeUser();
		return obj;
	}
}

public class CovariantReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
