/**
 * A class to model a showing.
 *
 * @author Michael B
 * @version (a version number or a date)
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
