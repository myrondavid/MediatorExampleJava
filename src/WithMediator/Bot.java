package WithMediator;

public class Bot extends Participant {

	public Bot(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	
	public void receive(String sender, String message) {
		String s = sender + ": '" + message+"'";
		System.out.println("[(BOT) "+super.getName()+"'s chat session] " + s);
		super.chatLog.add(s);
	}
	
	public void say(String message) {
		super.getRoom().broadcast("(BOT) "+ super.getName(), message);
	}
}
