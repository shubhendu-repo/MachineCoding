package main.java.com.database;

import main.java.com.exceptions.DriverAlreadyExistsException;
import main.java.com.exceptions.DriverNotFoundException;
import main.java.com.exceptions.RiderAlreadyExistsException;
import main.java.com.exceptions.RiderNotFoundException;
import main.java.com.model.User;

import java.util.HashMap;

public class DriversManager {
    private HashMap<String, User> drivers;

    public DriversManager() {
        drivers = new HashMap<>();
    }

    public void addDriver(User driver) throws DriverAlreadyExistsException {
        if (drivers.containsKey(driver.getName())) {
            throw new DriverAlreadyExistsException();
        }
        drivers.put(driver.getName(),driver);
    }

    public HashMap<String, User> getRiders() {
        return drivers;
    }

    public User getDriver(String name) throws DriverNotFoundException {
        if (!drivers.containsKey(name)) {
            throw new DriverNotFoundException();
        }
        return drivers.get(name);
    }

    public boolean driverExists(String name) {
        if (drivers.containsKey(name))
            return true;
        return false;
    }

}
