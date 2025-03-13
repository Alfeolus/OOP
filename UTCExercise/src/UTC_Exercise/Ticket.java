package UTC_Exercise;

public class Ticket {
	private int id;
	private Double price;
	private Customer customer;
	private Boolean paymentStatus;
	
	public Ticket(int id, Double price, Customer customer) {
		this.id = id;
		this.price = price;
		this.customer = customer;
		this.paymentStatus = true;
	}

	public int getId() {
		return id;
	}

	public Double getPrice() {
		return price;
	}

	public Customer getCustomer() {
		return customer;
	}

	public String getPaymentStatus() {
		if(paymentStatus == true) {
			return "Paid";
		}
		else {
			return "Not paid";
		}
	}
	
	
	
	

}
