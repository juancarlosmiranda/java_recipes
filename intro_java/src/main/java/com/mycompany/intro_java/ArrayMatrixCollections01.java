
package com.mycompany.intro_java;


public class ArrayMatrixCollections01 {
        public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("Using Arrays of Integers");
        System.out.println("--------------------------------");
        
        // Example 01 --------------------------------------
        int [] myArray01;
        myArray01 = new int[20]; // initialization by default        
        myArray01[1] = 10; // load a value
        
        // show values from array
        System.out.println("Using myArray01 ->");
        for (int i=0; i < myArray01.length; i++){
            System.out.println(i+") - value = "+myArray01[i]);
        }

        // Example 02 --------------------------------------
        int myArray02 [] = {0, 1, 2, 3, 4, 5, 6, 7}; // initizalization with values        
        System.out.println("Using myArray02 ->");
        for (int i=0; i < myArray02.length; i++){
            System.out.println(i+") - value = "+myArray02[i]);
        }
        
        // Example 03 --------------------------------------
        String myStringArray01 [] = {"uno", "dos", "tres", "cuatro"};
        System.out.println("Using myStringArray01 -> size = "+myStringArray01.length);
        for (int i=0; i < myStringArray01.length; i++){
            System.out.println(i+") - value = "+myStringArray01[i]);
        }
        
        
        // linear search
        // binary search
        // bubble sort
        
        // --------------------------------------
        
        // --------------------------------------        
        
    }
}
