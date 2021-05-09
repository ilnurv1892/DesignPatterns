/*------------------------------------------------------------------------------
 ilnurv : 2021-5-4 8:38
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.observerJava.anotherExample;

public class NextObject implements Observer,Display{
    private String name;
    private Integer age;

    public NextObject(Subject s) {
        s.registerObserver(this);
    }


    @Override
    public void update(String name, Integer age) {
        System.out.println(this.getClass() + "Я обновился!");
        this.name = name;
        this.age = age;
        display();
    }

    @Override
    public void display() {
        System.out.println(name+" "+age);
    }
}
