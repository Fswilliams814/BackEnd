package week3;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Week03ArraysAndMethodsLab {
	
	static void printGreeting(String name) {
		System.out.println("Hi, my name is " + name);
	}
	
	static String createGreeting(String name) {
		return ("Hi my name is " + name);
	}
	
	static boolean whichIsLonger(String name, int x) {
		return name.length() > x;
		
	}
	static boolean doesItExist(String[] n, String y) {
		
		for( int z = 0; z <n.length; z++) {
			if(n[z].equals(y)) {
				
				return true;
			}
			
			}
		return false;
		}

	//Using Java 8 Streams you can create a Binary operator which compares two integers and returns smallest among them.
	static int getSmallest(int[] n, int total) {
		int small = Arrays.stream(n).reduce((x, y) -> x < y ? x : y).getAsInt();
		return small;
	}
	
	static double getAverageOfArray(double[]arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			return sum/arr.length;
			
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		// Arrays:
		//
		
		// 1. Create an array with the following values 1, 5, 2, 8, 13, 6
		
		int[] numbers = new int[6];
				numbers[0] = 100;
				numbers[1] = 5;
				numbers[2] = 2;
				numbers[3] = 8;
				numbers[4] = 13;
				numbers[5] = 6;
				
				System.out.println(Arrays.toString(numbers));
				

		
		// 2. Print out the first element in the array
				System.out.println(numbers[0]);
				
	
		
		// 3. Print out the last element in the array without using the number 5
				System.out.println(numbers[numbers.length - 1]);
				
		
		
		// 4. Print out the element in the array at position 6, what happens?
				//System.out.println(numbers[6]);
				//There is an error when this is done because there is no number at position 6
				

		
		// 5. Print out the element in the array at position -1, what happens?
				//System.out.println(numbers[-1]);
				//same error as question 4

			
		// 6. Write a traditional for loop that prints out each element in the array
				for (int i = 0; i < numbers.length; i++) {
					System.out.println(numbers[i]);
				}
	
			
		// 7. Write an enhanced for loop that prints out each element in the array
				for (int number : numbers) {
					System.out.println(number);
				}

		
		// 8. Create a new variable called sum, write a loop that adds 
		//			each element in the array to the sum
				double sum = 0;
				for (int i = 0; i < numbers.length; i++) {
					sum += numbers[i];
					
				}
	
				
				System.out.println(sum);
				System.out.println(numbers.length);

			
		// 9. Create a new variable called average and assign the average value of the array to it
				 double average = sum/(numbers.length);
				 System.out.println(average);

		
		// 10. Write an enhanced for loop that prints out each number in the array 
		//			only if the number is odd
				 for(int i = 0; i < numbers.length; i++) {
					 int remainder = numbers[i] % 2;
					 if(remainder != 0) {
						 System.out.println(numbers[i]);
					 }
				 }

		
		// 11. Create an array that contains the values "Sam", "Sally", "Thomas", and "Robert"
				 String[] names = new String[4];
				 names[0] = "Sam";
				 names[1] = "Sally";
				 names[2] = "Thomas";
				 names[3] = "Robert";
				System.out.println(Arrays.toString(names));

		
		// 12. Calculate the sum of all the letters in the new array
				int sumOfLetters = 0;
				for(int x = 0; x < names.length; x++) {
					int numberOfLetters = names[x].length();
					sumOfLetters += numberOfLetters;
				}
				
				System.out.println(sumOfLetters);

		

		//
		// Methods:
		//
		
		// 13. Write and test a method that takes a String name and prints out a greeting. 
		//			This method returns nothing.
				printGreeting("Fionna");
				
				
		
		
		// 14. Write and test a method that takes a String name and  
		//			returns a greeting.  Do not print in the method.
				System.out.println(createGreeting("Fi"));
				
				

		
		// Compare method 13 and method 14:  
		//		a. Analyze the difference between these two methods.
		//		b. What do you find? 
				//one does not use sysout in the method it just tells the method to return something
		//		c. How are they different?
		
		
		// 15. Write and test a method that takes a String and an int and 
		//			returns true if the number of letters in the string is greater than the int
				System.out.println(whichIsLonger("Fionna", 9));
				
		
		
		// 16. Write and test a method that takes an array of string and a string and 
		//			returns true if the string passed in exists in the array
				System.out.println(doesItExist(names, "Robert"));
				
				
		
		
		// 17. Write and test a method that takes an array of int and 
		//			returns the smallest number in the array
				System.out.println(getSmallest(numbers, 6));
	
		
		// 18. Write and test a method that takes an array of double and 
		//			returns the average
				double [] newArray = new double[]{22.3, 44.5, 55.6, 66.9, 100.7, 34.2};
				
		

		// 19. Write and test a method that takes an array of Strings and 
		//			returns an array of int where each element
		//			matches the length of the string at that position

				
		// 20. Write and test a method that takes an array of strings and 
		//			returns true if the sum of letters for all strings with an even amount of letters
		//			is greater than the sum of those with an odd amount of letters.

	
		// 21. Write and test a method that takes a string and 
		//			returns true if the string is a palindrome

		
		
	}
	

	
	// Method 13:


	// Method 14:

	
	// Method 15:

	
	// Method 16:

	
	// Method 17:

	
	// Method 18:

	
	// Method 19:

	
	// Method 20:
	
	
	// Method 21:
	

	}


