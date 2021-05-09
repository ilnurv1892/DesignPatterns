package patternsJava.creationalPatterns.abstractFactory

interface Building2<in UnitType, out ProducedUnit> where UnitType : Enum<*>, ProducedUnit : Unit2 {
    fun build(type: UnitType): ProducedUnit
}

interface Scv {
    fun buildBarracks(): Building2<InfantryUnits2, Infantry2>
    fun buildVehicleFactory(): Building2<VehicleUnits2, Vehicle2>
}


class ZergScv : Scv {
    private val building = mutableListOf<Building2<*, Unit2>>()

    override fun buildBarracks(): Building2<InfantryUnits2, Infantry2> {
        val b = object : Building2<InfantryUnits2, Infantry2> {
            override fun build(type: InfantryUnits2): Infantry2 {
                return when (type) {
                    InfantryUnits2.RIFLEMEN -> Rifleman2()
                    InfantryUnits2.ROCKET_SOLDIER -> RocketSoldier2()

                }
            }
        }
        building.add(b)
        return b
    }

    override fun buildVehicleFactory(): Building2<VehicleUnits2, Vehicle2> {
        val vf = object : Building2<VehicleUnits2, Vehicle2> {
            override fun build(type: VehicleUnits2): Vehicle2 {
                return when (type) {
                    VehicleUnits2.APC -> APC2()
                    VehicleUnits2.TANK -> Tank2()
                }
            }
        }
        building.add(vf)
        return vf
    }
}


class ProtossScv : Scv {
    private val building = mutableListOf<Building2<*, Unit2>>()

    override fun buildBarracks(): Building2<InfantryUnits2, Infantry2> {
        val b = object : Building2<InfantryUnits2, Infantry2> {
            override fun build(type: InfantryUnits2): Infantry2 {
                return when (type) {
                    InfantryUnits2.RIFLEMEN -> Rifleman2()
                    InfantryUnits2.ROCKET_SOLDIER -> RocketSoldier2()

                }
            }
        }
        building.add(b)
        return b
    }

    override fun buildVehicleFactory(): Building2<VehicleUnits2, Vehicle2> {
        val vf = object : Building2<VehicleUnits2, Vehicle2> {
            override fun build(type: VehicleUnits2): Vehicle2 {
                return when (type) {
                    VehicleUnits2.APC -> APC2()
                    VehicleUnits2.TANK -> Tank2()
                }
            }
        }
        building.add(vf)
        return vf
    }
}


interface Unit2
interface Vehicle2 : Unit2
interface Infantry2 : Unit2

class Rifleman2 : Infantry2
class RocketSoldier2 : Infantry2


class APC2 : Vehicle2
class Tank2 : Vehicle2

enum class InfantryUnits2 {
    RIFLEMEN, ROCKET_SOLDIER
}

enum class VehicleUnits2 {
    APC, TANK
}


fun main() {
    val scv = ZergScv()

    val buildBarracks = scv.buildBarracks()

    buildBarracks.build(InfantryUnits2.RIFLEMEN)
    buildBarracks.build(InfantryUnits2.RIFLEMEN)
    buildBarracks.build(InfantryUnits2.RIFLEMEN)
    buildBarracks.build(InfantryUnits2.RIFLEMEN)

    val buildVehicleFactory = scv.buildVehicleFactory()
    buildVehicleFactory.build(VehicleUnits2.TANK)
    buildVehicleFactory.build(VehicleUnits2.TANK)
    buildVehicleFactory.build(VehicleUnits2.TANK)
    buildVehicleFactory.build(VehicleUnits2.TANK)
    buildVehicleFactory.build(VehicleUnits2.TANK)

    val scv2 = ProtossScv()
    val buildBarracks1 = scv2.buildBarracks()
    buildBarracks1.build(InfantryUnits2.RIFLEMEN)

}