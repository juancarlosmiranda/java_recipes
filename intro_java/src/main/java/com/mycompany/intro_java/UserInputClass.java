/*
 * 
 * Project:
 * Author:
 * Date:
 * Description:
 *  A first class template in Java.
 * 
 * Use:
 * 
 */
package com.mycompany.intro_java;

import java.util.Scanner;

public class UserInputClass {

    public static void main(String[] args) {
        // scanner definition, user input
        Scanner sc01 = new Scanner(System.in); // used for number data
        Scanner sc02 = new Scanner(System.in); // used for string data
        
        // built-in types
        int intNumber = 1234;
        double doubleNumber = 1.1;
        boolean booleanValue = true;
        char charData = 'a';
        String stringData = "String";

        // user input by keyboard
        System.out.print("Enter an integer number (eg. 1234):");
        intNumber = sc01.nextInt();

        System.out.print("Enter a double number (eg. 1.15):");
        doubleNumber = sc01.nextDouble();

        System.out.print("Enter a string data: ");

        stringData = sc02.nextLine();

        // closing Scanner objects
        sc01.close();
        sc02.close();

        // display results on the screen
        System.out.println("------------------------------");        
        System.out.println("Display results on the Screen");
        System.out.println("------------------------------");
        System.out.println("Display intergers " + intNumber);
        System.out.println("Display intergers " + doubleNumber);        
        System.out.println("A NEW STRING: " + stringData);

        System.out.println("------------------------------");        
        System.out.println("Formatted printing");
        System.out.println("------------------------------");        
        System.out.println("Displays interger 10 places= %14d |" + intNumber);
        
        

        
    }
}
