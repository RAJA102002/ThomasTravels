package com;

import java.util.ArrayList;

public class Travel {

    // 1. Check if Car Driver
    public boolean isCarDriver(Driver driver) {
        if (driver.getCategory().equalsIgnoreCase("Car")) {
            return true;
        }
        return false;
    }

    // 2. Retrieve by Driver Id
    public String RetrivebyDriverId(ArrayList<Driver> list, int driverID) {
        for (Driver d : list) {
            if (d.getDriverId() == driverID) {
                return "Driver name is " + d.getDriverName() +
                        " belonging to the category " + d.getCategory() +
                        " traveled " + d.getTotalDistance() + " KM so far.";
            }
        }
        return "Driver not found";
    }

    // 3. Retrieve Count Of Driver by Category
    public int RetriveCountOfDriver(ArrayList<Driver> list, String category) {
        int count = 0;
        for (Driver d : list) {
            if (d.getCategory().equalsIgnoreCase(category)) {
                count++;
            }
        }
        return count;
    }

    // 4. Retrieve Drivers by Category
    public ArrayList<Driver> retriveDriver(ArrayList<Driver> list, String category) {
        ArrayList<Driver> result = new ArrayList<>();

        for (Driver d : list) {
            if (d.getCategory().equalsIgnoreCase(category)) {
                result.add(d);
            }
        }
        return result;
    }

    // 5. Retrieve Maximum Distance Travelled Driver
    public Driver RetriveMaximumDistanceTravelledDriver(ArrayList<Driver> list) {

        if (list.isEmpty()) {
            return null;
        }

        Driver maxDriver = list.get(0);

        for (Driver d : list) {
            if (d.getTotalDistance() > maxDriver.getTotalDistance()) {
                maxDriver = d;
            }
        }
        return maxDriver;
    }
}