package Oop;

public class LoanAccount implements IRate {

	@Override
	public void setRate() {
		System.out.println("RATE");
		
		
	}

	@Override
	public void increaseRate() {
		System.out.println("INCREASE RATE");
		
	}
	
   public void setTerm(int term) {
	   System.out.println("Setting the term to: " + term + " years.");
	   
   }
   
   public void ammortschedule() {
	   System.out.println("Ammoertization schedule");
	   
   }


	}


