/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author hrfre
 */
// Airplane.java (Abstract class that extends Vehicle and implements Transport)
public class Airplane extends Vehicle implements Flyable {

    private int currentAltitude;

    // Constructor method to initialize the Airplane object
    public Airplane(String make, String type, int numPassengers, int numOfWings, int altitude) {
        // Setting the provided parameters
        this.make = make;
        this.type = type;
        this.numPassengers = numPassengers;
        this.numWings = 0;
        this.currentAltitude = altitude;
    }

    // Implementing the methods from the Flyable interface
    @Override
    public void changeAltitude() {
        this.currentAltitude += 100;
        System.out.println("The plane is gaining altitude. Altitude: " + currentAltitude);
    }

    @Override
    public float getAltitude() {
        return currentAltitude;
    }

    @Override
    public void accelerate() {
        System.out.println("Airplane is accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Airplane is braking.");
    }

    @Override
    public float getSpeed() {
        return speed;
    }

    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getType() {
        return type;
    }

    // @Override
    public int getNumberOfPassengers() {
        System.out.println("The airplane has " + numPassengers + " passengers aboard.");
        return numPassengers;
    }

    // Custom method for Airplane class
    public void autoPilotMode() {
        System.out.println("Airplane is in auto-pilot mode.");
    }
}