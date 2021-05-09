/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 11:20
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-4-29 8:20
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-4-29 7:42
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.strategyJava.duck.ducks;

import patternsJava.behaviorPatterns.strategyJava.duck.Fly.FlyBehavior;
import patternsJava.behaviorPatterns.strategyJava.duck.Fly.FlyNoWay;
import patternsJava.behaviorPatterns.strategyJava.duck.Quack.MuteQuack;
import patternsJava.behaviorPatterns.strategyJava.duck.Quack.QuackBehavior;







public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
        //Даже если вы не объявили никакого конструктора, компилятор добавит в абстрактный класс конструктор по умолчанию без аргументов.
        // Без него ваш подкласс не скомпилируется, поскольку первый оператор в любом конструкторе представляет собой неявный вызов super() – конструктора суперкласса по умолчанию в языке Java.
        //в конструкторе былобы неплохо инициализировать ненуловые дефалтовые методы
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }


    public abstract void display();

    public void performFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }


    public void swim() {
        System.out.println("all ducks float");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

}


