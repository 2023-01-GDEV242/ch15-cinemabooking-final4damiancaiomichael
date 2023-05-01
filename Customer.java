/**
 * Maintain details of customers that make a reservation.
 * @author Michael B
 * @version 1
 */
public class Customer
{
    // The name of this person.
    private final String name;
    private final int phoneNumber;

    /**
     * Create a new person with the given name and phone number.
     * @param name The customer's name.
     * @param phoneNumber The customer's phone number
     */
    public Customer(String name, int phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return The customers's name.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @return The customers's phone number.
     */
    public int getPhoneNumber()
    {
        return phoneNumber;
    }
}
