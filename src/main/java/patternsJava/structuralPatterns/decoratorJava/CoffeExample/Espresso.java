/*------------------------------------------------------------------------------
 ilnurv : 2021-5-5 7:37
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-5 7:36
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-5 7:25
 -----------------------------------------------------------------------------*/
package patternsJava.structuralPatterns.decoratorJava.CoffeExample;

public class Espresso extends Beverage {
    @Override
    public double cost() {
        return 1.99;
    }

    public Espresso() {
        description = "Espresso";
    }
}
