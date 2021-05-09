package patternsJava.creationalPatterns.abstractFactory

interface Building<in UnitType, out ProducedUnit>
        where UnitType : Enum<*>, ProducedUnit : Unit {
    fun build(type: UnitType): ProducedUnit
}

class HQ {
    private val building = mutableListOf<Building<*, Unit>>()

    fun buildBarracks(): Barracks {
        val b = Barracks()
        building.add(b)
        return b
    }

    fun buildVehicleFactory(): VehicleFactory {
        val vf = VehicleFactory()
        building.add(vf)
        return vf
    }

}


interface Unit
interface Vehicle : Unit
interface Infantry : Unit

class Rifleman : Infantry
class RocketSoldier : Infantry

enum class InfantryUnits {
    RIFLEMEN, ROCKET_SOLDIER
}

class APC : Vehicle
class Tank : Vehicle


enum class VehicleUnits {
    APC, TANK
}

class Barracks : Building<InfantryUnits, Infantry> {
    override fun build(type: InfantryUnits): Infantry {
        return when (type) {
            InfantryUnits.RIFLEMEN -> Rifleman()
            InfantryUnits.ROCKET_SOLDIER -> RocketSoldier()

        }
    }

}

class VehicleFactory : Building<VehicleUnits, Vehicle> {
    override fun build(type: VehicleUnits): Vehicle {
        return when (type) {
            VehicleUnits.APC -> APC()
            VehicleUnits.TANK -> Tank()
        }
    }
}

fun main() {
    val hq = HQ()
    val barracks1 = hq.buildBarracks()
    val barracks2 = hq.buildBarracks()
    val vehicleFactory = hq.buildVehicleFactory()


    val units = listOf(
        barracks1.build(InfantryUnits.RIFLEMEN),
        barracks1.build(InfantryUnits.RIFLEMEN),
        barracks1.build(InfantryUnits.RIFLEMEN),
        barracks2.build(InfantryUnits.RIFLEMEN),
        vehicleFactory.build(VehicleUnits.TANK),
        vehicleFactory.build(VehicleUnits.APC)
    )

}