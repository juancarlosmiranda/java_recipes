
package com.mycompany.intro_java;


public class ArrayMatrixCollections02 {
        public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("Using Arrays of Integers");
        System.out.println("--------------------------------");
        
        // Example 01 --------------------------------------
        int [][] myMatrix01 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        myMatrix01 [1][1] = 10; // load an integer value into a matrix
        
        int [][] myMatrix02 = new int [3][3]; // loading default values
        
        // show values from matrix
        System.out.println("Using myMatrix01 ->");
        for (int i=0; i < myMatrix01.length; i++){
            for (int j=0; j < myMatrix01.length; j++){
                System.out.print("["+ i +"] ["+ j + "] = "+myMatrix01[i][j]);
            }
            System.out.println("|");
        }
        // --------------------------------------

        // show values from matrix
        System.out.println("Using myMatrix02 ->");
        for (int i=0; i < myMatrix02.length; i++){
            for (int j=0; j < myMatrix02.length; j++){
                System.out.println("["+ i +"] ["+ j + "] -> value = "+myMatrix02[i][j]);
            } 
        }
        // --------------------------------------        
        
    }
}
