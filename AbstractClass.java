abstract class Loan {
    void applyForLoan() {
        System.out.println("Apply for loan...");
    }
    // static void applyForLoan() {
    //     System.out.println("Apply for loan...");
    // }
    abstract void emi();
}

class HomeLoan extends Loan {

    @Override
    void emi() {
        
    }
    
}

class EduLoan extends Loan {

    @Override
    void emi() {
        
    }

}

public class AbstractClass {
    public static void main(String[] args) {
        //Loan loan = new Loan();
        HomeLoan loan = new HomeLoan();
        loan.applyForLoan();
        loan.emi();

        EduLoan eduLoan = new EduLoan();
        eduLoan.applyForLoan();
        eduLoan.emi();

        // Player obj = new Player();
    }
}
