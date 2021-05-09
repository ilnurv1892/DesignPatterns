/*------------------------------------------------------------------------------
 ilnurv : 2021-5-1 3:23
 -----------------------------------------------------------------------------*/

/*
 * 1
 */

package patternsJava.creationalPatternsJava.factory;

interface Car {
    void drive();
}

class Toyota implements Car {
    @Override
    public void drive() {
        System.out.println("T");
    }
}

class Audi implements Car {
    @Override
    public void drive() {
        System.out.println("A");
    }
}


public class FactoryJava {
    public static void main(String[] args) {

        Factory f = new Factory();
        Car a = f.createCar("A");
        a.drive();
        Car t = f.createCar("T");
        t.drive();
    }
}

class Factory {

    Car createCar(String carType) {
        switch (carType) {
            case "A":
                return new Audi();
            case "T":
                return new Toyota();

        }
        return null;
    }


}