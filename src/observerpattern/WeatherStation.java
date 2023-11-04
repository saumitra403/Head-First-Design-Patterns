package observerpattern;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData data = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(data);

        data.setMeasurements(80,65,30.4f);
        data.setMeasurements(82,70,29.2f);
    }
}
