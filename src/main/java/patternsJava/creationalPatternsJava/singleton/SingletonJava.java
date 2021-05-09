/*------------------------------------------------------------------------------
 ilnurv : 2021-5-1 3:23
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-4-14 7:40
 -----------------------------------------------------------------------------*/
package patternsJava.creationalPatternsJava.singleton;

public final class SingletonJava {
    private static SingletonJava SINGLETONINSTANCE;
     int a = 0;

    private SingletonJava() {
    }

    public static  SingletonJava  getInstance(){

        if (SINGLETONINSTANCE ==null){
            SINGLETONINSTANCE  = new SingletonJava();
        }

        return SINGLETONINSTANCE;
    }




}



