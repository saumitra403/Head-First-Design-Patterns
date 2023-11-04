package observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
    List<Observer> observers;

    private float temperature;
    private float humidity;
    private float pressure;
    public WeatherData() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o: observers) {
            o.update();
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;

        measurementsChanged();
    }
    
}
