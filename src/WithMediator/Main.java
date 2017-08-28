package WithMediator;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Chatroom room = new Chatroom();
		
		Participant john = new Person("John");
		Participant jane = new Person("Jane");
		
		room.join(john);
		room.join(jane);
		
		john.say("hi room");
		jane.say("oh, hey john");
		
		Participant simon = new Person("Simon");
		room.join(simon);
		simon.say("Hi everyone!");
		
		//Participant bot1 = new Bot("Bot1");
		//room.join(bot1);
		//bot1.say("I'M A BOT");
		
		jane.privateMessage("Simon", "glad u could join us");
		

	}

}
