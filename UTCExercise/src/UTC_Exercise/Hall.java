package UTC_Exercise;

import java.util.ArrayList;

public class Hall {
	private int hallNumber;
	private int capacity;
	ArrayList<Showtime>showtimes = new ArrayList<>();
	
	public Hall(int hallNumber, int capacity) {
		this.hallNumber = hallNumber;
		this.capacity = capacity;
	}

	public int getHallNumber() {
		return hallNumber;
	}

	public int getCapacity() {
		return capacity;
	}
	
	void addShowtime(Showtime showtime) {
		showtimes.add(showtime);
	}

	public ArrayList<Showtime> getShowtimes() {
		return showtimes;
	}
	
	

}
