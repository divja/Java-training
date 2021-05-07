package Oop;

/**
 * @author Divija
 *
 */
/**
 * @author Divija
 *
 */
public class BankAccount implements IRate {
	// define variables
	String Accountnumber;
	// static >> belongs to class not to object instance
	// final >> constant (often static final)
	 private static final String routingNumber = "013546";
	// instant variables
	private String name;
    private String ssn;
    String Accounttype;
    double balance;
    
    // constructor defination = unique methods
    //1.they are used ti define / setup / initialise properties of an object
    //2. constructors are IMPLICITY called upon INSTANTIATION
    //3.the sam ename as the same class itself
    //4. constructors have no return type
    BankAccount(){
    System.out.println("NEW ACCOUNT CREATED");
    }
    // overloading : same method name with different arguments
    BankAccount(String AccountType){
    	System.out.println("NEW ACCOUNT: " + AccountType);
    }
    BankAccount(String AccountType, double initDeposit){
    	// initDeposite , new account,accountType are the local variables
    	System.out.println("NEW ACCOUNT: " + AccountType);
    	System.out.println("INITIAL DEPOSIT OF : $ " + initDeposit);
    	String msg = null;
         if (initDeposit < 1000) {
    	 msg = "ERROR : Minimum deposite must be least $1000";
     
    	} else {
    	 msg = "Thanks for your initial deposite of : $"  + initDeposit;

    	}
    	System.out.println(msg);
    	balance = initDeposit;
    	
   }
    
    // Getters/Setters
    // Allow the user to define the name
    public void setName(String name) {
    	this.name = " Mr."+ name;
    	
    }
    public String getName() {
    	return name;
    	
    }
    
    public String getSsn() {
		return ssn;

    }
	public void setSsn(String ssn) {
		this.ssn = ssn;
		
	}
	
	// Interface Method
	
	public void setRate() {
		System.out.println("SETTING RATE");
	}
	public void increaseRate() {
		System.out.println("INCREASING RATE");
		
		
	}
	
	
	
	
	
	
// define methods
   public void deposit(double amount) {
	   balance = balance + amount;
    	showActivity("DEPOSIT");
 
    }
    void withdraw(double amount) {
    	balance = balance + amount;
    	showActivity("WITHDRAW");
    }
    private void showActivity(String activity){
    	System.out.println(" YOUR RECENT TRANSACTION : " + activity);
    	System.out.println(" YOUR NEW BALANCE IS : $" + balance);
    	
    	
    }
     void checkbalance() {
    	System.out.println("balance " +  balance);
    }
    void getstatus() {
    	
    }
    @Override 
     public String toString() {
    	return "[NAME:" + name + " . Acoount# " + Accountnumber + " .Routing#" + routingNumber + "BALANCE : $ " + balance + "]" ; 
    }
   }


