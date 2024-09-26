/*
 * 
 * Project:
 * Author:
 * Date:
 * Description:
 *
 *  It is an example of encapsulation.
 * 
 * Encapsulation, an object's properties are hidden from external code.
 * External code can access to "property01" and "property02" by calling 
 * the methods "getProperty01()" and "getProperty02()". No other access is permitted.
 *
 * Use:
 * 
 */

package com.mycompany.intro_java;



class MyClass {
    private long property01;
    private String property02;
    
    public MyClass(){
        property01 = 0;
        property02 = "MY_CLASS";    
    }    
    
    public long getProperty01(){
        return property01;    
    }

    public String getProperty02(){
        return property02;
    }
    
}

public class OopObjEncapsulation01 {
        public static void main(String[] args) {
            // Object creation
            MyClass myObj = new MyClass();
            // Access properties by methods
            System.out.println(Long.toString(myObj.getProperty01()));
            System.out.println(myObj.getProperty02());
        }    
}



