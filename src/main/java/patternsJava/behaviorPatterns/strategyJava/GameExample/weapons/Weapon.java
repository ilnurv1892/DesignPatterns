/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 11:20
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-1 1:26
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.strategyJava.GameExample.weapons;

import patternsJava.behaviorPatterns.strategyJava.GameExample.weaponBehavior.WeaponBehavior;

abstract public class Weapon implements WeaponBehavior {
  String name ;
    public Weapon(String name ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
