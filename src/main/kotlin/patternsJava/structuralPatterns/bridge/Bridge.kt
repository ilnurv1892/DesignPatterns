/*------------------------------------------------------------------------------
 ilnurv : 2021-4-22 7:52
 -----------------------------------------------------------------------------*/
package patternsJava.structuralPatterns.bridge

interface Infantry {
    fun move(x: Long, y: Long)
    fun attack(x: Long, y: Long)

    //fun shot() нельзя добавить, тогда мы должны будем изменить все классы которые наследуются от этого интерфейса
}

open class Rifleman : Infantry {
    override fun move(x: Long, y: Long) {
        TODO("Not yet implemented")
    }

    override fun attack(x: Long, y: Long) {
        TODO("Not yet implemented")
    }


}

open class Grenadier : Infantry {
    override fun move(x: Long, y: Long) {
        TODO("Not yet implemented")
    }

    override fun attack(x: Long, y: Long) {
        TODO("Not yet implemented")
    }
}


class UpgradedRifleman : Rifleman() {
    override fun attack(x: Long, y: Long) {
        super.attack(x, y)
    }
}

class UpgradedGrenadier : Grenadier() {
    override fun attack(x: Long, y: Long) {
        super.attack(x, y)
    }
}

class LightRifleman : Rifleman() {
    override fun move(x: Long, y: Long) {
        super.move(x, y)
    }
}

class LightGrenadier : Grenadier() {
    override fun move(x: Long, y: Long) {
        super.move(x, y)
    }
}


//4 класса сверху не будут использоваться, т.к. обязательную функцию атаки они не смогут поддержать
// создадим промежуточный класс, который может контролить тип оружия и скорость(4 класса сверху)

//создадим промежуточный класс - бридж
class Soldier(private val weapon: Weapon, private val legs: Legs) : Infantry {
    override fun move(x: Long, y: Long) {
     legs.move()
    }

    override fun attack(x: Long, y: Long) {
      weapon.causeDamage()
    }

}

interface Weapon {
    fun causeDamage(): PointsOfDamage
}

interface Legs {
    fun move(): Meters
}

// meaning of value returning is
typealias PointsOfDamage = Long
typealias Meters = Int


class Grenade : Weapon {
    override fun causeDamage() = GRENADE_DAMAGE
}

class GrenadePack : Weapon {
    override fun causeDamage(): PointsOfDamage {
        return GRENADE_DAMAGE * 3
    }
}

class Rifle : Weapon {
    override fun causeDamage(): PointsOfDamage {
        return RIFLE_DAMAGE
    }
}

class MachineGun : Weapon {
    override fun causeDamage(): PointsOfDamage {
        return RIFLE_DAMAGE * 2
    }
}

class RegularLegs : Legs {
    override fun move(): Meters {
        return REGULAR_SPEED
    }
}

class AthleticsLegs : Legs {
    override fun move(): Meters {
        return REGULAR_SPEED * 2
    }
}

const val GRENADE_DAMAGE: PointsOfDamage = 5L
const val RIFLE_DAMAGE = 3L
const val REGULAR_SPEED: Meters = 1


fun main() {
    val rifleman = Soldier(Rifle(), RegularLegs())
    val grenadier = Soldier(Grenade(), RegularLegs())

    val upgradedGrenadier = Soldier(GrenadePack(), RegularLegs())
    val upgradedRifleman = Soldier(MachineGun(), RegularLegs())

    val lightGrenadier = Soldier(Grenade(), AthleticsLegs())
    val lightRifleman = Soldier(Rifle(), AthleticsLegs())

}




/*
до bridge

Infantry --> Rifleman  --> Upgraded Rifleman
                       --> Light Rifleman
         --> Grenadier --> Upgraded Grenadier
                       --> Light Grenadier


 */


/*
после бриджа

Infantry --> Soldier

Weapon -->GrenadePack
        -->Rifle
        -->MachineGun
        -->Grenade
Legs    --> RegularLegs
        --> AthleticLegs

 */