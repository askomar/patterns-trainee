package facade;

import facade.Service.SmartHouseService;
import facade.model.Sensor;
import facade.model.TemperatureSensor;

import java.util.List;

/**
 * Паттерн фасад нужен, когда при тестировании нам нужно скрыть множество мелких действий, при этом
 * предоставить удобный интерфейс
 */
public class Main {
    public static void main(String[] args) {
        List<Sensor> homeSensors = List.of(
                new TemperatureSensor("Kitchen"),
                new TemperatureSensor("Room 1")
        );

        SmartHouseService smartHouseService = new SmartHouseService(homeSensors);
        smartHouseService.turnSensorsOn();
        smartHouseService.turnSensorsOff();
    }
}
