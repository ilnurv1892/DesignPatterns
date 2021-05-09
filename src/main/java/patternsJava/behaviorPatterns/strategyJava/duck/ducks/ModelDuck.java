/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 11:20
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-4-29 8:20
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-4-29 8:1
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.strategyJava.duck.ducks;

import patternsJava.behaviorPatterns.strategyJava.duck.Fly.FlyNoWay;
import patternsJava.behaviorPatterns.strategyJava.duck.Quack.Quack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("im model duck");
    }
}
