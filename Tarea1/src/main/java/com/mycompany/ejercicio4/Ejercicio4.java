/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio4;

/**
 *
 * @author Vivian Zelaya
 */
//Crear un arrelo que guarde e imprima 20 nombres de ciudades
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        String ciudad[]= new String[20];
        Scanner num= new Scanner (System.in);
        
        for(int i=0; i<ciudad.length; i++){
            System.out.println("Ingrese el nombre de la ciudad: "+(i+1));
            ciudad[i] = num.nextLine();
        }
        System.out.println("Ciudades");
        for(int i=0; i<ciudad.length; i++){
            System.out.println(ciudad[i]);
        }
        
    }
}
