import java.util.ArrayList;

/**
 * A class that models a theater.
 * 
 * @author Mike, Caio, and Damian
 * @version 5/7/2023
 */
public class Theater {
    private int theaterNumber;
    private int rows;
    private int seats;
    
    /**
     * Constructor for class Theater
     * @param theaterNumber The theater number
     * @param row
     * @param seats
     */
    public Theater(int theaterNumber, int rows, int seats) {
        this.theaterNumber = theaterNumber;
        this.rows = rows;
        this.seats = seats;
    }

    /**
     * Returns the theater number
     * @return The theater number
     */
    public int getTheaterNumber() {
        return theaterNumber; 
    }
    
    /**
     * Returns the rows
     * @return The rows
     */
    public int getRows() {
        return rows; 
    }
    
    /**
     * Returns the seats
     * @return The seats
     */
    public int getSeats() {
        return seats; 
    }
    
    /**
     * Sets the number of rows in the theater.
     * @param rows The number of rows in the theater.
     */
    public void setRows(int rows) {
        this.rows = rows;
    }
}
