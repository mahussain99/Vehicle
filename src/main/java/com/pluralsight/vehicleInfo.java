package com.pluralsight;

public class vehicleInfo {
    public static void main(String[] args) {
        Moped slowRide = new Moped( "MAH", " Black", 150,5,2, 2, 150);
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        System.out.println("=================================================================================================");

        SemiTruck semiTruck = new SemiTruck("MAH99", " Red", 200,2,5, 2);
        semiTruck.setNumberOfTrailers(2);
        semiTruck.setFuelCapacity(100);

        System.out.println("=================================================================================================");

        HoverCraft hoverCraft = new HoverCraft("MAH100", " Yellow", 100,5,50,  150);
        hoverCraft.setAirCushionPressure(50);
        hoverCraft.setColor("Blue");
        System.out.println("=================================================================================================");


        Car car = new Car("MAH101", " Black & Black", 200,25,5, 0);
        car.setNumberOfDoors(4);
        car.setTopSpeed(200);
        System.out.println("=================================================================================================");


        // Test the functionality of the classes and methods
        slowRide.ride();
        semiTruck.loadCargo();
        hoverCraft.hover();
        car.openTrunk();

        System.out.println("=================================================================================================");


        // Accessing Vehicle getters
        System.out.println("Color of the Moped: " + slowRide.getColor());
        System.out.println("Fuel capacity of the SemiTruck: " + semiTruck.getFuelCapacity());
        System.out.println("Air cushion pressure of the HoverCraft: " + hoverCraft.getAirCushionPressure());
        System.out.println("Top speed of the Car: " + car.getTopSpeed());

        System.out.println("=================================================================================================");


        //

        System.out.println(slowRide);
        System.out.println(semiTruck);
        System.out.println(hoverCraft);
        System.out.println(car);
    }
}