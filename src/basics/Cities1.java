package basics;

public class Cities1 {
	
	
	public static void main(String[] args) {
		String[] cities = {" Newyork ", " sant francisco "," maimi ", " dallas "};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		String[] countries;
		countries = new String[3];
		countries[0] = " USA";
		countries[1] = " canada";
	    countries[2] = " UK";
	    System.out.println(countries[1]);
	
	   System.out.println("*********************");
    
    String[] States = new String[5];
	States[0] = "california";
	States[1] = " new jersy";
	States[2] =   " texas";
	States[3] =   " ohio";
	States[4] =   " utah";
	
	int i = 0;
	do {
	     System.out.println(" STATES: " + States[i]);
	     i = i + 1;
	} while (i < 5);
	
	int n = 0;
	boolean statefound = false;
		 while (!statefound) {
			 String state = States[n];
			 System.out.println(state);
			 if (state == "texas") {
		     System.out.println("STATE FOUND!");
			 statefound = true;
				 
			 }
		n++;
		
		System.out.println("\n PRINTING WITH FOR LOOP");
		for (int x = 0; x < 5; x++ ) {
			System.out.println(States[x]);
			
		}
	
	
	
 }
	}
	
}




