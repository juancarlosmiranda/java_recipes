/*
 * 
 * Project:
 * Author:
 * Date:
 * Description:
 * This code shows two examples of polymorphism:
 *      Method overriding.
 *      Method overloading.
 * 
 * 
 * Use:
 * 
 */


package com.mycompany.intro_java;

/* 
* Inheritance is applied during class definition. All classes inherit properties
* from Vehicle.
*/

class Book {
    public void display() {
        System.out.println("Book - display()");
    }
}

class AudioBook extends Book {
    private int position;
    
    @Override
    public void display() {
        System.out.println("AudioBook - Override display() position = " + position);
    }    
}

class PaperBook extends Book {
    private int currentPage;
    
    public void pageForward() {
        System.out.println("PaperBook - pageForward() + 1 page");
        currentPage++;
    }

    public void pageForward(int stepsm) {
        System.out.println("PaperBook - Overload pageForward() steps = " + stepsm);
        currentPage = currentPage + stepsm;
    }
    
    public void pageDown() {
        System.out.println("PaperBook - pageDown()");
        currentPage++;
    }
}


public class OopObjPolymorphism01 {
    public static void main(String[] args) {
        // -------------------------------------------------
        // Polymorphism Example 01 - Override
        // --------------------------------------------------
        Book myBook = new Book();
        myBook.display();        
        
        AudioBook myAudioBook = new AudioBook();
        myAudioBook.display();
        
        // -------------------------------------------------
        // Polymorphism Example 02 - Overloading
        // --------------------------------------------------
        PaperBook myPaperBook = new PaperBook();
        myPaperBook.pageForward(); // forward 1 step
        myPaperBook.pageForward(2); // forward with steps, overload method
        
        // ---------------------------------        
    }
}