/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 11:20
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-1 1:24
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.strategyJava.GameExample.weapons;

import patternsJava.behaviorPatterns.strategyJava.GameExample.weaponBehavior.BowBehavior;

public class LongBow extends Weapon implements BowBehavior {
    public LongBow(String name) {
        super(name);
    }

    @Override
    public void shot() {
        System.out.println("SHOOT");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makeDmg() {
        shot();
    }
}
