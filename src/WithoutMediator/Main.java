package WithoutMediator;

import java.util.ArrayList;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	static ArrayList<Person> people = new ArrayList<Person>();
	
	public static void main(String[] args) {
		Person john = new Person("John");
		Person jane = new Person("Jane");
		Person jason = new Person("Jason");
		
		people.add(john);
		people.add(jane);
		people.add(jason);
		
		john.say("Hi folks", people);
		jane.say("Hi guys", people);
		
		jason.privateMessage(jane, "do u know who is John?");
		jane.privateMessage(john, "glad u could join us!");
	}

}
