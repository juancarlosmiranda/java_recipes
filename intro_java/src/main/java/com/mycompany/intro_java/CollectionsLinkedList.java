
package com.mycompany.intro_java;

import java.util.LinkedList;
import java.util.Iterator;

public class CollectionsLinkedList {
        public static void main(String[] args) {
            // Example 02 --------------------------------------
            System.out.println("--------------------------------");
            System.out.println("Using import java.util..LinkedList;");
            System.out.println("--------------------------------");
            
            LinkedList<String> myLinkedList01 = new LinkedList<>();
            int sizeU = 10;
            // load

            System.out.println("Loading 10 values");            
            for (int i=0; i<=sizeU; i++){
                myLinkedList01.add("M"+i);
            }
                        
            // iterating 01 with size
            for (int i=0; i<myLinkedList01.size(); i++){
                System.out.println(myLinkedList01.get(i));
            }
            
            
            System.out.println("Setting element at position 2");
            myLinkedList01.set(2, "SET_02");
            System.out.println("Inserting element at position 3, the list will grow");
            myLinkedList01.add(3, "SET_02");
            
            System.out.println("--------------------------------");
            System.out.println("Iterator and While loop");
            System.out.println("--------------------------------");
            
            // iterating with Iterator 01
            Iterator it = myLinkedList01.iterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }            
            // ---------------------------------
            
            // ---------------------------------            
            System.out.println("Removing elements by value and by position, the list will decrease");
            myLinkedList01.remove("SET_02");
            String removedElement = myLinkedList01.remove(3);
            System.out.println("Removed element = "+removedElement);
            
            System.out.println("--------------------------------");
            System.out.println("Iterator and For loop");
            System.out.println("--------------------------------");
            
            // iterating with Iterator 02
            for (Iterator it02 = myLinkedList01.iterator(); it02.hasNext(); ){
                System.out.println(it02.next());
            }
            
            System.out.println("First Element="+myLinkedList01.getFirst());
            System.out.println("Last Element="+myLinkedList01.getLast());
            System.out.println("List Size="+myLinkedList01.size());
            System.out.println("Searching value='M10'at position="+myLinkedList01.indexOf("M10"));
            System.out.println("Last index of 'M10' at position"+myLinkedList01.lastIndexOf("M10"));
            System.out.println("Getting element at .get(8)="+myLinkedList01.get(8));
            
                        
            if(myLinkedList01.isEmpty()){
                System.out.println("list IS EMPTY");
            }else{
                System.out.println("list NOT EMPTY");
            }
            

        // --------------------------------------

        // --------------------------------------        
    }
}
