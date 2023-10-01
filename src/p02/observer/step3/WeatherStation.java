package p02.observer.step3;

import p02.observer.step2.CurrentConditionsDisplay;
import p02.observer.step2.ForecastDisplay;
import p02.observer.step2.StatisticsDisplay;
import p02.observer.step2.WeatherData;


public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HealthDisplay healthDisplay = new HealthDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
