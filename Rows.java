import java.util.ArrayList;
/**
 * Write a description of class Rows here.
 *
 * @author Caio
 * @version 1.0
 */
public class Rows
{
    
    ArrayList<Integer> seats = new ArrayList<Integer>();
    String rowLetter;

    /**
     * Constructor for objects of class Rows
     */
    public Rows(String rowLetter, int maxSeats)
    {
        
        
        for (int i=0; i < maxSeats; i++){               
            
            seats.add(i);
        }
        
    }

    
}
