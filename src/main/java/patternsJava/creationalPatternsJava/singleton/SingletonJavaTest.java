/*------------------------------------------------------------------------------
 ilnurv : 2021-5-1 3:23
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-4-14 8:13
 -----------------------------------------------------------------------------*/
package patternsJava.creationalPatternsJava.singleton;

public class SingletonJavaTest {

    public static void main(String[] args) {

        SingletonJava s =  SingletonJava.getInstance();
        s.a = 3;
        SingletonJava b =  SingletonJava.getInstance();
        System.out.println(b.a);

    }
}
