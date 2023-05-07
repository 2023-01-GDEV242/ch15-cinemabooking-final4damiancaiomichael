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
     * Create a reseration.
     * @param customer Who is making the reservation.
     * @param showing The showing being reserved.
     */
    public Reservation(Customer customer, Showing showing) {
        this.customer = customer;
        this.showing = showing;
    }

    /**
     * Returns the customer.
     * @return The customer.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * Returns the showing.
     * @return The showing.
     */
    public Showing getShowing() {
        return showing;
    }
}
