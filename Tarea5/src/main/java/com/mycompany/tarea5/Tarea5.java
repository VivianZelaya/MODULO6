/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea5;

import newpackage.Circulo;
import newpackage.Cuadrado;
import newpackage.Linea;
import newpackage.Triangulo;

/**
 *
 * @author Vivian Zelaya
 */

/**Escribir una Superclase llamada Formas y 4 subclases según el diagrama.
Crear las herencias necesarias para las subclases
Escribir los métodos en la clase padre los métodos en cada subclase (El recuadro con el texto en negrita representa los métodos).
Explicar el funcionamiento y estructura de todo su código en un documento de 2 páginas (Documentación de código).
Los métodos Dibujar de las subclases solo imprimen una salida con el nombre de la figura.
*/
public class Tarea5 {

    public static void main(String[] args) {
       
        //Instanciar
        Circulo cir = new Circulo ();
        Linea lin = new Linea ();
        Triangulo trian = new Triangulo();
        Cuadrado cua = new Cuadrado();
        
        
        //Imprimir
        cir.imprimir();
        System.out.println(" ");
        lin.imprimirL();
        System.out.println(" ");
        trian.imprimirT();
        System.out.println(" ");
        cua.imprimirC();
    }
}
