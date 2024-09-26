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

public class ControlFlowClass01 {

    public static void main(String[] args) {
        // built-in types
        int testValue = 100;
        int limit = 90;

        // --------------------------------------------------------------------
        // if-else statement
        // --------------------------------------------------------------------
        if (testValue < limit) {
            System.out.println("testValue < limit");
        } else {
            System.out.println("Maybe ... testValue >= limit");
            if (testValue == limit) {
                System.out.println("testValue == limit");
            } else {
                System.out.println("testValue > limit");
            }
        }

        // --------------------------------------------------------------------
        // if-else if statement        
        // --------------------------------------------------------------------
        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
        
        // --------------------------------------------------------------------
        // switch statement
        // --------------------------------------------------------------------
        String message = null;
        int optionSwitch = 5;

        switch (optionSwitch){
            case 0: message = "Option 0";
                    break;
            case 1: message = "Option 1";
                    break;
            case 2: message = "Option 2";
                    break;
            case 3: message = "Option 3";
                    break;
            case 4: message = "Option 4";
                    break;
            default: message = "Option DEFAULT"; 
                    break;                
        }
        
        System.out.println("After switch --> optionSwitch=" + optionSwitch);
        System.out.println("After switch --> message=" + message);
    }
}
