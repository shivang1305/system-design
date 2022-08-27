package Observers;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;

        display();
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: " + temperature + " degrees & " + humidity + "%");
    }

}
