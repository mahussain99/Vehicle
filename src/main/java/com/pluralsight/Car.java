package com.pluralsight;

public class Car extends Vehicle {
    private int numberOfDoor;

    public int getNumberOfDoor() {
        return numberOfDoor;
    }

    public void setNumberOfDoor(int numberOfDoor) {
        this.numberOfDoor = numberOfDoor;
    }
    public void openTruck(){
        System.out.println ("Can you open your truck please ");
    }
    public void closeTrunk(){
        System.out.println("Can you close your truck please");
    }
}
