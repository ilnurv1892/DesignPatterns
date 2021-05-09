/*------------------------------------------------------------------------------
 ilnurv : 2021-5-5 7:37
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-5 7:36
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-5 7:31
 -----------------------------------------------------------------------------*/
package patternsJava.structuralPatterns.decoratorJava.CoffeExample;


public class MainClass {
    public static void main(String[] args) {
        Beverage b = new Espresso();

        System.out.println(b.getDescription() + " " + b.cost());
        Beverage b2 = new Mocha(b);
        System.out.println(b2.getDescription() + " " + b2.cost());

        Beverage b1 = new HoseBlend();
        System.out.println(b1.getDescription() + " " + b1.cost());
        b1 = new Mocha(b1);
        b1 = new Mocha(b1);
        System.out.println(b1.getDescription() + " " + b1.cost());

        Beverage b3 = new Mocha(b2);
        System.out.println(b3.getDescription() + " " + b3.cost());

    }
}
