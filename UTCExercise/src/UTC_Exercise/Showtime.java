package UTC_Exercise;

import java.util.ArrayList;

public class Showtime {
	private String time;
	private String date;
	private Movie movie;
	ArrayList<Ticket>tickets = new ArrayList<>();
	
	public Showtime(String time, String date, Movie movie) {
		this.time = time;
		this.date = date;
		this.movie = movie;
	}
	public String getTime() {
		return time;
	}
	public String getDate() {
		return date;
	}
	public Movie getMovie() {
		return movie;
	}
	void addTicket(Ticket ticket) {
		tickets.add(ticket);
	}
	public ArrayList<Ticket> getTickets() {
		return tickets;
	}
	
	
	
	

}
