import java.util.ArrayList;

/**
 * Write a description of class Theater here.
 *
 * Damian, Caio, Michael
 * Professor Crosbie
 * Object Oriented Programming
 * Project 4
 * May 1, 2023
 */
public class Theater
{
    private int roomNum; //room# of the theatre.
    private ArrayList<Row> alley; //list of rows.
    private final int MAX_ROWS = 10; //max number of rows per room.
    private int numOfRows; //the number of rows in the theatre.
    
    /**
     * Constructor for objects of class Theater
     */
    public Theater(int roomNum)
    {
        this.roomNum = roomNum;
        alley = new ArrayList<Row>(); //new object of arraylist row max number of rows is 10.
        numOfRows = 0;
    }

    public int getRoomNumber()
    {
        return roomNum; //returns room number.
    }
    
    public int getNumberOfRows()
    {
        return numOfRows; //returns number of Rows.
    }
    
    public int getAlley(int alley)
    {
        alley.add(new Row(numOfRows + 1));
        numOfRows++;
    }
}
