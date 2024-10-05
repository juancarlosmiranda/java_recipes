
package com.mycompany.intro_java;

import java.util.Vector;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayMatrixCollections03 {
        public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("import java.util.ArrayList;");
        System.out.println("--------------------------------");
        
        // Example 01 --------------------------------------
        Vector myVector = new Vector();
        int sizeU = 10;
        
        for (int i=0; i<=sizeU; i++){
            myVector.add(i);
        };

        for (int i=0; i<=sizeU; i++){
            System.out.println(myVector.elementAt(i));
        };
        
        // --------------------------------------

        // Example 02 --------------------------------------
        System.out.println("--------------------------------");
        System.out.println("Using import java.util.Vector;");
        System.out.println("--------------------------------");

        ArrayList<String> myArrayList01 = new ArrayList<String>();
        sizeU = 10;
        
        // load
        for (int i=0; i<=sizeU; i++){
            myArrayList01.add("M"+i);
        }
        
        // iterating 01
        for (int i=0; i<myArrayList01.size(); i++){
            System.out.println(myArrayList01.get(i));
        }
        
        System.out.println("--------------------------------");
        System.out.println("import java.util.Iterator;");
        System.out.println("--------------------------------");        

        // iterating with Iterator 01
        Iterator it = myArrayList01.iterator();        
        while(it.hasNext()){            
            System.out.println(it.next());
        }

        System.out.println("--------------------------------");
        System.out.println("import java.util.Iterator;");
        System.out.println("--------------------------------");
        // iterating with Iterator 02        
        for (Iterator it02 = myArrayList01.iterator(); it02.hasNext(); ){
            System.out.println(it02.next());        
        }            
        // --------------------------------------


        // --------------------------------------
        
    }
}
