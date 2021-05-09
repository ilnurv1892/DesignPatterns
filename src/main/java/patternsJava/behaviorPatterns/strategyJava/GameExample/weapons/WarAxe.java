/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 11:20
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-1 1:25
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.strategyJava.GameExample.weapons;

import patternsJava.behaviorPatterns.strategyJava.GameExample.weaponBehavior.WeaponBehavior;

public class WarAxe extends Weapon implements WeaponBehavior {

    public WarAxe(String name) {
        super(name);
    }


    @Override
    public void makeDmg() {

    }
}
