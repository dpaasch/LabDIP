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
 * I believe this meets all the requirements of the DIP.  It appears that the
 * switch to a different calculator instance passed to the high-level class works
 * successfully.  The low-level instances do not appear to be interchangeable, 
 * meaning that I was unable to create a new BaggageServiceTipCalculator type with 
 * a new FoodServiceTipCalculator object.
 */
public class Startup {

    public static enum ServiceQuality {

        GOOD, FAIR, POOR
    };

    public static void main(String[] args) {

        // Create a DecimalFormat object to better display the salary
        DecimalFormat dollar = new DecimalFormat("###,##0.00");


        // Create instances of low-level classes using Liskov Substitution principle.
        BaggageServiceTipCalculator baggageCalc =
                new BaggageServiceTipCalculator
                (BaggageServiceTipCalculator.ServiceQuality.GOOD, 4);
        System.out.println(baggageCalc);

        FoodServiceTipCalculator foodCalc =
                new FoodServiceTipCalculator
                (FoodServiceTipCalculator.ServiceQuality.GOOD, 50.00);
        System.out.println(foodCalc);

        // Create an instance of your high-level class.
        ServiceHandler serviceHandler = new ServiceHandler();
        System.out.println("\n*****ServiceHandler*****");
        System.out.println("ServiceHandler.." 
                + dollar.format(serviceHandler.getTip(foodCalc)));

        // Pass one of your calculator instances to the high-level class and 
        // check the results.
        ServiceHandler serviceHandler1 = new ServiceHandler(baggageCalc);
//        System.out.println("ServiceHandler..BaggageServiceTipCalculator" 
//        + baggageCalc);
        System.out.println("ServiceHandler..BaggageService tip: $" 
                + dollar.format(serviceHandler1.getTip(baggageCalc)));

        // Now switch to a different calculator instance and pass that to the 
        // high-level class.
        ServiceHandler serviceHandler2 = new ServiceHandler(foodCalc);
//        System.out.println("ServiceHandler..FoodServiceTipCalculator" 
//        + foodCalc);
        System.out.println("ServiceHandler..FoodService tip: $" 
                + dollar.format(serviceHandler2.getTip(foodCalc)));
    }
}
