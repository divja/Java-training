package Oop;

public class BankAccountApp {

	public static void main(String[] args) {
 // creating a new bank account >> think instantiate an object
	 BankAccount acc1 = new BankAccount();
	// acc1.name = "Roger Hue";
	 // with encapsulation
	 acc1.setName ("Roger Hue");
	 System.out.println(acc1.getName());
	 acc1.Accountnumber = "0689453";
	 acc1.setSsn("234823432");
	 System.out.println(" SSN :" + acc1.getSsn());
	 acc1.setRate();
	 acc1.increaseRate();
	 
	 acc1.balance = 10000;
	 
	 acc1.deposit(1500);
	 acc1.deposit(1500);
	 acc1.deposit(1500);
	 acc1.withdraw(2000);
	
	 
	 // polymorphism through overriding
	 System.out.println(acc1.toString());
	 
	 // polymorphism through overloading
	 BankAccount acc2 = new BankAccount("Checking Account");
	 acc2.Accountnumber = "0689453";
	 
	 BankAccount acc3 = new BankAccount("Savings Account", 5000);
	 acc3.Accountnumber = "0689453";
	 
	 /*
	 acc3.checkbalance();
	// Demo for inheritance
	 CDAccount cd1 = new CDAccount();
	  cd1.balance = 3000;
	  cd1.interestRate = "4.5";
	  cd1.name = "Jaun";
	cd1.Accounttype = "CD Account";
	System.out.println(cd1.toString());
	cd1.compount();
	*/
	 }

}
