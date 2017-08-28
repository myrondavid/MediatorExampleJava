package WithMediator;

import java.util.ArrayList;

import WithoutMediator.Person;

public abstract class Participant {
	
	private String name;
	protected Chatroom room;
	protected ArrayList<String> chatLog = new ArrayList<String>();

	public Participant(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Chatroom getRoom() {
		return room;
	}

	public void setRoom(Chatroom room) {
		this.room = room;
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
	
	public void say(String message) {
		room.broadcast(this.name, message);
	}

	public void privateMessage(String who, String message) {
		room.message(this.name, who, message);
	}


}
