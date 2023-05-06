import java.util.ArrayList;

/**
 * A class to model a theater.
 * 
 * @author Michael B
 * @version (a version number or a date)
 */
public class Theater {
    private int number;
    private Rows row;

    /**
     * Constructor for class Theater
     * @param number The theater number
     * @param row
     */
    public Theater(int number, Rows row) {
        this.number = number;
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
