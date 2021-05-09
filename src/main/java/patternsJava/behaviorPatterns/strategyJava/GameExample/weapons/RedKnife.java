/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 11:20
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-1 1:25
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.strategyJava.GameExample.weapons;

import patternsJava.behaviorPatterns.strategyJava.GameExample.weaponBehavior.KnifeBehavior;

public class RedKnife extends Weapon implements KnifeBehavior {
    public RedKnife(String name) {
        super(name);
    }


    @Override
    public void makeDmg() {
        System.out.println("knife dmg dealt");
    }

    @Override
    public void cut() {

    }
}
