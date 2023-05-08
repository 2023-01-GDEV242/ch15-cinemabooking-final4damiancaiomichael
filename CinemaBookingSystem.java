import java.util.HashSet;

/**
 * Write a description of class CinemaBookingSystem here.
 *
 * Damian, Caio, Michael
 * Professor Crosbie
 * Object Oriented Programming
 * Project 4
 * May 1, 2023
 */
public class CinemaBookingSystem
{
    private InputReader reader;
    private Responder responder;
    private Showing Showing;
    private Reservation reservation;
    
    
    /**
     * Constructor for objects of class CinemaBookingSystem
     */
    public CinemaBookingSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }
    
    /**
     * Start the technical support system. This will print a welcome message and enter
     * into a dialog with the user, until the user ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) 
        {
            HashSet<String> input = reader.getInput();

            if(input.contains("bye")) 
            {
                finished = true;
            }
            else 
            {
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }
        
        printGoodbye();
    }
    
    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to Crosbie's Dine in Theatre.");
        System.out.println();
        System.out.println("Type 'bye' to exit our system.");
        System.out.println("Type 'showing' to see our movie listing.");
        System.out.println("Type 'time' to see our timing schedule.");
        System.out.println("We will assist you with any problem you might have.");
    }
    
    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Thank you have a nice day.");
    }
}
