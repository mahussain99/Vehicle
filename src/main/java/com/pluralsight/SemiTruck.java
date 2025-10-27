package com.pluralsight;

public class SemiTruck extends Vehicle {
    private int numberOfTrailers;

    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }

    public void loadCargo(){
        System.out.println (getCargoCapacity() + "Can load you cargo");
    }
    public void unloadCargo(){
        System.out.println("Can unload your cargo");

    }
}
