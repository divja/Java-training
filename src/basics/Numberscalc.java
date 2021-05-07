package basics;

public class Numberscalc {
	public static void main(String[] args) {
		System.out.println("program is starting");
		printname();
		int numA =10;
		int numB = 20;
		addnumbers(numA, numB);
		int product = multiplynumbers(numA, numB);
		//System.out.println (multiplynumbers(numA, numB));
		System.out.println("the product of numbers " + numA + " and " + numB + " is " + product);
		
		

		
		
		
		} 
		
		static void printname() {
			System.out.println("My name is Trim.");
			
			}
		static void addnumbers(int numberA, int numberB) {
			int sum = numberA + numberB;
			System.out.println("The sume of numbers "+  numberA  + " and " + numberB  + " is " + sum);
			
		}
		static int multiplynumbers(int valueA, int valueB) {
			int product =valueA * valueB;
			addnumbers( product + 50, product);
			return product;
			
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
		
		}


