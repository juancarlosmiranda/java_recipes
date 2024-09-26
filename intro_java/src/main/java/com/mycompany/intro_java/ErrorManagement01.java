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

public class ErrorManagement01 {

    public static void main(String[] args) {
        // scanner definition, user input
        Scanner sc01 = new Scanner(System.in); // used for number data
        Scanner sc02 = new Scanner(System.in); // used for string data
        
        // built-in types
        int dividend01 = 1234;
        int divisor01 = 1234;
        
        double quotient01 = 1.0;
        double reminder01 = 1.0;
        
        
        // user input by keyboard
        System.out.print("Dividendo (eg. 01234):");
        dividend01 = sc01.nextInt();

        System.out.print("Divisor (eg. 01234):");
        divisor01 = sc01.nextInt();
        
        try{
            quotient01 = dividend01 / divisor01;
            reminder01 = dividend01 % divisor01;
        } catch(Exception e){
            System.out.println("I catched and error ->" + e.getMessage());
            System.out.println("I catched and error ->" + e);
            
        } finally {
            System.out.println("I always walk around here");
        }
        
        // closing Scanner objects
        sc01.close();
        sc02.close();

        // display results on the screen
        System.out.println("------------------------------");        
        System.out.println("Display results on the Screen");
        System.out.println("------------------------------");
        System.out.println("Quotient =" + quotient01);
        System.out.println("Reminder =" + reminder01);
    }
}
