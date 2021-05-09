/*------------------------------------------------------------------------------
 ilnurv : 2021-5-1 3:23
 -----------------------------------------------------------------------------*/

/*
 * 1
 */

package patternsJava.creationalPatternsJava.factory;

public class FactoryMethodJava {

    Character c = new Character('q');
    Character z = 1;

    public static void main(String[] args) {
        // как пример valueOf вызывает класса Long вызывает класс Long
        //пример вызова интенте в андроиде
        Long l = Long.valueOf("1");
        Long l2 = Long.valueOf(2);
        Long l1 = new Long(1L);
        Long l11 = new Long("2");
        Long l111= new Long('1');

    }


}
