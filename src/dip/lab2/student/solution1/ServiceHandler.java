package dip.lab2.student.solution1;

/**
 * A high-level class that delegates to a polymorphic TipCalculator object to 
 * do the work. 
 *
 * @author Dawn Bykowski
 */
public class ServiceHandler {
    
    // This is the delegate object that does the work; it's being initialized here.
    private TipCalculator tipCalculator;

    // Constructor: Accepts a TipCalculator object, thus initializing the object.
    public ServiceHandler(TipCalculator t) {
        tipCalculator = t;
    }
    
    // This passes the TipCalculator object to the getTip() method.
    public double getTip(TipCalculator t) {
        return t.getTip();
    }
}














