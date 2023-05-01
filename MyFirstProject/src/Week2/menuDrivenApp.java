package Week2;

import java.util.Scanner;

public class menuDrivenApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a new scanner allows us to pick up information from the console.
		Scanner sc = new Scanner(System.in);
		// this allows us to print something on a new line each time
		System.out.println("Hello");
		System.out.println("World");
		//once you remove the "ln" it will put it on the same line
		int selection = 0;
		double total = 0;
		while(selection != 4) {
			System.out.print("Enter your name: ");
			String name2 = sc.nextLine();
			System.out.println("Welcome " + name2);
			System.out.println("Select an option: ");
			System.out.println("1.) add candybar to shopping cart: 1.99");
			System.out.println("2.) add cheese to shopping cart: 6.99");
			System.out.println("3.) add soccer ball to shopping cart: 12.99");
			System.out.println("4.) check out");
			//grabbing the user's selection
			 selection = sc.nextInt();
			//setting variable for the total
			
			//doing switch case to evaluate the selection and calculate the total
			switch (selection) {
			case 1:
				total += 1.99; // saying that total = total + 1.99
				break;
			case 2:
				total += 6.99; // saying that total = total + 1.99
				break;
			case 3:
				total += 12.99; // saying that total = total + 1.99
				break;
			case 4:
				break;
			default:
				System.out.println("Please pick a valid option.");
		}
			
		}
		
		System.out.println("Your current total is: " + total);

	}

}
