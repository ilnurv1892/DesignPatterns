/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 11:20
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-1 10:48
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.strategyJava.GameExample.character;


import patternsJava.behaviorPatterns.strategyJava.GameExample.weaponBehavior.WeaponBehavior;
import patternsJava.behaviorPatterns.strategyJava.GameExample.weapons.Weapon;

public class King extends Character {

    public King(Integer hp, String name, Weapon weapon) {
        super(hp, name, weapon);
    }

    @Override
    public void fight(Character attacked) {
        this.weapon.makeDmg();
        attacked.healthPoints = attacked.healthPoints - 10;
        System.out.println(attacked.name + " - 10 HP");
    }

    @Override
    public void setWeapon(WeaponBehavior weaponBehavior) {
        this.weapon = weaponBehavior;
    }


}
