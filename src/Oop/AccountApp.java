package Oop;

public class AccountApp {

	public static void main(String[] args) {
		LoanAccount la = new LoanAccount();
		la.increaseRate();
		la.setRate();
		la.ammortschedule();
		la.setTerm(20);

		// polymorphism changes where we are pointing
		IRate account1 = new LoanAccount();
		account1.increaseRate();
		account1.setRate();
		
	}

}
