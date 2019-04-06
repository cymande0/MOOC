package E20SensorsAndTemperatureMeasurement;

import java.util.Random;

public class Thermometer implements Sensor {

    private Random random = new Random();
    private boolean state;
    private int value;

    public Thermometer(){
        this.state = false;
    }

    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void on() {
        this.state = true;
    }

    @Override
    public void off() {
        this.state = false;
    }

    @Override
    public int measure() {
        if(state == true) {
            return drawTemperature();
        }
        else {
            throw new IllegalStateException("Thermometer is disabled. Please turn on it.");
        }
    }

    private int drawTemperature(){
        return random.nextInt(30 + 1 + 10) - 10; // -30 30
    }
}
