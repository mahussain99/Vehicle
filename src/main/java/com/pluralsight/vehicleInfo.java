package com.pluralsight;

public class vehicleInfo {
    public static void main(String[] args) {

        Moped slowRide = new Moped();
        slowRide.setColor("Black");
        slowRide.setMaxWeight(500);
        slowRide.setModel("MAH99");

        System.out.println( slowRide.getColor());
        System.out.println("=======================");

        Car car = new Car();
        car.setColor("Blue");
        car.setNumberOfDoor(4);
        car.setModel("4Runner");
        System.out.println(car.getModel());


        SemiTruck semiTruck = new SemiTruck();
        semiTruck.setFuelCapacity(25);
        semiTruck.setNumberOfPassengers(5);
        semiTruck.setModel("F-250");
        System.out.println(semiTruck.getNumberOfPassengers());

        System.out.println("=============================");

        HoverCraft hoverCraft = new HoverCraft();
        hoverCraft.setAirCushionPressure (5);
        System.out.println(hoverCraft.getAirCushionPressure());



    }
}
