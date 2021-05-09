/*------------------------------------------------------------------------------
 ilnurv : 2021-4-25 9:22
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns

interface InfantryUnit

class Squad(val infantryUnit: MutableList<InfantryUnit> = mutableListOf()) {
    val commander = Sergeant()
}

class Sergeant : InfantryUnit


class Platoon(val squads: MutableList<Squad> = mutableListOf()) {
    val commander = Lieutenant()
}

class Lieutenant : InfantryUnit {

}


fun main() {

//iterator


}

