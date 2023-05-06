/**
 * A class that models an reservation.
 * 
 * @author Michael B
 * @version (a version number or a date)
 */
public class Reservation {
    private Customer customer;  // The person making the reservation.
    private Showing showing;    // The show being reserved.

    /**
     * Create a bid.
     * @param bidder Who is bidding for the lot.
     * @param value The value of the bid.
     */
    public Reservation(Customer customer, Showing showing) {
        this.customer = customer;
        this.showing = showing;
    }

    /**
     * 
     * @return The customer.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @return The showing.
     */
    public Showing getShowing() {
        return showing;
    }
}
