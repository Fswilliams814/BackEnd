/**
 * 
 */
package week5CodingAssignment;

/**
 * @author pooh
 *
 */
public class App {

	/**
	 * 
	 */


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger spacedLogger = new SpacedLogger();
		Logger asteriskLogger = new AsteriskLogger();
		
		System.out.println("Log Messages:");
		System.out.println();
		spacedLogger.log("I love kids");
		System.out.println();
		asteriskLogger.log("I love kids");
		System.out.println();
		System.out.println("Error Messages:");
		System.out.println();
		spacedLogger.error("I love kids");
		System.out.println();
		asteriskLogger.error("I love kids");
		
		
		
		

	}
	

}
