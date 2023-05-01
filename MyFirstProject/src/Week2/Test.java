package Week2;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// == equality operator
		System.out.println(2 == 2);
		System.out.println(2 > 5);
		System.out.println(3 <=5);
		System.out.println(5 <= 5);
		// && and || or
		System.out.println(2 == 2 && 1 < 5);
		
		String name = "Dee";
		if (name == "Sam") {
			System.out.println("Hello Sam!");
		} else {
			System.out.println("You are not Sam, " + name);
		}
		
		int age = 15;
		if (age >= 16) {
			System.out.println("You can get your license!");
		}else {
			System.out.println("Please wait " + (16-age) + " year(s) to get your license.");
		}
		
		//if else/if statements - allows more than one condition to be checked
		
		double costOfMilk = 2;
		
		if (costOfMilk <= 2) {
			System.out.println("Buying 2");
		}else  if (costOfMilk <=3) {
			System.out.println("Buying 1");
		}else {
			System.out.println("Not buying any milk.");
		}
		
		//switch statements
		//grades
		char grade = 'A';
		//variable you want to evaluate goes in the parenthesis
		switch(grade) {
		case 'A':
			System.out.println("90%");
			break;
		case 'B':
			System.out.println("80%");
			break;
		case 'C':
			System.out.println("70%");
			//break means that when you meet the case go ahead and stop the code from running
			//if you want to check multiple things you can omit the break
			break;
		default:
			System.out.println("0%");
		
		}
		
		//multiple conditions together
		if(5 == 5) {
			if(4 == 4) {
				System.out.println("Yes");
			}
		}
		//flattening a statement (shortening the code)
		if(5 == 5 && 4 == 4) {
			System.out.println("yes");
		}
		//loops
		//declaring a for loop
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		for (int i = 1; i<= 10; i++) {
//			System.out.println(i);
//		}
		
		for (int i = 0; i < 100; i+=2) {
			if(i%2 == 0) {
				System.out.println(i);
			}
			
		}
		
		//while loop - you have less knowledge beforehand of how many loops are needed.
		int x = 0;
		while (x < 10) {
			System.out.println(x);
			//need to add an end point to ensure that we do not create an infinite loop
			//with the code the way it is above it will run infinitely because 0 will always be less than 10
			x++;
			//adding in x ++ increments x by 1 each loop so the loop will stop once x is 10 or greater
			
		}
		
		//another loop would be a do/while loop
		//do/while loop will always run at least once
		//checks the condition at the end of the code 
		do {
			System.out.println(x);
			x++;
		}while(x<2);
		
		//enhanced for loop - iteration for each item in a collection a list or an array
		//example grocery list, or bill or invoice to  customer, any time you use the word each in english that would call for an enhanced for loop
		
		//user input
		
		

	}

}
