
/**
 * Write a description of class Showing here.
 *
 * Damian, Caio, Michael
 * Professor Crosbie
 * Object Oriented Programming
 * Project 4
 * May 1, 2023
 */
public class Showing
{
    private String movieTitle; //title of the film.
    private String description; //description of the film.
    private String rating; //rating of film.
    private int price; //price for each ticket.

    /**
     * Constructor for objects of class Showing
     */
    public Showing(String movieTitle,String description)
    {
        this.movieTitle = movieTitle;
        this.description = description;
        price = 0;
    }
    
    public String getTitle()
    {
        return movieTitle; //returns title of film.
    }
    
    public int getPrice()
    {
        return price; //returns price.
    }
}
