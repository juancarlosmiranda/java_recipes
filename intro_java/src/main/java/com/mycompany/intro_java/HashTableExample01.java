
package com.mycompany.intro_java;

import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Scanner;

public class HashTableExample01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Ejemplo de Hash Table");
        
        // declarar
        Hashtable<Integer, String> myHTable = new Hashtable<>();
        
        // cargar contenido
        myHTable.put(1,"MENSAJE_01");
        myHTable.put(2,"MENSAJE_02");
        myHTable.put(3,"MENSAJE_03");
        
        // cargar contenido con loop
        Scanner sc01 = new Scanner(System.in);
        String valoresStr;
        for(int i=0;i<5;i++){
            valoresStr = sc01.nextLine(); // ingresado por el usuario
            // guardar en hash table
            myHTable.put(i,valoresStr);
        }
        
        // mostrar contenido
        Enumeration<Integer> e = myHTable.keys();
        
        while(e.hasMoreElements()){
            int key = e.nextElement();                        
            System.out.println("key="+key+" value = "+ myHTable.get(key));
        }
        
    }
    
}
