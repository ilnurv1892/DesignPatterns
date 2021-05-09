/*------------------------------------------------------------------------------
 ilnurv : 2021-4-24 2:21
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns


//1 пример   класы конкретныхъ оружий реализуют интерфейс weapon который стреляет, поэтому все типы оружий могут стрелять.
//2 пример переменной присваивается функция, её можно заменить hero.currentWeapon2 = Weapons.banana и снова стрелять  hero.shoot()


enum class Directions {
    LEFT, RIGHT
}




abstract class Projectile(private val x: Int, private val y: Int, private val directions: Directions)

class OurHero {
    private var direction = Directions.LEFT
    private var x: Int = 42
    private var y: Int = 173
    private var currentWeapon: Weapon = Peashooter()

    var currentWeapon2 = Weapons.peashotter
    val shoot = fun() { currentWeapon }

    fun shot(): Projectile = currentWeapon.shot(x, y, direction)

    fun equip(weapon: Weapon) {
        currentWeapon = weapon
    }


}

interface Weapon {
    fun shot(x: Int, y: Int, directions: Directions) = object : Projectile(x, y, directions) {}

}



class Peashooter : Weapon {
    override fun shot(x: Int, y: Int, directions: Directions) = object : Projectile(x, y, directions) {}
}

class Pomegranate : Weapon {
    override fun shot(x: Int, y: Int, directions: Directions): Projectile {
        return super.shot(x, y, directions)
    }
}


class Banana : Weapon {
    override fun shot(x: Int, y: Int, directions: Directions): Projectile {
        return super.shot(x, y, directions)
    }
}


fun main() {
    var hero = OurHero()
    hero.shot()

    hero.equip(Banana())
    hero.currentWeapon2 = Weapons.banana
    hero.shoot()
    hero.shoot()
    println(hero.shot())

}

object Weapons {

    val peashotter = fun(_: Int, _: Int, _: Directions){}
    val banana = fun(x: Int, y: Int, direction: Directions){}
    val ponegrenade = fun(x: Int, y: Int, direction: Directions){}

}