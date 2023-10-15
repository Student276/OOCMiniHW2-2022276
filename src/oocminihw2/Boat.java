/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author hrfre
 */
// Boat.java (Abstract class that extends Vehicle and implements Transport)
public class Boat extends Vehicle implements Sailable {

    private boolean sailHoisted;

    // Constructor method to initialize the Boat object
    public Boat(float speed, String make, String type, int numPassengers) {
        // Setting the provided parameters
        this.speed = speed;
        this.make = make;
        this.type = type;
        this.numPassengers = numPassengers;
        this.numSails = 1;
        this.sailHoisted = false;
    }

    // Overriding the methods from a superclass
    @Override
    public void accelerate() {
        this.speed += speed;
    }

    @Override
    public void brake() {
        this.speed = 0;
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

    // Implementing the methods from the Sailable interface
    @Override
    public void hoistSail() {
        if (!sailHoisted) {
            sailHoisted = true;
            System.out.println("Sail hoisted.");
        } else {
            System.out.println("Sail is already hoisted.");
        }
    }

    @Override
    public void lowerSail() {
        if (sailHoisted) {
            sailHoisted = false;
            System.out.println("Sail lowered.");
        } else {
            System.out.println("Sail is already lowered.");
        }
    }

    @Override
    public boolean isSailHoisted() {
        return sailHoisted;
    }

    // Custom method for the Boat class
    public void dropAnchor() {
        System.out.println("Anchor dropped. The boat is anchored.");
    }
}