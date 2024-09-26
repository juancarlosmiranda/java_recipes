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


public class ErrorManagement02 {
    
    public static void demoMethod() throws ArithmeticException{
        System.out.println("Testing demoMethod() ->");
        // condition to launch a specific Exception
        throw new ArithmeticException("NADA");
    }
   
    public static void main(String[] args) {
        
        try{
            demoMethod();
        } catch(Exception e){
            System.out.println("I catched and error ->" + e.getMessage());
            System.out.println("I catched and error ->" + e);
            
        } finally {
            System.out.println("I always walk around here");
        }
        
    }
}
