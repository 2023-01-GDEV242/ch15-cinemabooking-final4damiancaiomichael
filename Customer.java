/**
 * Maintain details of customers that make a reservation.
 * 
 * @author Mike, Caio, and Damian
 * @version 5/7/2023
 */
public class Customer {
    private String name;
    private String phoneNumber;

    /**
     * Create a new customer with the given name and phone number.
     * @param name The customer's name.
     * @param phoneNumber The customer's phone number
     */
    public Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Returns the customer's name.
     * @return The customer's name.
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the customer's phone number.
     * @return The customer's phone number.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
