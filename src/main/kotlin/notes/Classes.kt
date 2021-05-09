/*------------------------------------------------------------------------------
 ilnurv : 2021-4-26 8:22
 -----------------------------------------------------------------------------*/
package notes
class House(type: String, price: Double, yearBuild: Int, owner: String) {
    var type: String? = null
    var price: Double? = null
    var yearBuild: Int? = null
    var owner: String? = null



    init {

        this.owner = owner
        this.type = type
        this.price=price
        this.yearBuild = yearBuild

    }

    fun getTyp(): String? {
        return this.type
    }

    fun setTyp(type: String) {
        this.type=type
    }
}


fun main() {

    var myHouse = House("Big house", 230.00, 2015, "ME")
    var second = House("small house", 12.00, 2011, "NOT ME")
    myHouse.owner="qwd"
    println(myHouse.owner)
    println(second.owner)

    myHouse.getTyp()
    myHouse.setTyp("qw")
}