/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie {
    private String name;

    /**
     * Create a new movie with the given name.
     * @param name The name of the movie.
     */
    public Movie(String name) {
        this.name = name;
    }

    /**
     * Returns the movie name.
     * @return The movie name.
     */
    public String getName() {
        return name;
    }
}
