package org.example;

public class Car extends Vehicle {

public int numberOfDoors;

    public Car(String manufacturer, String model, int year) {
        super(manufacturer, model, year);
    }

public int getNumberOfDoors() {
        return numberOfDoors;
}
public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
}

    public Car(String manufacturer, String model, int year, int numberOfDoors) {
        super(manufacturer, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getManufacturer() {
        return super.getManufacturer();
    }

    @Override
    public void setManufacturer(String manufacturer) {
        super.setManufacturer(manufacturer);
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                "} " + super.toString();
    }
}
