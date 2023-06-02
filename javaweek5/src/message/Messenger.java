package message;

public class Messenger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message starMessage = new StarMessage();
		System.out.println(starMessage.plainMessage("This is plain"));
		System.out.println();
		
		System.out.println(starMessage.fancyMessage("Do you like this?"));
		System.out.println();
		
		Message spaceMessage = new SpaceMessage();
		System.out.println(spaceMessage.plainMessage("Very Plain"));
		System.out.println(spaceMessage.fancyMessage("Very Fancy"));
		

	}

}
