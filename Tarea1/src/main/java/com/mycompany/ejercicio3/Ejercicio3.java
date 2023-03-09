/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio3;

/**
 *
 * @author Vivian Zelaya
 */
/*Dadas las variables de tipo int M = 6, T = 1, K = -10 indicar si la evaluación
* de estas expresiones daría como resultado verdadero o falso:
* M > T
* T / K == -5
*(M+T == 7) || (M-T == 5)
*/
public class Ejercicio3 {
    public static void main(String[] args){
        int M=6, T=1, K=-10;
        
        if (M>T){
            System.out.println("Verdadero");
        }else {
                    System.out.println("Falso");
                    }
        
        if (T/K==-5){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }
        
        if((M+T==7) || (M-T==5)){
            System.out.println("Verdadero");
        }else{
            System.out.println("Falso");
        }
    }
}
