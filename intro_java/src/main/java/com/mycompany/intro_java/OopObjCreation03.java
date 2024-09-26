/*
 * 
 * Project:
 * Author:
 * Date:
 * Description:
 *
 * This code shows how to create a class that implements two constructors. 
 * These are overloaded methods.
 * 
 * Use:
 * 
 */
package com.mycompany.intro_java;


class CreatingNewClass {
    private long ctr;
    public CreatingNewClass(){
        System.out.println("Contructor without parameters");
        this.ctr = 0;
    }

    public CreatingNewClass(long initCtr){
        // overloaded method
        System.out.println("Contructor overloaded with parametros");
        this.ctr = initCtr;
    }    
    
}


public class OopObjCreation03 {

    public static void main(String[] args) {
        System.out.println("Init in main class");
        CreatingNewClass obj01 = new CreatingNewClass();
        CreatingNewClass obj02 = new CreatingNewClass(1); 
    }
}