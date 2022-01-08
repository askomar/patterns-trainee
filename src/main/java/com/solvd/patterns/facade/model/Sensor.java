package com.solvd.patterns.facade.model;

public interface Sensor {

    String getValue();

    void turnOn();

    void turnOff();

    SensorType getType();

    String getPlace();

    void setPlace(String place);
}
