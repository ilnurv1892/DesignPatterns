/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 11:20
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-1 10:47
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.strategyJava.GameExample;

import patternsJava.behaviorPatterns.strategyJava.GameExample.character.Character;
import patternsJava.behaviorPatterns.strategyJava.GameExample.character.King;
import patternsJava.behaviorPatterns.strategyJava.GameExample.character.Knight;
import patternsJava.behaviorPatterns.strategyJava.GameExample.weapons.LongBow;
import patternsJava.behaviorPatterns.strategyJava.GameExample.weapons.RedKnife;
import patternsJava.behaviorPatterns.strategyJava.GameExample.weapons.WarAxe;


public class MainClass {

    public static void main(String[] args) {

        Character king = new King(100,"korol",new RedKnife("kracnii_nozh"));
        king.display();

        Character knigtn = new Knight(100, "knight", new WarAxe("molotok"));

        king.display();

        king.fight(knigtn);

        knigtn.display();
        RedKnife red_knif = new RedKnife("red_knif");
        knigtn.setWeapon(red_knif);
        knigtn.display();
        knigtn.setWeapon(new LongBow("long bow"));
        knigtn.display();
        System.out.println("______________");


        knigtn.fight(king);






    }
}
