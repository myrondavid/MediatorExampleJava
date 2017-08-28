package WithMediator;

import java.util.ArrayList;
import java.util.Optional;

import WithoutMediator.Person;

public class Chatroom {
	
	private ArrayList<Participant> participants = new ArrayList<Participant>();

	public Chatroom() {
		// TODO Auto-generated constructor stub
	}

	public void broadcast(String source, String message) {
		for(Participant p : participants) {
			if(p.getName() != source)
				p.receive(source, message);
		}
	}
	
	public void join(Participant p) {
		String joinMsg = p.getName()+ " joins the chat";
		broadcast("room", joinMsg);
		
		p.setRoom(this);
		participants.add(p);
	}
	
	public void message(String source, String destination, String message) {
		for(Participant p : participants) {
			if(p.getName().equals(destination))
				p.receive(source, message);
		}
				
	}
}
