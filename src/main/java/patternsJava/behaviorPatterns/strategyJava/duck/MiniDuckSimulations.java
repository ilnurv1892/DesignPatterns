/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 11:20
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-4-29 7:52
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.strategyJava.duck;

import patternsJava.behaviorPatterns.strategyJava.duck.Fly.FlyNoWay;
import patternsJava.behaviorPatterns.strategyJava.duck.Quack.MuteQuack;
import patternsJava.behaviorPatterns.strategyJava.duck.ducks.Duck;
import patternsJava.behaviorPatterns.strategyJava.duck.ducks.RedDuck;

public class MiniDuckSimulations {

    public static void main(String[] args) {
      /*  Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();


        Duck model = new ModelDuck();

        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();*/



        Duck red = new RedDuck();
        red.display();

        red.performFly();
        red.performQuack();
        red.swim();

        red.setQuackBehavior(new MuteQuack());

        red.performQuack();
        red.setFlyBehavior(new FlyNoWay());
        red.performFly();

    }
}
   /* im red duck!
        fly
        Quack!
        all ducks float
        silence
        i can't fly!*/