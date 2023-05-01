package week01;

public class Week01VariableAndOperationsLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1. Create a variable to hold the quantity of 
		//available plane seats left on a flight	
		int availablePlaneSeats = 6;

				
		// 2. Create a variable to hold the cost of groceries at checkout
		double costOfGroceriesAtCheckout = 152.67;

				
		// 3. Create a variable to hold a person's middle initial
		char middleInitial = 'S';

			
		// 4. Create a variable to hold true if it's hot outside 
		//		and false if it's cold outside
		boolean isHotOutside = true;

				
		// 5. Create a variable to hold a customer's first name
		String firstName = "Pheobe";

				
		// 6. Create a variable to hold a street address
		String streetAddress = "71 Wood Ave" ;
				

		// 7. Print all variables to the console
		System.out.println(availablePlaneSeats);
		System.out.println(costOfGroceriesAtCheckout);
		System.out.println(middleInitial);
		System.out.println(isHotOutside);
		System.out.println(firstName);
		System.out.println(streetAddress);
		
			

		//8. A customer booked 2 plane seats, 
		//	remove 2 seats from the available seats variable
		availablePlaneSeats = availablePlaneSeats - 2;
		System.out.println(availablePlaneSeats);
		
			

		// 9. Impulse candy bar purchase, add 2.15 to the grocery total
		// 		
		costOfGroceriesAtCheckout = costOfGroceriesAtCheckout + 2.15;
		System.out.println(costOfGroceriesAtCheckout);
		


		// 10.  The birth certificate was printed incorrectly, 
		//		change the middle initial to something else
		char middleInitial1 = 'C';
		middleInitial = middleInitial1;
		System.out.println(middleInitial);
				

		// 11.  The season has changed, update the hot outside 
		//			variable to be opposite of what it was
		isHotOutside = !isHotOutside;


		// 12.  Create a new variable called full name using the customer's first name, 
		//			the middle initial, and a last name of your choice
		String lastName = "Williams";
		String fullName = firstName  + " " + middleInitial + " "  + lastName;
		System.out.println(fullName);
			

		// 13.  Print a line to the console that introduces the customer and says they live
		// 			at the address variable
		System.out.println("This customer is " + fullName + " and they live at " + streetAddress );

				
				

	}

}
