/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie {
    private String title;

    /**
     * Create a new movie with the given title.
     * @param title The title of the movie.
     */
    public Movie(String title) {
        this.title = title;
    }

    /**
     * Returns the movie title.
     * @return The movie title.
     */
    public String getTitle() {
        return title;
    }
    
    /**
     * Sets the movie title
     * @param the movie title
     */
    public void setTitle(String title) {
        this.title = title;
    }
}
