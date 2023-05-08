import java.util.ArrayList;

/**
 * Write a description of class Reservation here.
 *
 * Damian, Caio, Michael
 * Professor Crosbie
 * Object Oriented Programming
 * Project 4
 * May 1, 2023
 */
public class Reservation
{
    private int price;
    private int roomNum;
    private String phoneNum;
    private Showing showing;
    boolean reserved;
    

    /**
     * Constructor for objects of class Reservation
     */
    public Reservation(int roomNum, String phoneNum)
    {
        // initialise instance variables
        //this.film = film;
        this.roomNum = roomNum;
        this.phoneNum = phoneNum;
        //price = getPrice();
        reserved = false;
    }
}
