/*
 * 
 * Project:
 * Author:
 * Date:
 * Description:
 *  This code shows class inheritance. The class "Car" is extended by the "Ragtop" class.
 * 
 * Example taken from Java Programming for the New Generation of Mobile Devices 
 * Programming Android.
 * 
 * Use:
 * 
 */


package com.mycompany.intro_java;

class Car {
    private long odometer;
    
    public Car(){
        // contructor definition
        System.out.println("Car - Constructor...");
        odometer = 0;
    }
    
    public void drive(){
        System.out.println("Car - Driving...");
        odometer++;
    }
    
    public long getOdo(){
        return odometer;
    }
    
    @Override
    // Overwrite the original method inherited from Objects with a new method in this class
    public String toString(){
        return Long.toString(odometer);
    }
}

// inheritance here using extend
class Ragtop extends Car{
    @Override
    public void drive(){
        // new implementation of an inherited method
        super.drive();
        System.out.println("Ragtop - Driving...");
    }

}

public class OopObjInheritance01{
        public static void main(String[] args) {
            Car auto = new Car();
            System.out.println(auto.getClass().getName());
            auto.drive();
            System.out.println("Odometer=" + auto.getOdo());
            System.out.println("A-KM = " + auto.toString());

            
            Ragtop ragtop = new Ragtop();
            System.out.println(ragtop.getClass().getName());
            ragtop.drive();
            System.out.println("Odometer=" + ragtop.getOdo()); // inherited method
            System.out.println("R-KM = " + ragtop.toString());
           
            Car autoX = (Car)new Ragtop(); // Ragtop is a subclass, can be converted to superclass
            System.out.println(autoX.getClass().getName());
            autoX.drive();
            System.out.println("Odometer=" + autoX.getOdo()); // inherited method
            System.out.println("R-KM = " + autoX.toString());
        }    
}



