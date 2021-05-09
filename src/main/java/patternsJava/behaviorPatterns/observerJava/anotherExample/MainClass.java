/*------------------------------------------------------------------------------
 ilnurv : 2021-5-4 8:41
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.observerJava.anotherExample;

public class MainClass {
    public static void main(String[] args) {

        MainObject m = new MainObject();
        MainObject m2 = new MainObject();

        m.setData("imya",33);

        NextObject n  = new NextObject(m);
        m.setData("imya",33);

        m2.registerObserver(n);
        m2.removeObserver(n);
        m2.setData("hello",33);

        m2.setData("hello",33);


    }
}
