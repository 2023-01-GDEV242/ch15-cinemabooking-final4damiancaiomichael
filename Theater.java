import java.util.ArrayList;

/**
 * A class to model a theater.
 * 
 * @author Michael B
 * @version (a version number or a date)
 */
public class Theater {
    private int number;
    private Row rows;
    private Seat seats;
    
    /**
     * Constructor for class Theater
     * @param number The theater number
     * @param row
     */
    public Theater(int number, Row rows, Seat seats) {
        this.number = number;
        this.rows = rows;
        this.seats = seats;
    }

    /**
     * Returns the theater number
     * @return The theater number
     */
    public int getNumber() {
        return number; 
    }
    
    /**
     * Returns the rows
     * @return The rows
     */
    public Row getRows() {
        return rows; 
    }
    
    /**
     * Returns the seats
     * @return The seats
     */
    public Seat getSeats() {
        return seats; 
    }
}
