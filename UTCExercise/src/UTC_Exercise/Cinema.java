package UTC_Exercise;

import java.util.*;

public class Cinema {
	private String name;
	private String location;
	ArrayList<Hall> halls = new ArrayList<Hall>();
	ArrayList<Employee>employees = new ArrayList<Employee>();
	
	public Cinema(String name, String location) {
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}
	
	void addHall(Hall hall) {
		halls.add(hall);
	}
	void addEmployee(Employee employee) {
		employees.add(employee);
	}
	
	void displayCinemaInfo() {
		System.out.println("Cinema: "+name);
		System.out.println("Location: "+location);
		
		System.out.println(" ");
		
		System.out.println("Employees:");
		for(Employee employee: employees) {
			System.out.println("Name: "+employee.getName()+ " Role: "+employee.getRole());
		}
		
		System.out.println("Halls: ");
		for(Hall hall : halls) {
			System.out.println("Hall " + hall.getHallNumber() + "(Capacity: " + hall.getCapacity() + ")");
			System.out.println("Showtimes: ");
			for(Showtime showtime: hall.getShowtimes()) {
				System.out.println("- Movie: "+ showtime.getMovie().getTitle());
				System.out.println("Time: "+ showtime.getTime() + ", Date: " + showtime.getDate());
				if(showtime.getTickets().isEmpty()) {
					System.out.println("No tickets booked yet.");
				}
				else {
				for(Ticket ticket : showtime.getTickets()) {
					System.out.println("Tickets: ");
					System.out.println("* Ticket id: " + ticket.getId() + ", Price: " + ticket.getPrice() + ", Customer: " + ticket.getCustomer().getName() + ", Paymeny Status: " + ticket.getPaymentStatus());
				}
				System.out.println(" ");
			}

		}
	}
		
		
	System.out.println("Customers: ");
	for(Hall hall: halls ) {
		for(Showtime showtime : hall.getShowtimes()) {
			for(Ticket ticket : showtime.getTickets()) {
				System.out.println("- Name: " + ticket.getCustomer().getName() + ", Age: " + ticket.getCustomer().getAge());
				System.out.println("Tickets: ");
				System.out.println("* Ticket ID: "+ ticket.getId() + ", Movie: " + showtime.getMovie().getTitle() + ", Showtime: " + showtime.getTime()+ ", Date: " + showtime.getDate() + ", Price : "  + ticket.getPrice() + ", Status: " + ticket.getPaymentStatus());
			}
		}
	}
	}
}
