/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 11:20
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-1 1:25
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.strategyJava.GameExample.weapons;

import patternsJava.behaviorPatterns.strategyJava.GameExample.weaponBehavior.KnifeBehavior;

public class DarkKnife extends Weapon implements KnifeBehavior {


    public DarkKnife(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void makeDmg() {
        cut();
    }


    @Override
    public void cut() {
        System.out.println("cut_wth knife");
    }
}
