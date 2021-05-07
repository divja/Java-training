package Oop;

class person {
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name + " is walking ");
	}
	void eat() {
		System.out.println(email);
	}
	void sleep() {
		System.out.println(name + " is sleeping ");
	}
	
}

public class Demo {
	
	public static void main(String[] args) {
		// Instantiating an object
		person person1 = new person();
		
		// define some properties
		person1.name ="joe";
		person1.email = "joetext@gmail.com";
		person1.phone = "7995696415";
		
		//Abstraction
		person1.walk();
		
		person person2 = new person();
		person2.name = "sarah";
		person2.sleep();
		
		
		
		
	/*
		// person
	
		// attributes, variables, adjectives, descriptors
		String name = "joe";
		String email = "joe@testemail.com";
		String phone = "7995696415";
		
		// action , activity , behaviour
		//System.out.println(name + " is walking");
		walking(name);
		System.out.println(name + " is eatting");
		
		// what if we wanted to do this for another person
		String name2 = "sarah";
		String email2 = "sarah@testemail.com";
		String phone2 = "4157995696";
		
		// action , activity , behaviour
		//System.out.println(name2 + " is walking");
		walking(name2);
		System.out.println(name2 + " is eatting");
		
		}
		//enhance by adding functions to minimize the code
		static void walking(String name){
		  System.out.println(name + " is walking");
     */  
	}
	}



 