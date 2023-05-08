import java.util.ArrayList;
/**
 * A class that models a row of seats.
 *
 * @author Caio, Mike, and Damian
 * @version 5/7/2023
 */
public class Row {
    private String rowLetter;
    private ArrayList<Integer> seats = new ArrayList<Integer>();

    /**
     * Constructor for objects of class Row
     */
    public Row(String rowLetter, int maxSeats) {
        for (int i = 0; i < maxSeats; i++){                
            seats.add(i);
        } 
    }
}
