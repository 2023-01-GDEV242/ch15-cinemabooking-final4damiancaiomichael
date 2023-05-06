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
    // instance variables - replace the example below with your own
    private int price;
    private int roomNum;
    private String phoneNum;
    //private Film film;
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

    /**
     * method for phone number.
     */
    public String getPhoneNum();
    {
        return phoneNum; //returns phone number.
    }
}
