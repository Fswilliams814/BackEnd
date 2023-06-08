package week4CodingAssignment;

import java.util.Arrays;
import java.util.Scanner;

public class codingQuestions {
	
	static String concatenate (String word, int n) {
		String newString = "";
		for(int i = 0; i< n; i++) {
			newString = newString.concat(word);
		}
		return newString;
		
	}
	
	static String makeFullName(String firstName, String lastName) {
		String fullName = "";
		fullName = firstName.concat(" " + lastName);
		
		return fullName;
		
	}
	
	static boolean isSumGreater(int[] numbers) {
		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		return sum > 100;
	}
	
	static double returnAverage (int [] numbers) {
		double sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];
		}
		return sum/numbers.length;
		
	}
	
	static boolean whichIsGreater(double[] ages3, double[] ages4) {
		double firstAverage = returnAverage(ages3);
		double secondAverage = returnAverage(ages4);
		return firstAverage > secondAverage;
		
	}

	private static double returnAverage(double[] ages3) {
		double sum = 0;
		for (int i = 0; i < ages3.length; i++) {
			sum = sum + ages3[i];
		}
		return sum/ages3.length;
	}
	
	static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside && moneyInPocket > 10.50);
	}
	
	@SuppressWarnings("resource")
	static int calorieTarget() {
		Scanner userWeight = new Scanner(System.in);
		System.out.println("Please enter your weight:");
		String weight = userWeight.nextLine();
		int w = Integer.parseInt(weight);
		System.out.println(w);
		Scanner userSelection = new Scanner(System.in);
		System.out.println("What is your goal? Please type maintain, lose weight, build muscle:");
		String selection = userSelection.nextLine();
		System.out.println(selection);
		int calorieTarget = 0;
		int caloricBaseline = w * 11;
		if(selection.equals("maintain")) {
			 calorieTarget += caloricBaseline + 400;
		} else if (selection.equals("lose weight")) {
			return calorieTarget += caloricBaseline - 400;	 
		} 
				else if (selection.equals("build muscle")) {
					int maintenanceCal = caloricBaseline + 400;
					return calorieTarget += maintenanceCal + 300;
				}
		System.out.println("Your calorie target is: " + calorieTarget);
		return  calorieTarget;
			}
		
		
		
		

		
		
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		int[] ages = new int[]{3, 9, 23, 64, 2, 8, 28, 93};
		System.out.println(Arrays.toString(ages));
//		Programmatically subtract the value of the first element in the array from the value in the last element of the array 
		int ageDifference = ages[ages.length - 1] - ages[0];
		//(i.e. do not use ages[7] in your code). Print the result to the console.  
		System.out.println(ageDifference);
//		Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
		int[] ages2 = new int[ages.length + 1];
		System.arraycopy(ages, 0, ages2, 0, ages.length);
		ages2[ages2.length-1] = 98;
		System.out.println(Arrays.toString(ages2));
		int ageDifference2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println(ageDifference2);
//		Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		int sum = 0;
		for (int i = 0; i< ages2.length; i++) {
			sum += ages2[i];
		}
		System.out.println(sum);
//		Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		String[] names = {"Sam", "Tommy" , "Tim", "Sally", "Buck","Bob"};
//		Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
		for (String name : names) {
			int numberofLetters = name.length();
			System.out.println(numberofLetters);
			
		}
//		Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
		String newString = "";
		for (int i = 0; i < names.length; i++) {
			newString = " " + names[i].concat(newString);
		}
		System.out.println(newString.trim());
//		How do you access the last element of any array?
		String lastElement = names[names.length-1]; // use the length method to get the length of the array and minus that by 1
		System.out.println(lastElement);
//		How do you access the first element of any array?
		String firstElement = names[0];
		System.out.println(firstElement);
//		Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		int [] nameLengths = new int [names.length];
		
			for(int i = 0; i < names.length; i++) {
			
					int nameLength = names[i].length();
					nameLengths[i] = nameLength;
				}System.out.println(Arrays.toString(nameLengths));
				
				
			
			
		
//		Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. 
				//Print the result to the console.
				int sum2 = 0;
				for(int i = 0; i < nameLengths.length; i++) {
					sum2 = sum2 + nameLengths[i];
					
				}System.out.println((sum2));
//		Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated 
				//to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
				//method at top
				System.out.println(concatenate("Hello", 4));
//		Write a method that takes two Strings, firstName and lastName, and returns a full name 
				//(the full name should be the first and the last name as a String separated by a space).
				//method at top
				System.out.println(makeFullName("Fionna", "Williams"));
				
//		Write a method that takes an array of int and returns 
				//true if the sum of all the ints in the array is greater than 100.
				//method at top
				System.out.println(isSumGreater(ages));
				
//		Write a method that takes an array of double and returns the average of all the elements in the array.
				System.out.println(returnAverage(ages));
//		Write a method that takes two arrays of double and returns true if the average of the elements 
				//in the first array is greater than the average of the elements in the second array.
				//method up top
				double [] ages3 = new double[] {4, 6, 7, 8, 29, 55, 98};
				double [] ages4 = new double[] {10, 19, 26, 35, 44, 90};
				
				System.out.println(whichIsGreater(ages4, ages3));
//		Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, 
				//and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
				boolean isItHot = true;
				double myMoney = 22.50;
				System.out.println(willBuyDrink(isItHot, myMoney));
//		Create a method of your own that solves a problem. In comments, write what the method does 
				//and why you created it.
				//
				//method that calculates a customer's calorie target
				//I am creating this method because I am building a wellness business and would love 
				//to have a calorie target calculator as part of my website that I've built on my own.
				calorieTarget();
				
				
				
				


	}

}
