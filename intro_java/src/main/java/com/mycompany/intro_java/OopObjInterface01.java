/*
 * 
 * Project:
 * Author:
 * Date:
 * Description:
 * It is a mixed example that includes inheritance and polymorphism.
 * 
 * Adapted from: https://www.w3schools.com/java/java_interface.asp
 * 
 * Use:
 * 
 */

package com.mycompany.intro_java;


// Interface
interface Animal {
  public void animalSound(); // interface method (does not have a body)
  public void sleep(); // interface method (does not have a body)
}

// Interface
interface SuperHero {
  public void showStrength(); // interface method (does not have a body)
  public void fly(); // interface method (does not have a body)
  public void run();
}

// Pig "implements" the Animal interface
class Pig implements Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
  public void sleep() {
    // The body of sleep() is provided here
    System.out.println("Zzz");
  }
}

// Pig "implements" the Animal and SuperHero interface
class PigSuperHero extends Pig implements Animal, SuperHero { 
  public void showStrength() {
    System.out.println("SUPER HERO POWER -> showStrength()");
  }
  public void fly() {
    System.out.println("SUPER HERO POWER -> fly()");
  }
  public void run(){
    System.out.println("SUPER HERO POWER -> run()");
  }  
}


public class OopObjInterface01 {
    public static void main(String[] args) {
        Pig myPig = new Pig();  // Create a Pig object       
        System.out.println("myPig -> ");
        myPig.animalSound();
        myPig.sleep();
        
        
        PigSuperHero myPetHero = new PigSuperHero();        
        System.out.println("myPetHero -> ");
        myPetHero.animalSound();
        myPetHero.sleep();
        myPetHero.showStrength();
        myPetHero.fly();
        myPetHero.run();
    }
}