import java.util.ArrayList;
/**
 * Write a description of class Rows here.
 *
 * @author Caio
 * @version 1.0
 */
public class Row {
    
    ArrayList<Integer> seats = new ArrayList<Integer>();
    String rowLetter;

    /**
     * Constructor for objects of class Row
     */
    public Row(String rowLetter, int maxSeats) {
        for (int i=0; i < maxSeats; i++){                
            seats.add(i);
        } 
    }
}
