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

public class UserOutputClass {

    public static void main(String[] args) {       
        // built-in types
        int intNumber = 1234;
        double doubleNumber = 12345.123456;
        boolean booleanValue = true;
        char charData = 'a';
        String stringData = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";

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
        System.out.printf("Displays integer 10 places = | %14d |", intNumber);
        System.out.println("");
        System.out.printf("Displays double 10 places  = | %14.2f |", doubleNumber);
        System.out.println("");
        System.out.printf("Displays double 03 places  = | %3.3f |", doubleNumber);
        System.out.println("");
        System.out.printf("String data original  = | %s |", stringData);
        System.out.println("");
        System.out.printf("String data 10 places = | %.10s |", stringData);
        System.out.println("");
        System.out.printf("String data 05 places = | %.5s |", stringData);        
        
    }
}
