/*------------------------------------------------------------------------------
 ilnurv : 2021-5-5 7:37
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-5 7:36
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-5 7:28
 -----------------------------------------------------------------------------*/
package patternsJava.structuralPatterns.decoratorJava.CoffeExample;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20 + beverage.cost();
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " Mocha";
    }
}
