
/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 11:31
 -----------------------------------------------------------------------------*/


/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 11:27
 -----------------------------------------------------------------------------*/


package patternsJava.behaviorPatterns.observerJava.watherDataJava.displayElements;


import patternsJava.behaviorPatterns.observerJava.watherDataJava.Subject;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Subject weatherData;


    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }




    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;

        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionDisplay :" +
                "temperature=" + temperature +
                ", humidity=" + humidity);
    }
}

