package com.pluralsight;

public class HoverCraft extends Vehicle {
    private int airCushionPressure;

    public HoverCraft(String model, String color, int topSpeed, int fuelCapacity, int numberOfPassengers,
                      int cargoCapacity) {
        super(model, color, topSpeed, fuelCapacity, numberOfPassengers, cargoCapacity);
    }

    public int getAirCushionPressure() {
        return airCushionPressure;
    }

    public void setAirCushionPressure(int airCushionPressure) {
        this.airCushionPressure = airCushionPressure;
    }

    public void hover() {
        System.out.println("Hovercraft is hovering.");
    }
}