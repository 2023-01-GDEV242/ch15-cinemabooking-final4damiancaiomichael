/**
 * A class that models an reservation.
 * 
 * @author Michael B
 * @version (a version number or a date)
 */
public class Reservation {
    // The person making the bid.
    private final Customer customer;
    // The value of the bid. This could be a large number so
    // the long type has been used.
    private final int theater;

    /**
     * Create a bid.
     * @param bidder Who is bidding for the lot.
     * @param value The value of the bid.
     */
    public Reservation(Customer customer, int theater) {
        this.customer = customer;
        this.theater = theater;
    }

    /**
     * @return The bidder.
     */
    public Customer getCustomer() {
        return customer;
    }

    /**
     * @return The value of the bid.
     */
    public long getTheater() {
        return theater;
    }
}
