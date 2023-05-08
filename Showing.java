/**
  * A class that models a showing.
 *
 * @author Mike, Caio, and Damian
 * @version 5/7/2023
 */
public class Showing {
    private Theater theater;
    private Movie movie;
    private int date;
    private int time;

    /**
     * Constructor for objects of class Showing
     * @param
     * @param
     * @param
     * @param
     */
    public Showing(Theater theater, Movie movie, int date, int time) {
        this.theater = theater;
        this.movie = movie;
        this.date = date;
        this.time = time;
    }
    
    public Theater getTheater() {
        return theater;
    }
    
    public Movie getMovie() {
        return movie;
    }
    
    public int getDate() {
        return date;
    }
    
    public int getTime() {
        return time;
    }
}
