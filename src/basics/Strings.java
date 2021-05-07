package basics;

public class Strings {

	public static void main(String[] args) {
		String bookTitle;
		String wordChoice = "Ring";
		bookTitle = "The Lord of the Ring" ;
		
		if ( bookTitle.contains(wordChoice)) {
		System.out.println(" The book contains the word " + bookTitle);
		
	  }
		
		
		String browser = "chrome" ;
		//browser = "chrome";
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.out.println(" the browser is chrome");
		}
		String FirstName = "Trim";
		String lastName  = "short";
		String SSN       =  "984162168";
		
		System.out.println(" There are " + SSN.length() + " digits in your SSN ");
		
		System.out.print(FirstName.substring(0,1));
		System.out.print(lastName.substring(0,3));
		System.out.print(SSN.substring(5));
		
		
	}
}
			
			
		

   

