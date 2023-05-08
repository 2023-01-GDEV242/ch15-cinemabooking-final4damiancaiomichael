/**
 * A class that models a theater.
 * 
 * @author Mike, Caio, and Damian
 * @version 5/7/2023
 */
public class Reservation {
    private Customer customer;  // The person making the reservation.
    private Showing showing;    // The show being reserved.
    private Seat seat;
    
    /**
     * Create a reservation.
     * @param customer Who is making the reservation.
     * @param showing The showing being reserved.
     */
    public Reservation(Customer customer, Showing showing, Seat seat) {
        this.customer = customer;
        this.showing = showing;
        this.seat = seat;
    }

    public Seat makeReservation(){
        
        return seat;
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
    
    /**
     * Returns the seat.
     * @return The seat.
     */
    public Seat getSeat() {
        return seat;
    }    
}
