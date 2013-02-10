package dip.lab2.student.solution1;

/**
 * Returns the tip for any type of service industry that requires tipping.
 * 
 * @author Dawn Bykowski
 */
public interface TipCalculator {

    public static final double MIN_BILL = 0.00;
    public static final double MAX_BILL = 100.00;
    public static final String BILL_ENTRY_ERR =
            "Error: bill must be between " + MIN_BILL + " and "
            + MAX_BILL;
    public static final double GOOD_RATE = 0.20;
    public static final double FAIR_RATE = 0.15;
    public static final double POOR_RATE = 0.10;
    
    public abstract double getTip();
    
}
