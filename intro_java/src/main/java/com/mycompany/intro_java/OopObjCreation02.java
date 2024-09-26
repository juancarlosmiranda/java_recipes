/*
 * 
 * Project:
 * Author:
 * Date:
 * Description:
 *  Define and create instances. This code shows how to create a class called 
 * "Trivial02".
 *  Extends implementing getters and setters methods.
 * 
 * Example taken from Java Programming for the New Generation of Mobile Devices 
 * Programming Android.
 * 
 * Use:
 * 
 */

package com.mycompany.intro_java;
class Trivial02 {
    private long ctr; // hidden property
    
    public Trivial02(){
        System.out.println("Trivial 02 - Constructor");
        ctr = 0;    
    }
    
    public void incr(){
        System.out.println("Trivial 02 - incr()");
        ctr++;
    }
    
    public long getIncr(){
        System.out.println("Trivial 02 - getIncr()");
        return ctr;    
    }
    
    public void setIncr(long ctrp){
        System.out.println("Trivial 02 - setIncr(long ctrp)");
        ctr = ctrp;
    }
    
    @Override
    /* 
    * Overwrites the original method inherited from Objects (it is an standard 
    * class) with a new method in this class.
    */
    public String toString(){
        return Long.toString(ctr);
    }
}


public class OopObjCreation02 {
        public static void main(String[] args) {
            Trivial02 trivial = new Trivial02(); // Object creation
            
            trivial.setIncr(2); //set value = 2            
            System.out.println(trivial.getIncr());
            
            trivial.incr(); // increment private value in 1
            System.out.println(trivial.getIncr());
            
            trivial.incr();
                        
            System.out.println(trivial.toString()); // String convertion
        }    
}