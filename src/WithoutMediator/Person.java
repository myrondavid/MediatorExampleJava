package WithoutMediator;

import java.util.ArrayList;

public class Person {
	private String name;
	private ArrayList<String> chatLog = new ArrayList<String>();
	
	public Person(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getChatLog() {
		return chatLog;
	}

	public void setChatLog(ArrayList<String> chatLog) {
		this.chatLog = chatLog;
	}

	
	public void receive(String sender, String message) {
		String s = sender + ": '" + message+"'";
		System.out.println("["+this.name+"'s chat session] " + s);
		chatLog.add(s);
	}

	public void say(String message, ArrayList<Person> persons) {
		for(Person p : persons) {
			if(p != this) {
				p.receive(this.name, message);
			}
		}
	}

	public void privateMessage(Person destination, String message) {
		destination.receive(this.name, message);
	}

}
