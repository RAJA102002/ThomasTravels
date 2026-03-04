package com;

public class Driver {
    
    private int driverId;
    private String driverName;
    private String category;
    private double totalDistance;

    // Constructor
    public Driver(int driverId, String driverName, String category, double totalDistance) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.category = category;
        this.totalDistance = totalDistance;
    }

    // Getters
    public int getDriverId() {
        return driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getCategory() {
        return category;
    }

    public double getTotalDistance() {
        return totalDistance;
    }
}