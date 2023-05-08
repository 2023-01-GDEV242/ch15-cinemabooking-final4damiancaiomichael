/**
 * A class that models a theater.
 * 
 * @author Mike, Caio, and Damian
 * @version 5/7/2023
 */
public class Reservation {
    private Customer customer;  // The person making the reservation.
    private Showing showing;    // The show being reserved.
    
    /**
     * Create a reservation.
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
