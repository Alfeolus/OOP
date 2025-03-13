package UTC_Exercise;

import java.util.ArrayList;

public class Customer {
	private String name;
	private int age;
	ArrayList<Ticket> tickets = new ArrayList<>();
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}
	
	
}
