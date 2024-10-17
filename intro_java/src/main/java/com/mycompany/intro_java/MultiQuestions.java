/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.intro_java;

import java.util.Scanner;

public class MultiQuestions {
    public static void main(String[] args){        
        // ------------------------------------
        int number01 = 5;
        int number02 = 2;
        int aa = 0;
        int bb = 0;
        
        aa = number01 / number02;
        bb = number01 % number02;        
        System.out.println("aa ->" + aa);
        System.out.println("bb ->" + bb);        
        // ------------------------------------
        Scanner sc01 = new Scanner(System.in);
        int intNumber = 0;
        //System.out.print("Ingrese Número:");
        //intNumber = sc01.nextInt();
        // -----------------------------------
        int contador = 0;
        do{
            contador++;
            System.out.println("contador="+contador);            
        }while(contador<5);

        System.out.println(" ");

        contador = 0;
        do{
            System.out.println("contador="+contador);
            contador++;
        }while(contador<5);
        System.out.println(" ");        
        // ------------------------------------
        // -----------------------------------
        contador = 0;
        while(contador<=5){
            System.out.println("co="+contador);
            contador++;
        };
        
        System.out.println(" ");

        contador = 0;
        while(contador<=5){
            contador++;
            System.out.println("co="+contador);
        };
        System.out.println(" ");        
        // ------------------------------------
        int tV = 5; int li=3;
        if (tV < li) {
            System.out.println("tV < li");
        } else {
            if (tV == li) {
                System.out.println("tV == li");
            } else {
                System.out.println("tV > li");
            }
        }
        
    }
        // ------------------------------------
    
}
