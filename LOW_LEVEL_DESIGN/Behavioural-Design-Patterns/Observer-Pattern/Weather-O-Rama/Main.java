import Observers.CurrentConditionsDisplay;
import Subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay disp1 = new CurrentConditionsDisplay(74, 61);
        disp1.display();

        weatherData.setMeasurements(80, 65, 30.4f);
        disp1.display();

        weatherData.registerObserver(disp1);
        weatherData.setMeasurements(82, 70, 29.2f);

        weatherData.removeObserver(disp1);
        weatherData.setMeasurements(78, 90, 29.2f);
        disp1.display();
    }
}
