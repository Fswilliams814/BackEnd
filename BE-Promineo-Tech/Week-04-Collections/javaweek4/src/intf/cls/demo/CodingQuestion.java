package intf.cls.demo;
import java.io.*;
import java.util.*;

public class CodingQuestion {

	static List squaredList(int num1, int num2, int num3, int num4, int num5) {
 	
	    // WRITE YOUR CODE HERE
	    List<Integer> squaredNums = new ArrayList<>();
	    squaredNums.add(num1);
	    squaredNums.add(num2);
	    squaredNums.add(num3);
	    squaredNums.add(num4);
	    squaredNums.add(num5);
	    for (int i = 0; i < squaredNums.size(); i++){
	        int b = squaredNums.get(i);
	        int squaredNumbers = b * b;
	        squaredNums.add(squaredNumbers);
	    }
	    return squaredNums;
        
        
        
        
        
        
        

		
		
	/***** DO NOT CHANGE THE CODE BELOW THIS LINE *****/		
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int num4 = in.nextInt();
		int num5 = in.nextInt();
		System.out.println(squaredList(num1,num2,num3,num4,num5));
	}
}
