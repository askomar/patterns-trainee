package com.solvd.patterns.facade;

import com.solvd.patterns.facade.Service.SmartHouseService;
import com.solvd.patterns.facade.model.Sensor;
import com.solvd.patterns.facade.model.TemperatureSensor;

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
