/*
 * 
 * Project:
 * Author:
 * Date:
 * Description:
 *
 *  Operations applied to files.
 *  Use cases for:
 *     FileReader, BufferedReader
 *     FileWriter, BufferedWriter
 *
 *  Source: https://www.codejava.net/java-se/file-io/how-to-read-and-write-text-file-in-java
 * 
 * Use:
 * 
 */


package com.mycompany.intro_java;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
        
public class FileManagement01 {      
   
    public static void main(String[] args) {
        // -------------------------------------
        // Reading
        // -------------------------------------
        String userPath = new File("").getAbsolutePath();
        String dataName = "DATA";
        String fileNameR1 = "2024_UPA_01.txt";
        
        File dataPath = new File(userPath, dataName);
        File filePathR01 = new File(dataPath, fileNameR1);
        
        System.out.println("userDirectory -> " + userPath);
        System.out.println("dataPath -> " + dataPath);
        System.out.println("filePathR01 -> " + filePathR01);

        
        System.out.println("Reading Files ");
        
        try{
            FileReader fiReader = new FileReader(filePathR01);
            BufferedReader bfReader = new BufferedReader(fiReader); 
            String line;            
            while((line = bfReader.readLine()) != null){
                System.out.println(line);
            }
            fiReader.close();    
        } catch (IOException e){
            e.printStackTrace();        
        }
        
        // -------------------------------------
        // Writing
        // -------------------------------------
        String fileNameW1 = "2024_UPA_02.txt";
        File filePathW01 = new File(dataPath, fileNameW1);
        
        System.out.println("userDirectory -> " + userPath);
        System.out.println("dataPath -> " + dataPath);
        System.out.println("filePathW01 -> " + filePathW01);
        
        System.out.println("Writing Files ");
                
        try{
            FileWriter writer = new FileWriter(filePathW01);
            BufferedWriter bfWriter = new BufferedWriter(writer);
            bfWriter.write("NEW LINE 01");
            bfWriter.newLine();
            bfWriter.write("NEW LINE 02");
            bfWriter.newLine();
            bfWriter.close();
        }catch (IOException e){
            e.printStackTrace();        
        }

        

    }
}
