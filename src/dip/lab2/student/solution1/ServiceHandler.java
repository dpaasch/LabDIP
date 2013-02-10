package dip.lab2.student.solution1;

/**
 * A high-level class that delegates to a polymorphic employee object to do the 
 * work. Many options are presented to get you thinking. But if you read
 * all the comments you will see that only one method and is all that is
 * really needed here. Other programs may need more.
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
    
    // Constructor: no-arg (default constructor) initializes nothing. 
    public ServiceHandler() {
        
    }

    
    public void setTipCalculator(TipCalculator t) {
        if(t == null) {
            throw new NullPointerException();
        }
        tipCalculator = t;
    }
    
    // This passes the TipCalculator object to the getTip() method.
    public double getTip(TipCalculator t) {
        return t.getTip();
    }
}














