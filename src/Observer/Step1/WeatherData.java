package Observer.Step1;

public class WeatherData {
    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        //currentConditionsDisplay.update(temp, humidity, pressure);
        //statisticDisplay.update(temp, humidity, pressure);
        //forecastDisplay.update(temp, humidity, pressure);
    }

    private float getTemperature() {
        return 0;
    }

    private float getHumidity() {
        return 0;
    }

    private float getPressure() {
        return 0;
    }
}
