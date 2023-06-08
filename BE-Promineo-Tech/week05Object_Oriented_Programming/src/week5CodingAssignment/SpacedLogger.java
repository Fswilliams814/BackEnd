/**
 * 
 */
package week5CodingAssignment;

/**
 * @author pooh
 *
 */
public class SpacedLogger implements Logger {

	/**
	 * 
	 */
	public SpacedLogger() {
		// TODO Auto-generated constructor stub
	}

	
	public void log(String x) {
		// TODO Auto-generated method stub
		
		System.out.println(buildMessage(x)); 
		
	}

	private String buildMessage(String x) {
		// TODO Auto-generated method stub
		String result = "";
		for(char ch : x.toCharArray()) {
			result += ch + " ";
		}
		return result.trim();
	}

	@Override
	public void error(String x) {
		// TODO Auto-generated method stub
		System.out.println("ERROR: " + buildMessage(x));
	}

}

