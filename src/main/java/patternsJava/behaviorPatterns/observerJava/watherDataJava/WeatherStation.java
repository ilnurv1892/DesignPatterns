/*------------------------------------------------------------------------------
 ilnurv : 2021-5-4 7:24
 -----------------------------------------------------------------------------*/

/*------------------------------------------------------------------------------
 ilnurv : 2021-5-3 0:54
 -----------------------------------------------------------------------------*/
package patternsJava.behaviorPatterns.observerJava.watherDataJava;

import patternsJava.behaviorPatterns.observerJava.watherDataJava.displayElements.CurrentConditionDisplay;

public class WeatherStation {
    public static void main(String[] args) {

        WeatherData wd = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(wd);
        wd.setMeasurements(70, 66, 30.4f);
        currentConditionDisplay.display();

        wd.registerObserver(currentConditionDisplay);
    }
}
