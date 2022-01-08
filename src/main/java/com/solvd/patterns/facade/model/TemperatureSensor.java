package com.solvd.patterns.facade.model;

public class TemperatureSensor implements Sensor {

    private String place;
    private Integer temperature;
    private SensorStatus status;

    public TemperatureSensor(String place) {
        this.place = place;
        status = SensorStatus.OFF;
    }

    @Override
    public String getValue() {
        return temperature.toString();
    }

    @Override
    public void turnOn() {
        status = SensorStatus.ON;
        System.out.println("Temperature sensor in " + place + " was on");
    }

    @Override
    public void turnOff() {
        status = SensorStatus.OFF;
        System.out.println("Temperature sensor in " + place + " was off");
    }

    @Override
    public SensorType getType() {
        return SensorType.TEMPERATURE;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
}
