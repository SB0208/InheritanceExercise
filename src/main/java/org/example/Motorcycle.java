package org.example;

public class Motorcycle extends Vehicle {



    public boolean hasTwoTires = true;

    public Motorcycle() {
        super();
    }
    public Motorcycle(String make, String model, int year) {
        super(make, model, year);

    }

    public Motorcycle(String manufacturer, String model, int year, boolean hasTwoTires) {
        super(manufacturer, model, year);
        this.hasTwoTires = hasTwoTires;
    }

    public Motorcycle(boolean hasTwoTires) {
        this.hasTwoTires = hasTwoTires;
    }

    public Motorcycle(String kawasaki, String aNew, int i, int i1, boolean b) {
        super(kawasaki, aNew, i);
        this.hasTwoTires = b;

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
    public int getYear() {
        return super.getYear();
    }

    @Override
    public void setModel(String model) {
        super.setModel(model);
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
        return "Motorcycle{" +
                "hasTwoTires=" + hasTwoTires +
                "} " + super.toString();
    }
}

