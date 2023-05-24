package Week2;

public class Week02BooleanConditionalsLoopsLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		// BOOLEANS and CONDITIONALS:
		//
		
		// 1. Variable Declaration:
		//		a. Create a variable named age and assign it a value of 14
				int age = 17;

		
		
		// 2. Print a Boolean Expression:
		//		a. Print the boolean expression age >= 16 to the console and note the results.
		//		a. Change the value of age to 18 and print again.
				System.out.println(age >= 16);


		
		// 3. Can you drive?
		//		a. Using a conditional, print one of the following:
		//				i. "You can drive" if age is greater than or equal to 16
		//				ii. "You cannot drive" otherwise
//				if(age >= 16) {
//					System.out.println("You can drive");
//				} else {
//					System.out.println("You cannot drive");
//				}
		//
		//		a. Change the value of age and rerun to see the result
	

		
		// 4. Update Solution to Question 3 as follows:
		//		a. Add a new variable called hasLicense before the conditional.
				boolean hasLicense = false;
				if(age >= 16 && hasLicense) {
					System.out.println("You can drive");
				} else {
					System.out.println("You cannot drive");
				}
		//		b. Change the boolean expression in the conditional to additionally 
		//				include the need for hasLicense to be true.
		//		c. Try changing the values of age and hasLicense and note the different results.

		
		
		// 5. Milk?
		//		a. Create two new variables - costOfMilk and thirstLevel
				double costOfMilk = 1.99;
				int thirstLevel = 8;
		//		b. Create a new conditional that prints "Milk Please" if costOfMilk is less than 2.50 
		//				or if thirstLevel is greater than 6 and prints "No Thanks" otherwise.
				if (costOfMilk < 2.50 || thirstLevel > 6) {
					System.out.println("Milk Please");
				} else {
					System.out.println("No thanks");
				}
		//		c. Change the values and note the different results.

	
		
		// 6. Cookie Distribution: 
		//			Note:  You will evenly distribute all of the cookies to the children 
		//					and as the adult you get to keep the remaining cookies for yourself.
		//
		//		a. Create two variables called numberOfCookies and numberOfChildren.
				int numberOfCookies = 0;
				int numberOfChildren = 2;
		//		b. Initialize the two variables to integer values.
		//		b. Use a conditional to print the following based on the following conditions:
		//				i. If there are 0 cookies remaining, print "Sad Face"
		//				ii. If there are less than 2 cookies, print "Yes!"
		//				iii. If there are less than 5 cookies, print "Whoohoooo!"
		//				iv. If there are 5 or more cookies, print "Jackpot!"
				if (numberOfCookies >= 5) {
					System.out.println("Jackpot!");
				} else if (numberOfCookies < 5 && numberOfCookies >= 2) {
					System.out.println("Whoohooo!");
				}else if (numberOfCookies < 2 && numberOfCookies > 0) {
					System.out.println("Yes!");
				}else {
					System.out.println("Sad face");
				}

		
				
		// 7.  Loyalty Member Program:
		//		a. Create a variable called loyaltyMemberStatus and assign the value "SILVER"
				String loyaltyMemberStatus = "SILVER";
		//		b. Create a variable called loyaltyMemberDiscount and assign the value 0.0
				double loyaltyMemberDiscount = 0.15;
		//		c. Using a switch, set the value of loyaltyMemberDiscount based on 
		//				the following loyaltyMemberStatus scale: 
		//				i. "SILVER" is 0.10
		//				ii. "GOLD" is 0.15
		//				iii. "PLATINUM" is 0.25
				switch (loyaltyMemberStatus) {
				case "SILVER":
					loyaltyMemberDiscount = 0.10;
					break;
				case "GOLD":
					loyaltyMemberDiscount = 0.15;
					break;
				case "PLATINUM":
					loyaltyMemberDiscount = 0.25;
					default:
				}
		

		
		// 8. Using the Loyalty Member Program variables from Question 7, do the following:
		//		a. Create a variable called billTotal and assign a value
				double billTotal = 1000.99;
		//		b. Create a variable called adjustedTotal and assign it the billTotal minus
				double adjustedTotal = billTotal - (loyaltyMemberDiscount * 100);
		//				the loyaltyMemberDiscount percent of the billTotal
		//		c. If the adjustedBillTotal is greater than $500 upgrade the 
		//				loyaltyMemberStatus from SILVER to GOLD or from GOLD to PLATINUM
				if(adjustedTotal > 500) {
					if(loyaltyMemberStatus == "SILVER") {
						loyaltyMemberStatus = "GOLD";
						System.out.println("You've been upgraded to " + loyaltyMemberStatus + " !");
					} else if (loyaltyMemberStatus == "GOLD") {
						loyaltyMemberDiscount = 0.25;
						System.out.println("You've been upgraded to " + loyaltyMemberStatus + " !");
					}
				} System.out.println("Thank you for being a valued member!");


		
		// 9. Login -- username & password:
		//		a. Create two variables, username and password
				String username = "Tommy123";
				String password = "12345";
					
		//		b. Create a conditional that prints one of the following:
		//				i. "login successful" if the username is "Tommy123" and the password is "12345"
		//				ii. "access denied" otherwise
				
				if(username == "Tommy123" && password == "12345") {
					System.out.println("Login successful");
				}else {
					System.out.println("Access denied");
				}

		
		
		//
		// LOOPS:
		//
		
		// 10. Write a for loop that prints each number from 0 to 9
				for(int i = 0; i <=9; i++) {
					System.out.println(i);
					
				}

		
		
		// 11. Write a for loop that prints each number from 10 to 0 backwards
				for(int i= 10; i>=0; i--) {
					System.out.println(i);
				}

		
		
		// 12. Write a for loop that prints every other number from 0 to 100
				for(int i = 0; i<=100; i+=2) {
					System.out.println(i);
				}

		
		
		// 13. Write a for loop that iterates from 0 to 100 and prints 
		//			"EVEN" if the number is even and "ODD" if it's odd
				for(int i=0; i<=100; i++) {
					if(i % 2 == 0) {
						System.out.println("even");
					}else {
						System.out.println("odd");
					}
				}

		
		
		// 14. Write a while loop that starts at 100 and iterates backwards by 1 until it reaches 0
		//			within the loop, divide each number by 3 and print the remainder to the console.
				int i = 100;
				while(i <= 100 && i >=0) {
					i--;
					System.out.println(i % 3);
				}
				
				
				String name = "Tommy";

				  int age2 = 52;

				  if (name == "Tommy") {

				    System.out.println("Hi, Tommy!");

				  } else if (age2 == 52) {

				    System.out.println("52 years old.");

				  }

				  System.out.println("Out of conditional.");

				}


		


	}

