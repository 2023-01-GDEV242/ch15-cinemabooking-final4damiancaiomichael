
/**
 * Write a description of class Person here.
 *
 * @author Caio
 * @version (a version number or a date)
 */
public class Person
{
    // The name of this person.
    private final String name;
    private final int phoneNumber;

    /**
     * Create a new person with the given name.
     * @param name The person's name.
     */
    public Person(String name, int phoneNumber)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return The person's name.
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * @return The person's name.
     */
    public int getPhoneNumber()
    {
        return phoneNumber;
    }
}