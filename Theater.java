import java.util.ArrayList;

/**
 * A class to model a theater.
 * 
 * @author Michael B
 * @version (a version number or a date)
 */
public class Theater {
    private int number;
    private int rows;
    private int seats;
    
    /**
     * Constructor for class Theater
     * @param number The theater number
     * @param row
     */
    public Theater(int number, int rows, int seats) {
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
