/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oocminihw2;

/**
 *
 * @author sweiss
 */
public class OOCMiniHW2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create a Car object named "myCar2" with specific characteristics
        Car myCar2 = new Car(60, "Toyota", "Sedan", 5);

        // Accelerate and then brake the car
        myCar2.accelerate();
        myCar2.brake();

        // Print out the car's speed, manufacturer, and type
        System.out.println("Speed: " + myCar2.getSpeed());
        System.out.println("Manufacturer: " + myCar2.getMake());
        System.out.println("Type: " + myCar2.getType());
        System.out.println("\n");

        // Create an Airplane object named "myAirplane2" with specific characteristics
        Airplane myAirplane2 = new Airplane("Airbus", "Cargo", 50, 4, 120);

        // Print out the airplane's altitude, manufacturer, and type
        System.out.println("Altitude of the airplane: " + myAirplane2.getAltitude());
        System.out.println("Manufacturer: " + myAirplane2.getMake());
        System.out.println("Type: " + myAirplane2.getType());

        // Change the altitude, accelerate, and get the number of passengers
        myAirplane2.changeAltitude();
        myAirplane2.accelerate();
        myAirplane2.getNumberOfPassengers();
        System.out.println("\n");

        // Create a Boat object named "myBoat2" with specific characteristics
        Boat myBoat2 = new Boat(15, "Sea Voyager", "Motorboat", 6);

        // Hoist the sail of the boat
        myBoat2.hoistSail();

        // Print out the boat's speed, manufacturer, and whether the sail is hoisted
        System.out.println("Speed: " + myBoat2.getSpeed());
        System.out.println("Manufacturer: " + myBoat2.getMake());
        System.out.println("Sail Hoisted: " + myBoat2.isSailHoisted());

        // Lower the sail of the boat
        myBoat2.lowerSail();
    }

}