package dip.lab2.student.solution1;

/**
 * A high-level class that delegates to a polymorphic TipCalculator object to do 
 * the work. 
 *
 * @author Dawn Bykowski
 */
public class ServiceHandler {

    private TipCalculator tipCalculator;
    
    // This constructor initializes a tipCalculator object.
    public ServiceHandler(TipCalculator tipCalc) {
        tipCalculator = tipCalc;
    }

    
    
    
}
