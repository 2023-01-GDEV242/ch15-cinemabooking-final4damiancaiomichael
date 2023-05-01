import java.util.ArrayList;

/**
 * A class to model a theater.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version (a version number or a date)
 */
public class Theater {
    private final int number;
    private Showing showing;
    //private Rows row;

    /**
     * Construct a Lot, setting its number and description.
     * @param number The theater number.
     * @param showing .
     */
    public Theater(int number, Showing showing, ArrayList<Integer> row) {
        this.number = number;
        this.showing = showing;
//        this.row = row;
    }
}
