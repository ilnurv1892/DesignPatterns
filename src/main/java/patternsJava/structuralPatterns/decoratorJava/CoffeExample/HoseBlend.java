/*------------------------------------------------------------------------------
 ilnurv : 2021-5-5 7:37
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-5 7:36
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-5 7:27
 -----------------------------------------------------------------------------*/
package patternsJava.structuralPatterns.decoratorJava.CoffeExample;

public class HoseBlend extends Beverage {
    public HoseBlend() {
        description = "House blend coffee";
    }

    @Override
    public double cost() {
        return .89;
    }
}
