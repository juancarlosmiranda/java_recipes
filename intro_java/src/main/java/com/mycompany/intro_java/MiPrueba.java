package com.mycompany.intro_java;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Hashtable;
import java.util.Enumeration;

public class MiPrueba {
    public static void main(String [] args){
        System.out.println("Mi programa");
        ArrayList<String> miArrayList = new ArrayList<String>();
        miArrayList.add("UNO");
        miArrayList.add("DOS");
        miArrayList.add("TRES");
        
        Iterator it = miArrayList.iterator();
        //for (Iterator it = miArrayList.iterator(); it.hasNext();){        
        for (; it.hasNext();){
            System.out.println("E->"+it.next());
        }
        
        
        Hashtable <Integer,String> myHashTable = new Hashtable<>();
        myHashTable.put(1, "UNO");
        myHashTable.put(1, "DOS");
        myHashTable.put(1, "TRES");
        
        Enumeration<Integer> enum01 = myHashTable.keys();
        
        for(;enum01.hasMoreElements();){
            System.out.println("my element ->" + enum01.nextElement());
        }
        
        
    }
}
