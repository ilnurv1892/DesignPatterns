/*------------------------------------------------------------------------------
 ilnurv : 2021-5-4 8:36
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.observerJava.anotherExample;

public interface Subject {

    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObserver();

}
