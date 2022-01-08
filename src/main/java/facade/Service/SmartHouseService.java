package facade.Service;

import facade.model.Sensor;

import java.util.List;

public class SmartHouseService {

    private final List<Sensor> sensors;

    public SmartHouseService(List<Sensor> sensors) {
        this.sensors = sensors;
    }

    public void turnSensorsOn() {
        sensors.forEach(Sensor::turnOn);
    }

    public void turnSensorsOff() {
        sensors.forEach(Sensor::turnOff);
    }
}
