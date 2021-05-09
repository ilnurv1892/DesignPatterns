package oo

class House(val numberOfRooms: Int, val price: Double) {


    companion object Factory : HouseFactory {
        const val HOUSES_FOR_SALE = 10
        fun getNormalHouse() = House(42, 123.12)
        fun getLuxHouse() = House(6, 123.12)

        override fun createHouse() = getLuxHouse()
    }
}

interface HouseFactory {
    fun createHouse(): House
}


fun main() {
    val normalHouse = House.Factory.getNormalHouse()
    println(normalHouse.price)


    println(House.HOUSES_FOR_SALE)
}

// тот же статик метот что и в джаве