
package com.mycompany.intro_java;

import java.util.Vector;
import java.util.Iterator;

public class CollectionsVector {
        public static void main(String[] args) {
        System.out.println("--------------------------------");
        System.out.println("import java.util.Vector;");
        System.out.println("--------------------------------");
        
        // Example 01 --------------------------------------
        Vector myVector = new Vector();
        int sizeU = 10;
        
        for (int i=0; i<=sizeU; i++){
            myVector.add(i);
        };

        for (int i=0; i<=sizeU; i++){
            //System.out.println(myVector.elementAt(i));
            System.out.println(myVector.get(i));
        };
        
        System.out.println("--------------------------------");
        System.out.println("import java.util.Iterator;");
        System.out.println("--------------------------------");        

        // iterating with Iterator 01       
        Iterator it = myVector.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        myVector.remove(10);
        
        System.out.println("--------------------------------");
        System.out.println("import java.util.Iterator;");
        System.out.println("--------------------------------");
        
        // iterating with Iterator 02        
        for (Iterator it02 = myVector.iterator(); it02.hasNext(); ){
            System.out.println(it02.next());
        }
        

        
        // --------------------------------------
        
    }
}
