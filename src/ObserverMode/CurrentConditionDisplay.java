package ObserverMode;

public class CurrentConditionDisplay implements Observer, DisplayElement {

    private Subject weatherData;
    private float temp;
    private float hum;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temp, float hum, float pres) {
        this.temp = temp;
        this.hum = hum;

        display();
    }

    @Override
    public void display() {
        System.out.println("CurrentCondition: " + temp + "F degrees and " + hum + "% humidity");
    }
}
