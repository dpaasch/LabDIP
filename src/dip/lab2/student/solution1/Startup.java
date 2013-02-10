package dip.lab2.student.solution1;

import java.text.DecimalFormat;

/**
 * Just a test class for input and output.
 *
 * 1. Create instances of low-level classes using Liskov Substitution principle.
 * 2. Create an instance of your high-level class. 3. Pass one of your
 * calculator instances to the high-level class and check the results. 4. Now
 * switch to a different calculator instance and pass that to the high-level
 * class. Did it work? Are the low-level instances interchangeable? The DIP
 * requires this.
 *
 * @author Dawn Bykowski
 */
public class Startup {

    public static enum ServiceQuality {

        GOOD, FAIR, POOR
    };

    public static void main(String[] args) {
        
        // Create a DecimalFormat object to better display the salary
        DecimalFormat dollar = new DecimalFormat("###,##0.00");
        
        
        // Create instances of low-level classes using Liskov Substitution principle.
        BaggageServiceTipCalculator service =
                new BaggageServiceTipCalculator(BaggageServiceTipCalculator.ServiceQuality.GOOD,4);
                System.out.println("BaggageService tip: $" + dollar.format(service.getTip()));
                
       FoodServiceTipCalculator service1 = 
               new FoodServiceTipCalculator(FoodServiceTipCalculator.ServiceQuality.GOOD,50.00); 
               System.out.println("FoodService tip: $" + dollar.format(service1.getTip()));
       
       TipCalculator[] tipCalculators = {service, service1};

       ServiceHandler serviceHandler = new ServiceHandler();


    }
}
