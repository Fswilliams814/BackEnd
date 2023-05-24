package com.fdbwellness;

public class Application {

	public static void main(String[] args) {
		//ALL code between these curly braces will be what runs when the application is first started
		// TODO Auto-generated method stub
		//data type examples
		System.out.println("My first Java Program!");
		int numberOfFriends;
		int samsAge = 33;
		double accountBalance = 34.67;
		char middleInitial = 'C'; //has to be inbetween single quotes
		boolean isHotOutside = true;
		String firstName1 = "Sam";
		
		System.out.println(samsAge);
		System.out.println(accountBalance);
		System.out.println(middleInitial);
		System.out.println(isHotOutside);
		System.out.println(firstName1);
		
		//operation examples(+ - * /)
		int age = 34;
		System.out.println(age);
		age = age + 1;
		System.out.println(age);
		
		String firstName = "Tommy";
		String lastName = "Smith";
		String fullName = firstName + " " + lastName;
		System.out.println(fullName);
		
		boolean isAge30 = age == 30;
		System.out.println(isAge30);
		System.out.println(68 == 64);
		
		//variables in a savings account program
		double savingsAccountBalance = 29.00;
		double depositAmount = 100.00;
		double withdrawalAmount = 50.00;
		double newSavingsAccountBalance = 0.00;
		
		
		
		//balance inquiry
		
		System.out.println(String.format("The balance in your account is: $%.2f", savingsAccountBalance));
		
		//now deposit check
	
		newSavingsAccountBalance = savingsAccountBalance + depositAmount; // calculating the new balance
	
		System.out.println(String.format("You have deposited $%.2f", depositAmount)); 
		//%.2f (2 represents how many decimal places)
		
	
		System.out.println(String.format("Your new balance is $%.2f", newSavingsAccountBalance));
		
		//Now withdraw cash
		newSavingsAccountBalance = newSavingsAccountBalance - withdrawalAmount;
		System.out.println(String.format("Here is your withdrawal of $%.2f", withdrawalAmount));
		System.out.println(String.format("Your new balance is $%.2f", newSavingsAccountBalance));

		
		
		

	}

}
