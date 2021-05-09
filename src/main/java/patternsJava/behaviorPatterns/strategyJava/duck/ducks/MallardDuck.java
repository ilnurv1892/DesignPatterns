/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 11:20
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-4-29 8:20
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-4-29 7:57
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.strategyJava.duck.ducks;

import patternsJava.behaviorPatterns.strategyJava.duck.Fly.FlyWithWings;
import patternsJava.behaviorPatterns.strategyJava.duck.Quack.Quack;

public class MallardDuck extends Duck {


    public MallardDuck() {
       quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("im real mallard duck");
    }
}
