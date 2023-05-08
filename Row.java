import java.util.ArrayList;
import java.util.HashMap;
/**
 * A class that models a row of seats.
 *
 * @author Caio, Mike, and Damian
 * @version 5/7/2023
 */
public class Row {
    private String rowLetter;
    int maxSeats;
    ArrayList<Seat> seats;
    /**
     * Constructor for objects of class Row.
     * @param letter The letter designation for this row.
     * @param numOfSeats The number of seats in this row.
     */
    public Row(String rowLetter, int maxSeats) {
        this.rowLetter = rowLetter;
        this.maxSeats = maxSeats;
        seats = new ArrayList<Seat>();
        
        for (int index = 0; index < maxSeats; index++) {
            Seat seat = new Seat(rowLetter, index + 1);
            seats.add(seat);
        }
    }

    /**
     * the collection of seats in this row.
     * @return The collection of seats in this row.
     */
    public ArrayList<Seat> getSeats() {
        return seats;
    }
    
    

}