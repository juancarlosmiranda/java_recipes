/*
 * 
 * Project:
 * Author:
 * Date:
 * Description:
 *
 *  Operations applied to files.
 *  Copy from an ArrayList to a file.
 *
 *  Use cases for:
 *     FileWriter, BufferedWriter
 *  
 *
 *  Source: https://www.codejava.net/java-se/file-io/how-to-read-and-write-text-file-in-java
 * 
 * Use:
 * 
 */

package com.mycompany.intro_java;
import java.util.ArrayList;
import java.util.Iterator;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
        
public class FileManagement02 {      
   
    public static void main(String[] args) {
        // -------------------------------------
        // Writing
        // -------------------------------------
        String userPath = new File("").getAbsolutePath();
        String dataName = "DATA";
        String fileNameW1 = "2024_UPA_02.txt";        

        File dataPath = new File(userPath, dataName);
        File filePathW01 = new File(dataPath, fileNameW1);

        System.out.println("Writing Files ");        
        System.out.println("userDirectory -> " + userPath);
        System.out.println("dataPath -> " + dataPath);
        System.out.println("filePathW01 -> " + filePathW01);

        // --------------------------------------        
        // Loading ArrayList
        // --------------------------------------        
        ArrayList<String> myListToFile = new ArrayList<String>();
        myListToFile.add("Apple");
        myListToFile.add("Orange");
        myListToFile.add("Tomatoe");
        myListToFile.add("Potato");
        myListToFile.add("Apricot");
        // --------------------------------------        
        try{
            FileWriter writer = new FileWriter(filePathW01);
            BufferedWriter bfWriter = new BufferedWriter(writer);

            // --------------------------------------
            // iterating over the list
            // --------------------------------------
            for (Iterator it = myListToFile.iterator(); it.hasNext();) {
                // writing in file
                bfWriter.write(it.next().toString());
                bfWriter.newLine();
            }
            //closing buffer
            bfWriter.close();
        }catch (IOException e){
            e.printStackTrace();        
        }
    }
}



