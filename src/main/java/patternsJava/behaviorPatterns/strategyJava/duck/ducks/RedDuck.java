/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 11:20
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-1 1:38
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.strategyJava.duck.ducks;

import patternsJava.behaviorPatterns.strategyJava.duck.Fly.FlyBehavior;
import patternsJava.behaviorPatterns.strategyJava.duck.Fly.FlyRocketPowered;
import patternsJava.behaviorPatterns.strategyJava.duck.Quack.Quack;

public class RedDuck extends Duck {

    public RedDuck() {

        //используем готовый шаблон поведения Quack
        quackBehavior = new Quack();

        //можно заоверрайдить лямбдой
        flyBehavior = () -> System.out.println("fly");

        //заоверрайдить анонимным классом
        flyBehavior = new FlyBehavior() {
            @Override
            public void fly() {
                System.out.println("fly");
            }
        };

        //заоверрайдить ссылкой
        flyBehavior = RedDuck::fly;
    }

    private static void fly() {
        System.out.println("fly");
    }

    //от абстрактного класса DUCK без тела обязательно заоверрайдить инче ошибка
    @Override
    public void display() {
        System.out.println("im red duck!");

    }

    //родительские методы с реализацией овверрайдить опционально
    @Override
    public void performFly() {
        //можно переопределить свойство абстратного класса
        flyBehavior = new FlyRocketPowered();
        super.performFly();
    }

    @Override
    public void swim() {
        System.out.println("I SOLWE WHO SWIM!");
    }
}
