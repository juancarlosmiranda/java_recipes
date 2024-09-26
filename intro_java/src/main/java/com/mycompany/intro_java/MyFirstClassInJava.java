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
// it is another package
import com.mycompany.intro_java.newpackage.NewClass;

public class MyFirstClassInJava {

    public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("It is my first programm in Java!");
        System.out.println("--------------------------------");
        // calling an static method from other package
        NewClass.method01();
    }
}
