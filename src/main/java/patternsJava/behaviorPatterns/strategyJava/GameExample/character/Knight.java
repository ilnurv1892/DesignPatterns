/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 11:20
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-1 10:49
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.strategyJava.GameExample.character;

import patternsJava.behaviorPatterns.strategyJava.GameExample.weaponBehavior.WeaponBehavior;
import patternsJava.behaviorPatterns.strategyJava.GameExample.weapons.Weapon;

public class Knight extends Character {
    public Knight(Integer hp, String name, Weapon weapon) {
        super(hp, name, weapon);
    }

    @Override
   public void fight(Character attacked) {
        this.weapon.makeDmg();
    }

    @Override
    public void setWeapon(WeaponBehavior weaponBehavior) {
        this.weapon = weaponBehavior;

    }
}
