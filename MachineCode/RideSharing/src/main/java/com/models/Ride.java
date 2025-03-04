package main.java.com.models;

import java.util.ArrayList;

public class Ride {
    private String source;
    private String destination;
    private ArrayList<User> riders;
    private User driver;
    private Vehicle vehicle;
    private RideStatus status;
    private static Integer counter = 0;
    private Integer id;
    private Integer availableSeats;

    public Ride(String source, String destination, User driver, Vehicle vehicle, Integer availableSeats) {
        this.source = source;
        this.destination = destination;
        this.driver = driver;
        this.vehicle = vehicle;
        this.status = RideStatus.NOT_STARTED;
        id = ++counter;
        this.availableSeats = availableSeats;
    }
    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public User getDriver() {
        return driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public RideStatus getStatus() {
        return status;
    }

    public void startTrip() {
        status = RideStatus.IN_PROGRESS;
    }

    public void endTrip() {
        status  = RideStatus.FINISHED;
    }

    public Integer getId() {
        return id;
    }

    public boolean isAvailable() {
        return status == RideStatus.NOT_STARTED;
    }

    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void reserveSeats(Integer seatsRequested) {
        availableSeats = availableSeats - seatsRequested;
    }

    public ArrayList<User> getRiders() {
        return riders;
    }

    public boolean isActive() {
        return status == RideStatus.IN_PROGRESS;
    }

    public boolean isComplete() {
        return status == RideStatus.FINISHED;
    }

}
