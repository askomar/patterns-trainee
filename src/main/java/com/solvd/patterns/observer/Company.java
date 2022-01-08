package com.solvd.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Company implements Observable {

    protected List<Observer> employees;
    protected String information;

    public Company() {
        this.employees = new ArrayList<>();
    }

    public List<Observer> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Observer> employees) {
        this.employees = employees;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    @Override
    public void registerObserver(Observer o) {
        employees.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        employees.remove(o);
    }

    @Override
    public void notifyObservers() {
        employees.forEach(employee -> employee.update(this, information));
    }
}
