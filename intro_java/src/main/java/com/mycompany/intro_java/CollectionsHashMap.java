/*

Adapted from https://sentry.io/answers/iterate-hashmap-java/
*/
package com.mycompany.intro_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Enumeration;
import java.util.Set;

public class CollectionsHashMap {
        public static void main(String[] args) {
            // Example 02 --------------------------------------
            System.out.println("--------------------------------");
            System.out.println("Using import java.util.HashMap;");
            System.out.println("--------------------------------");
            
            HashMap<Integer, String> myHashMap01 = new HashMap<>();
            int sizeU = 10;
            // load

            System.out.println("Loading 10 values");            
            for (int i=0; i<=sizeU; i++){
                myHashMap01.put(i,"M"+i);
            }
                        
            // iterating 01 with size
            for (int i=0; i<myHashMap01.size(); i++){
                System.out.println(myHashMap01.get(i));
            }
                        
            System.out.println("Setting element at position 2");
            myHashMap01.replace(2, "SET_02");
            System.out.println("Inserting element at position 3, the list will grow");
            myHashMap01.replace(3, "SET_03");
            
            System.out.println("--------------------------------");
            System.out.println("Iterator and While loop");
            System.out.println("--------------------------------");
                                    
            // iterating with Iterator 01
            Iterator <Map.Entry<Integer, String>> it = myHashMap01.entrySet().iterator();
                        
            while(it.hasNext()){
                Map.Entry<Integer, String> entry = it.next();
                Integer key = entry.getKey();
                String value = entry.getValue();
                System.out.println("key="+ key +" value = "+ value);
            }

            System.out.println("--------------------------------");
            System.out.println("Iterator and For loop");
            System.out.println("--------------------------------");            
            
            for(Map.Entry<Integer, String> entry : myHashMap01.entrySet()){
                Integer key = entry.getKey();
                String value = entry.getValue();
                System.out.println("key="+ key +" value = "+ value);
            }
                    
            
            // ---------------------------------
            
            // ---------------------------------            
            System.out.println("Removing elements by value and by position, the list will decrease");
            String removedElement = myHashMap01.remove(3);
            System.out.println("Removed element = "+removedElement);
            
            System.out.println("--------------------------------");
            System.out.println("Iterator and For loop");
            System.out.println("--------------------------------");
            // It is used when you need keys and values            
            for(Map.Entry<Integer, String> entry : myHashMap01.entrySet()){
                Integer key = entry.getKey();
                String value = entry.getValue();
                System.out.println("key="+ key +" value = "+ value);
            }
            
            System.out.println("HashMap Size="+myHashMap01.size());
            System.out.println("Contains Value='SET_02' "+myHashMap01.containsValue("SET_02"));
            System.out.println("Contains Key=1 "+myHashMap01.containsKey(8)); // bolean
            System.out.println("Getting element at .get(8)="+myHashMap01.get(8)); //key
            
            
            if(myHashMap01.isEmpty()){
                System.out.println("Map IS EMPTY");
            }else{
                System.out.println("Map NOT EMPTY");
            }
            

        // --------------------------------------

        // --------------------------------------        
    }
}
