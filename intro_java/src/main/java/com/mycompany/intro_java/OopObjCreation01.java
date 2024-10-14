/*
 * 
 * Project:
 * Author:
 * Date:
 * Description:
 *  Define and create instances. This code shows how to create a class called 
 * "Trivial01".
 * 
 * Example taken from Java Programming for the New Generation of Mobile Devices 
 * Programming Android.
 * 
 * Use:
 * 
 */



package com.mycompany.intro_java;

/* 
* Encapsulation, the ctr property is hidden from external code.
* External code can access to the ctr property by calling getIncr() method.
*/

class Trivial01 {
    private long ctr; // hidden property
    private long otherP;
    
    public void incr(){
        ctr++;
    }
    
    public long getIncr(){
        return ctr;    
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

public class OopObjCreation01 {
        public static void main(String[] args) {
            Trivial01 trivial = new Trivial01(); // Object creation
            System.out.println(trivial.getIncr());
            //System.out.println(trivial.otherP);
            
        }  
}



