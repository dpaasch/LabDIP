package dip.lab2.student.solution1;

import java.text.DecimalFormat;

/**
 * An example low-level class. Does this class definition follow the DIP? If
 * not, fix it.
 *
 * Any other best practice violations? Fix them too.
 *
 * @author Dawn Bykowski
 */
public class FoodServiceTipCalculator implements TipCalculator {
    // Moved these properties to the TipCalculator Interface, since they are 
    // shared amongst each of the sub-classes.
//    private static final double MIN_BILL = 0.00;
//    private static final String BILL_ENTRY_ERR =
//            "Error: bill must be greater than or equal to " + MIN_BILL;
//    private static final double GOOD_RATE = 0.20;
//    private static final double FAIR_RATE = 0.15;
//    private static final double POOR_RATE = 0.10;
    private double bill;

    public enum ServiceQuality {

        GOOD, FAIR, POOR
    }
    private ServiceQuality serviceQuality;

    public FoodServiceTipCalculator(ServiceQuality q, double billAmt) {
        this.setServiceRating(q);
        this.setBill(billAmt);
    }

    // Inherited this method from the interface.
    @Override
    public double getTip() {
        double tip = 0.00; // always initialize local variables

        switch (serviceQuality) {
            case GOOD:
                tip = bill * GOOD_RATE;
                break;
            case FAIR:
                tip = bill * FAIR_RATE;
                break;
            case POOR:
                tip = bill * POOR_RATE;
                break;
        }

        return tip;
    }

    public final void setBill(double billAmt) {
        if (billAmt < MIN_BILL) {
            throw new IllegalArgumentException(BILL_ENTRY_ERR);
        }
        bill = billAmt;
    }

    public final void setServiceRating(ServiceQuality q) {
        // No need to validate because enums provide type safety!
        serviceQuality = q;
    }

    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    @Override
    public String toString() {

        // Create a DecimalFormat object to better display the pay rate
        DecimalFormat dollar = new DecimalFormat("#,##0.00");

        String foodCalc = "\n*****FoodServiceTipCalculator*****"
                + "\n Service Quality: \t" + serviceQuality
                + "\n Bill Amount: \t\t$" + dollar.format(bill)
                + "\n Tip Amount: \t\t$" + dollar.format(getTip());
        // Return the string.
        return foodCalc;
    }
}
