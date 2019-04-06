package E20SensorsAndTemperatureMeasurement;

public class ConstantSensor implements Sensor {

    private final boolean state;
    private int value;

    public ConstantSensor(int value){
        this.value = value;
        this.state = true;
    }

    @Override
    public boolean isOn() {
        return state;
    }

    @Override
    public void on() {
        //Constant sensor is always on.
    }

    @Override
    public void off() {
        //Constant sensor is always on.
    }

    @Override
    public int measure() {
        return value;
    }
}
