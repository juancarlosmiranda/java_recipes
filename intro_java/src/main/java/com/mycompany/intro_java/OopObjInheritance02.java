/*
 * 
 * Project:
 * Author:
 * Date:
 * Description:
 * It is a mixed example that includes inheritance and polymorphism.
 * 
 * Adapted from: https://openwebinars.net/blog/introduccion-a-poo-en-java-herencia-y-polimorfismo/##qu%C3%A9-es-el-polimorfismo-en-java
 * 
 * Use:
 * 
 */


package com.mycompany.intro_java;

/* 
* Inheritance is applied during class definition. All classes inherit properties
* from Vehicle.
*/

class Vehicle {
    public void move() {
        System.out.println("The vehicle is moving.");
    }
}

class CarN extends Vehicle {
    public void move() {
        System.out.println("The car is moving along the road.");
    }
}

class Bicycle extends Vehicle {
    public void move() {
        System.out.println("The bicycle is moving along the lane.");
    }
}

class Tricycle extends Vehicle {
    public void move() {
        System.out.println("The tricycle is moving along the lane.");
    }
}

public class OopObjInheritance02 {
    public static void main(String[] args) {
        // -------------------------------------------------
        // Polymorphism Example 01 - defining new objects
        // --------------------------------------------------
        Vehicle myVehicle = new CarN();
        myVehicle.move();  // Calling to the CarN

        myVehicle = new Bicycle();
        myVehicle.move();  // Calling the Bicycle
                
        // -------------------------------------------------
        // Polymorphism Example 02 - Iterating over an array
        // --------------------------------------------------
        // Applying polymorphism. Subclass assigned to superclass variable.
        Vehicle[] vehicleArray = new Vehicle[3]; // creating an array
        vehicleArray[0] = new CarN();
        vehicleArray[1] = new Bicycle();
        vehicleArray[2] = new Tricycle();
        
        System.out.println("-----------------------");
        System.out.println("Iterating over an array");
        for (Vehicle vehicle : vehicleArray) {
            // We can call the same method on objects of different classes.
            vehicle.move();
        }
        // ---------------------------------        
    }
}