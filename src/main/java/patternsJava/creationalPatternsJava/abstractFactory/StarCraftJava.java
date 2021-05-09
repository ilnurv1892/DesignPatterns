/*------------------------------------------------------------------------------
 ilnurv : 2021-5-1 3:23
 -----------------------------------------------------------------------------*/

/*
 * 1
 */

package patternsJava.creationalPatternsJava.abstractFactory;

public class StarCraftJava {
    public static void main(String[] args) {
        ZergBuilder builder = new ZergBuilder();


        builder.buildBarracksJava().build(InfantryUnitsJava.WARRIOR);
        builder.buildHeavyUnitJava().build(VehicleUnitsJava.TANK);

        BuildingJava<VehicleUnitsJava, VehicleJava> vehicleUnitsJavaVehicleJavaBuildingJava = builder.buildHeavyUnitJava();

        vehicleUnitsJavaVehicleJavaBuildingJava.build(VehicleUnitsJava.TANK);
      //  System.out.println(vehicleUnitsJavaVehicleJavaBuildingJava.build(VehicleUnitsJava.valueOf("q")));




    }

}


interface  BuildingJava<UnitType, ProducedUnit> {
    ProducedUnit build(UnitType unitType);
}

interface Builder {
    BuildingJava<InfantryUnitsJava, InfantryJava> buildBarracksJava();
    BuildingJava<VehicleUnitsJava, VehicleJava> buildHeavyUnitJava();
}

enum InfantryUnitsJava {
    WARRIOR, SOLDIER
}

enum VehicleUnitsJava {
    TANK, ARC
}

interface UnitJava {
}

interface VehicleJava extends UnitJava {
}

interface InfantryJava extends UnitJava {
}

class Warrior implements InfantryJava {
}

class Soldier implements InfantryJava {
}

class TankJava implements VehicleJava {
}

class ARCJava implements VehicleJava {
}

class ZergBuilder implements Builder {

    //c лямбдой
    @Override
    public BuildingJava<InfantryUnitsJava, InfantryJava> buildBarracksJava() {
        return infantryUnitsJava -> {
            switch (infantryUnitsJava) {
                case WARRIOR:
                    return new Warrior();
                case SOLDIER:
                    return new Soldier();
            }
            return null;
        };
    }

    //без лямбды
    @Override
    public BuildingJava<VehicleUnitsJava, VehicleJava> buildHeavyUnitJava() {
        return new BuildingJava<VehicleUnitsJava, VehicleJava>() {
            @Override
            public VehicleJava build(VehicleUnitsJava vehicleUnitsJava) {

                switch (vehicleUnitsJava) {
                    case TANK:
                        return new TankJava();
                    case ARC:
                        return new ARCJava();
                }
                return null;
            }
        };

    }
}
