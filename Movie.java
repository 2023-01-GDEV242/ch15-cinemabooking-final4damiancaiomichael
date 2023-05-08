/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Movie 
{
    private String title;

    /**
     * Create a new movie with the given name.
     * @param name The name of the movie.
     */
    public Movie(String title) 
    {
        this.title = title;
    }
    
    /**
     * Returns the movie name.
     * @return The movie name.
     */
    public String getTitle() 
    {
        return title;
    }
}
