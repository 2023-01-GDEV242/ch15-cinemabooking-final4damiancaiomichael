import java.util.ArrayList;
/**
 * Write a description of class CinemaBookingSystem here.
 *
 * @author Damian, Caio, and Mike
 * @version 5/7/2023
 */
public class CinemaBookingSystem {
    private ArrayList<Integer> seats = new ArrayList<Integer>();
    private ArrayList<Customer> customers = new ArrayList<Customer>();
    private ArrayList<Movie> movies = new ArrayList<Movie>();
    private ArrayList<Showing> showings = new ArrayList<Showing>();
    private ArrayList<Theater> theaters = new ArrayList<Theater>();
    /**
     * Constructor for objects of class CinemaBookingSystem
     */
    public CinemaBookingSystem() {
    }
        
    public void testSystem() {
        Movie movie1 = new Movie("The Super Mario Bros. Movie");
        movies.add(movie1);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }
    
    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }    
    
    public void addMovie(Movie movie) {
        movies.add(movie);
    }
    
    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }
    
    public void addShowing(Showing showing) {
        showings.add(showing);
    }
    
    public void removeShowing(Showing showing) {
        showings.remove(showing);
    }    
    
    public void addTheater(Theater theater) {
        theaters.add(theater);
    }
    
    public void removeTheater(Theater theater) {
        theaters.remove(theater);
    }
}
