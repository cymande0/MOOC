package E20SensorsAndTemperatureMeasurement;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Integer> sensorsTemperature = new ArrayList<>();
    private List<Sensor> allSensors;
    private Sensor sensor;
    private boolean state = false;


    public AverageSensor(){
        allSensors = new ArrayList<>();
    }

    public void addSensor(Sensor additionalSensor){
        allSensors.add(additionalSensor);
    }

    @Override
    public boolean isOn() {
        boolean isAllOn = false;
        for(Sensor sensor : allSensors){ //check if all sensors are on
            if(sensor.isOn()) {
                isAllOn = true;
            }
            else {
                isAllOn = false;
                break;
            }
        }
        return (isAllOn) ? true : false;
    }

    @Override
    public void on(){
        for(Sensor sensor: allSensors){
            sensor.on();
        }
    }

    @Override
    public void off() {
        for(Sensor sensor: allSensors){
            sensor.off();
        }
    }

    @Override
    public int measure() {
        int amount = sensorsAmount();
        int sum = 0;

        if(state == true || sensorsAmount() <= 0){
            throw new IllegalStateException("Please turn off sensor or add given sensor to average sensor.");
        }
        for(Sensor sensor: allSensors){
            sum += sensor.measure();
        }
        sensorsTemperature.add(sum / amount);
        return sum / amount;
    }

    public int sensorsAmount(){
        return allSensors.size();
    }

    public List<Integer> readings(){
        return this.sensorsTemperature;
    }
}
