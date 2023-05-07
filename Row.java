import java.util.ArrayList;
/**
 * Write a description of class Rows here.
 *
 * @author Caio
 * @version 1.0
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
