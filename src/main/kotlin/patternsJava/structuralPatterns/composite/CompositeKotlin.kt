/*------------------------------------------------------------------------------
 ilnurv : 2021-4-22 8:26
 -----------------------------------------------------------------------------*/
package patternsJava.structuralPatterns.composite


interface InfantryUnit : CanCountBullets
class Rifleman(initialMagazines: Int = 3) : InfantryUnit {
    private val magazines = List(initialMagazines) {
        Magazine(5)
    }

    override fun bulletsLeft(): Int {
        return magazines.sumBy {
            it.bulletsLeft()
        }
    }
}

class Sniper(initialBulletsLeft: Int = 50) : InfantryUnit {
    private val bullet = List(initialBulletsLeft) { Bullet() }
    override fun bulletsLeft(): Int {

        return bullet.size
    }
}


fun main() {
    val miller = Rifleman()
    val caparzo = Rifleman()
    val jackson = Sniper()

    val squad = Squad()

    //add to squad, but it too much lines
    squad.infantryUnit.add(miller)
    squad.infantryUnit.add(caparzo)
    squad.infantryUnit.add(jackson)

    println(squad.infantryUnit.size)

    //lets replace it with one line of code, and update class Squad.
    val squad2 = Squad(miller, caparzo, jackson)

    val trueSquad = Squad2(miller, miller, jackson, miller, jackson, jackson)

}

//1 - we dont know how much elems passed
class Squad(val infantryUnit: MutableList<InfantryUnit> = mutableListOf()) : CanCountBullets {
    //updates from here
    constructor(first: InfantryUnit) : this(mutableListOf()) {
        this.infantryUnit.add(first)
    }

    constructor(first: InfantryUnit, second: InfantryUnit) :
            this(first) {
        this.infantryUnit.add(second)
    }

    constructor(first: InfantryUnit, second: InfantryUnit, third: InfantryUnit) :
            this(first, second) {
        this.infantryUnit.add(third)
    }

    override fun bulletsLeft(): Int {
        return infantryUnit.sumBy { it.bulletsLeft() }
    }
}


//with vararg

class Squad2(private val infantryUnit: MutableList<InfantryUnit> = mutableListOf()) : CanCountBullets {

    constructor(vararg units: InfantryUnit) : this(mutableListOf()) {
        for (u in units) {
            this.infantryUnit.add(u)
        }
    }

    override fun bulletsLeft(): Int {
        return infantryUnit.sumBy { it.bulletsLeft() }
    }
}


class Bullet

class Magazine(capacity: Int) : CanCountBullets {
    private val bullets = List(capacity) { Bullet() }

    override fun bulletsLeft() = bullets.size
}


interface CanCountBullets {
    fun bulletsLeft(): Int
}

//композиция. 1 как с классом squad  2 - пули закомпозитили в магазины итд