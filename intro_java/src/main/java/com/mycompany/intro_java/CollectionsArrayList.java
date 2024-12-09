
package com.mycompany.intro_java;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsArrayList {
        public static void main(String[] args) {
            // Example 02 --------------------------------------
            System.out.println("--------------------------------");
            System.out.println("Using import java.util.ArrayList;");
            System.out.println("--------------------------------");
            
            ArrayList<String> myArrayList01 = new ArrayList<>();
            int sizeU = 10;
            // load

            System.out.println("Loading 10 values");            
            for (int i=0; i<=sizeU; i++){
                myArrayList01.add("M"+i);
            }
                        
            // iterating 01 with size
            for (int i=0; i<myArrayList01.size(); i++){
                System.out.println(myArrayList01.get(i));
            }
            
            
            System.out.println("Setting element at position 2");
            myArrayList01.set(2, "SET_02");
            System.out.println("Inserting element at position 3, the list will grow");
            myArrayList01.add(3, "SET_02");
            
            System.out.println("--------------------------------");
            System.out.println("Iterator and While loop");
            System.out.println("--------------------------------");
            
            // iterating with Iterator 01
            Iterator it = myArrayList01.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }            
            // ---------------------------------
            
            // ---------------------------------            
            System.out.println("Removing elements by value and by position, the list will decrease");
            myArrayList01.remove("SET_02");
            String removedElement = myArrayList01.remove(3);
            System.out.println("Removed element = "+removedElement);
            
            System.out.println("--------------------------------");
            System.out.println("Iterator and For loop");
            System.out.println("--------------------------------");
            
            // iterating with Iterator 02
            for (Iterator it02 = myArrayList01.iterator(); it02.hasNext(); ){
                System.out.println(it02.next());
            }
            
            System.out.println("First Element="+myArrayList01.getFirst());
            System.out.println("Last Element="+myArrayList01.getLast());
            System.out.println("List Size="+myArrayList01.size());
            System.out.println("Searching value='M10'at position="+myArrayList01.indexOf("M10"));
            System.out.println("Last index of 'M10' at position"+myArrayList01.lastIndexOf("M10"));
            System.out.println("Getting element at .get(8)="+myArrayList01.get(8));
            
                        
            if(myArrayList01.isEmpty()){
                System.out.println("list IS EMPTY");
            }else{
                System.out.println("list NOT EMPTY");
            }
            

        // --------------------------------------

        // --------------------------------------        
    }
}
