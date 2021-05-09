/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 11:24
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.observerJava.watherDataJava;

import patternsJava.behaviorPatterns.observerJava.watherDataJava.displayElements.Observer;

public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
