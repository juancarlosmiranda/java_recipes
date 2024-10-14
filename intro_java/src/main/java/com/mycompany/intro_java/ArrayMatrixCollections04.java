
package com.mycompany.intro_java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayMatrixCollections04 {
    public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("import java.util.ArrayList;");
        System.out.println("--------------------------------");

        // Example 01 ---------------------------
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Apple");
        myList.add("Orange");
        myList.add("Tomatoe");
        myList.add("Potato");
        

        //Iterator it = myList.iterator();
        // --------------------------------------
        for (Iterator it = myList.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
        // Example 02 --------------------------------------

        // --------------------------------------
        
    }
}
