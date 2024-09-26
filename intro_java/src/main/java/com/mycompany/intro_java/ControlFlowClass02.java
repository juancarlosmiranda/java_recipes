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


public class ControlFlowClass02 {

    public static void main(String[] args) {        
        
        // --------------------------------------------------------------------
        // while statement
        // while sentence evaluates the expression at the top
        // --------------------------------------------------------------------
        int countWhile = 1;
        int limitWhile = 10;
        
        while (countWhile < limitWhile){
            System.out.println("WHILE -> countWhile = " + countWhile);
            countWhile++;
        }
        
        System.out.println("AFTER WHILE -> countWhile = " + countWhile);
        System.out.println(" " );
        
        // --------------------------------------------------------------------
        // do .. while statement
        // do ..while sentence evaluates the expression at the bottom
        // --------------------------------------------------------------------
        int countDoWhile = 1;
        int limitDoWhile = 10;
        
        do{
            System.out.println("DO .. WHILE -> countDoWhile = " + countDoWhile);
            countDoWhile++;
        } while(countDoWhile < limitDoWhile);
        
        System.out.println("AFTER DO .. WHILE -> countDoWhile = " + countDoWhile);
        System.out.println(" " );
        
        // --------------------------------------------------------------------
        // for statement
        // --------------------------------------------------------------------
        int countFor = 1;
        int limitFor = 10;
        
        for (countFor = 1; countFor < limitFor; countFor++){
            System.out.println("FOR -> countFor = " + countFor);
        }
        
        System.out.println("AFTER FOR -> countDoWhile = " + countFor);
        System.out.println(" " );
    }
}
