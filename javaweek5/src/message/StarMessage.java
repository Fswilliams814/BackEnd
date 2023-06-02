package message;

public class StarMessage implements Message {
	/**
	 * _ ***************
	 * _ *** Message ***
	 * _ ***************
	 */

	@Override
	public String fancyMessage(String msg) {
		// TODO Auto-generated method stub
		String middle = buildMessage(msg);
		String outer = "*".repeat(middle.length());
		String lf = System.lineSeparator();
		return outer + lf + middle + lf + outer; 
	}
	/**
	 * _ *** Message ***
	 */
@Override 
	public String plainMessage (String msg) {
		// TODO Auto-generated method stub
		return buildMessage(msg);
	}

	private String buildMessage(String msg) {
		// TODO Auto-generated method stub
		return "*** " + msg + " ***";
	}

}
