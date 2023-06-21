/**
 * 
 */
package week6LabAssignment;

import java.util.Scanner;

/**
 * @author pooh
 *
 */
public class TicTacToe {

	/**
	 * @param args
	 * 
	 * You will need to declare a gameBoard.  
	//
	//				As shown above, Tic Tac Toe is played on a 3x3 grid that has 9 spaces. 
	//
	//					a. One suggestion is to create an array of length 9 to represent the board:
	//
	//						For example:  String[] gameBoard = new String[9]; 
	//
	//							i. Just remember that arrays are 0 based, so to access the grid, 
	//							the index would go from 0-8.  
	//
	//							ii. Wins can occur in 8 ways (see above).
	//								For example: A horizontal win would be found by 
	//								looking at the contents of: 
	//									gameBoard[0] & gameBoard[1] & gameBoard[2] 
	//									gameBoard[3] & gameBoard[4] & gameBoard[5] 
	//									gameBoard[6] & gameBoard[7] & gameBoard[8] 
	//
	//					b. Another option for the gameBoard would be a 2d array -- This option might be
	//						is a bit more challenging!  
	//
	//						For example:  String[][] gameBoard = new String[3][3];
	//					
	//							i. Just remember that arrays are 0 based, so to access the grid, 
	//							the index would go from 0-2 in two directions.  
	//
	//							ii. Wins can occur in 8 ways.  A horizontal win would be comparing:  
	//									gameBoard[0][0] & gameBoard[0][1] & gameBoard[0][2] 
	// 
	//		3.  Implement the rules as listed above.  
	//
	//		4.  You might want to have the following methods:
	//					a. display() -- to print the gameBoard
	//					b. checkWinStatus() -- to check if a player has won
	//					c. initialize() -- to set up your new gameBoard
	//			
	//		5.  Reminder:  There is no one way to implement this game.
	//		
	//	
	
	// START YOUR IMPLEMENTATION BELOW THIS LINE
	 * 
	 */
	static String boardLines = "+".concat("---").repeat(3)+ "+";
	static void showGameBoard() {
		System.out.println(boardLines);
		System.out.println("| 1 | 2 | 3 |");
		System.out.println(boardLines);
		System.out.println("| 4 | 5 | 6 |");
		System.out.println(boardLines);
		System.out.println("| 7 | 8 | 9 |");
		System.out.println(boardLines);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showGameBoard();
		String welcomeMessage = "Welcome to Tic Tac Toe!  \n  First turn: X";
		System.out.println("-".repeat(22));
		System.out.println(welcomeMessage);
		System.out.println("-".repeat(22));
		Scanner xTurn = new Scanner(System.in);
		System.out.println("Xs Turn: Please choose a number on the board!");
		
		
		

	}

}
