
/**
 * A class to model a showing.
 *
 * @author Caio
 * @version (a version number or a date)
 */
public class Showing {
    private int theaterNumber;
    private int time;
    private String movie;

    /**
     * Constructor for objects of class Showing
     */
    public Showing(int theaterNumber, int time, String movie) {
        this.theaterNumber = theaterNumber;
        this.time = time;
        this.movie = movie;
    }
    
    public int getTheaterNumber() {
        return theaterNumber;
    }
    
    public int getTime() {
        return time;
    }
    
    public String getMovie() {
        return movie;
    }
}
