package com;

import java.util.ArrayList;

public class TestDriver {

    public static void main(String[] args) {

        ArrayList<Driver> list = new ArrayList<>();

        list.add(new Driver(1, "Sudhagar", "Car", 4200));
        list.add(new Driver(2, "Ramesh", "Auto", 2500));
        list.add(new Driver(3, "Suresh", "Lorry", 8000));
        list.add(new Driver(4, "Mahesh", "Car", 6000));

        Travel travel = new Travel();

        // Test isCarDriver
        System.out.println(travel.isCarDriver(list.get(0)));

        // Test retrieve by id
        System.out.println(travel.RetrivebyDriverId(list, 1));

        // Test count by category
        System.out.println("Car Drivers Count: " +
                travel.RetriveCountOfDriver(list, "Car"));

        // Test retrieve by category
        ArrayList<Driver> carDrivers =
                travel.retriveDriver(list, "Car");

        for (Driver d : carDrivers) {
            System.out.println(d.getDriverName());
        }

        // Test max distance driver
        Driver max = travel.RetriveMaximumDistanceTravelledDriver(list);

        if (max != null) {
            System.out.println("Maximum Distance Travelled by: "
                    + max.getDriverName());
        }
    }
}