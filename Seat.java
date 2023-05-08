/**
 * Objects of this class represent seats for a given showing.
 * It has availability and an alphanumeric designator.
 * 
 * @author Caio, Mike, and Damian
 * @version 5/7/2023
 */
public class Seat {

    private boolean available;
    private String number;

    /**
     * Constructor for objects of class Seat.
     * @param letter The alphabetic component of the seat number.
     * @param num The numeric component of the seat number.
     */
    public Seat(String rowLetter, int num) {
        number = String.format(rowLetter + "%02d", num);
        available = true;
    }

    /**
     * Returns the seat number, which is made of the row letters and number within that row.
     * @return The seat number.
     */
    public String getNum() {
        return number;
    }
}