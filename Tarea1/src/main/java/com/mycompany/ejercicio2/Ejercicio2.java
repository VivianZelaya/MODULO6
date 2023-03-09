/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio2;

/**
 *
 * @author Vivian Zelaya
 */
/*Crear un programa que imprima en consola todas las operaciones aritméticas
*de 4 números enteros (suma, resta, multiplicación, divición)
*/
public class Ejercicio2 {
    public static void main(String[] args){
        int n1=40, n2=20, n3=10, n4=30;
        int suma, resta, multi, divi;
        
        suma=n1+n2+n3+n4;
        resta=n1-n2-n3-n4;
        multi=n1*n2*n3*n4;
        divi=n1/n2;
        System.out.println("-----OPERACIONES ARITMETICAS-----");
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multi);
        System.out.println("La división es: " + divi);   
    }
}
