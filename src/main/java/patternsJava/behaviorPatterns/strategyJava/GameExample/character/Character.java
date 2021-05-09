/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 11:20
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-1 10:48
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.strategyJava.GameExample.character;


import patternsJava.behaviorPatterns.strategyJava.GameExample.weaponBehavior.WeaponBehavior;
import patternsJava.behaviorPatterns.strategyJava.GameExample.weapons.Weapon;

public abstract class Character {
    Integer healthPoints;
    String name;
    WeaponBehavior weapon;

    public Character(Integer hp, String name, Weapon weapon) {
        healthPoints = hp;
        this.name = name;
        this.weapon = weapon;
    }

    public void display() {
        System.out.println("my name is = " + name);
        System.out.println("health points left " + healthPoints);
        System.out.println("Current weapon is " + weapon.getName());
    }

    public abstract void fight(Character attacked);

    public abstract void setWeapon(WeaponBehavior knifeBehavior);

}
