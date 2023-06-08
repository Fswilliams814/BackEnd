/**
 * 
 */
package week5CodingAssignment;

/**
 * @author pooh
 *
 */
public class AsteriskLogger implements Logger {

	/**
	 * 
	 */
	public AsteriskLogger() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void log(String msg) {
		System.out.println("***" +msg+ "***"); 
	}

	@Override
	public void error(String msg) {
		String newString = "***Error: " + msg + "***";
		String asterisk = "*".repeat(newString.length());
		System.out.println(asterisk);
		System.out.println("***Error: " + msg + "***");
		System.out.println(asterisk);
		// TODO Auto-generated method stub
		
	}

}
