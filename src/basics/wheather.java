package basics;

public class wheather {
	public static void main(String[] args) {
		// This program will suggests that want to wear based on the weather(temperature and sun condition)
		int temperature = 45;
		String suncondition = "overcast";
		
		if(temperature > 80) {
			System.out.println("its pleasant wear shorts and t-shirts");
		}
			
			else if((temperature > 60)&&(suncondition == "sunny")) {
				
				System.out.println("its a little cooler. perhaps wear a long sleeves and jeans.");
				System.out.println("wear a hat to keep the sun out of your eyes");
			}
				
		    else if((temperature > 50) || (suncondition == "overcast")) {
		    	
					System.out.println("its a  cool day, make sure to  wear warmer clothes.");
					
				}
				
				else {
				System.out.println("looks like a cool weather, bring a sweater");
				{
					
				System.out.println("the program is ending");
				}
				
				}
				
			
			

	
		

	
 

			
			
			
		
		
		
		
	}
		
	}



