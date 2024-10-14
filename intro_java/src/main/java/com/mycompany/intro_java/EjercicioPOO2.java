/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intro_java;


abstract class Mamiferos{
    abstract void run();
    abstract void sleep();
    abstract void walk();
    abstract void animalSound();
}

class Girafa extends Mamiferos
{
    public void run()
    {
        System.out.println("La girafa esta corriendo a 30 km/h!!!!!");
    }
    public void sleep()
    {
        System.out.println("La girafa esta durmiendo <Zzz> ");
    }

    public void walk()
    {
        System.out.println("La girafa esta tranquila y caminando por Capiata misteriosamente!");
    }

    public void animalSound()
    {
        System.out.println("El sonido de la girafa es AAAAAAAAAAA");
    }
}

class Elefante extends Mamiferos
{
    public void run()
    {
        System.out.println("El Elefante esta corriendo a 50 km/h!!!!!");
    }

    public void sleep()
    {
        System.out.println("El elefante esta durmiendo <Zzz> ");
    }

    public void walk()
    {
        System.out.println("El Elefante  esta tranquilo y caminando por Carapegua extravagantemente!");
    }

    public void animalSound()
    {
        System.out.println("El sonido del elefante es HUUUUUUUUUUU");
    }

}

class Gato extends Mamiferos
{

    public void run()
    {
        System.out.println("El gato esta corriendo a 70 km/h!!!!!");
    }

    public void sleep()
    {
        System.out.println("El gato esta durmiendo <Zzz> ");
    }

    public void walk()
    {
        System.out.println("El Gato esta tranquilo y caminando por Encarnacion vagamente!");
    }

    public void animalSound()
    {
        System.out.println("El sonido del gato es MMMMMMIIIIAAAAAAAUUUUUUU");
    }

}

class Perro extends Mamiferos
{
    public void run()
    {
        System.out.println("El perro esta corriendo a 90 km/h!!!!!");
    }
 
    public void sleep()
    {
        System.out.println("El perro esta durmiendo <Zzz> ");
    }
 
    public void walk()
    {
        System.out.println("El Perro esta tranquilo y caminando por Ciudad del Este con ganas de comprar algo!");
    }

    public void animalSound()
    {
        System.out.println("El sonido del perro es WAU WAU WAU WAU");
    }

}

public class EjercicioPOO2 {
    public static void main(String[] args) {
        // crea la clase girafa
        Girafa girafa = new Girafa();
        girafa.animalSound();
        girafa.sleep();
        girafa.run();
        girafa.walk();
        
        System.out.println("---------------------------");
        Elefante elefante = new Elefante();
        elefante.animalSound();
        elefante.sleep();
        elefante.run();
        elefante.walk();
        
        System.out.println("---------------------------");
        Gato gato = new Gato();
        gato.animalSound();
        gato.sleep();
        gato.run();
        gato.walk();
        
        System.out.println("---------------------------");
        Perro perro = new Perro();
        perro.animalSound();
        perro.sleep();
        perro.run();
        perro.walk();
    }
    
}