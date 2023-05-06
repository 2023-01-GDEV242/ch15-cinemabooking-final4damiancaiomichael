import java.util.ArrayList;

/**
 * A class to model a theater.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version (a version number or a date)
 */
public class Theater {
    private int number;
    private Showing showing;
    private Rows row;

    /**
     * Constructor for class Theater
     * @param number The theater number
     * @param showing
     * @param row
     */
    public Theater(int number, Showing showing, Rows row) {
        this.number = number;
        this.showing = showing;
        this.row = row;
    }

    /**
     * Returns the theater number
     * @return The theater number
     */
    public int getNumber() {
        return number;
    }

}
