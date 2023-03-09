/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio5;

/**
 *
 * @author Vivian Zelaya
 */
//Escribe un programa que imprima mediante un ciclo los números pares del 2 al 100
public class Ejercicio5 {
    public static void main(String[] args){
        
        System.out.println("-----NUMEROS PARES-----");
        for(int i=2; i<=100; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}
