package Cinema;

public class Ticket {
	private int id;
	private double price;
	private boolean paymentStatus;
	private Customer customer;
	public Ticket(int id, double price, Customer customer) {
		this.id = id;
		this.price = price;
		this.customer = customer;
	}
	public int getId() {
		return id;
	}
	public double getPrice() {
		return price;
	}
	public Customer getCustomer() {
		return customer;
	}
	
	

}
