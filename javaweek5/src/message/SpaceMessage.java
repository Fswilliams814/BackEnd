package message;

import java.util.stream.Collectors;

public class SpaceMessage implements Message {

	@Override
	public String fancyMessage(String msg) {
		// TODO Auto-generated method stub
		return "Fancy: " + buildMessage(msg);
	}

	private String buildMessage(String msg) {
		// TODO Auto-generated method stub
		String result = "";
		for(char ch : msg.toCharArray()) {
			result += ch + " ";
		}
		return result.trim();
	}
//		return msg.chars()
//				.mapToObj(ich -> Character.toString(ich))
//				.collect(Collectors.joining(" "));
//	}

	@Override
	public String plainMessage(String msg) {
		// TODO Auto-generated method stub
		return "Plain: " + buildMessage(msg);
	}

}
