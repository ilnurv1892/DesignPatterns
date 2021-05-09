/*------------------------------------------------------------------------------
 ilnurv : 2021-5-4 8:37
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.observerJava.anotherExample;

import java.util.ArrayList;

public class MainObject implements Subject {
    private final ArrayList<Observer> observers;
    private String name;
    private Integer age;


    public MainObject() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o : observers) {
            o.update(name,age);
        }
    }

    public void setData(String name, Integer age) {
        this.name = name;
        this.age = age;
        notifyObserver();
    }
}
