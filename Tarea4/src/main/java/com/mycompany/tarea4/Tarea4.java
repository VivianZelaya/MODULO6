/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea4;

import newpackage.Futbolista;
import newpackage1.Barcelona;
import newpackage1.Liverpool;
import newpackage1.RealMadrid;

/**
 *
 * @author Vivian Zelaya
 */
/**Parte 1:
 * 1. Crear una clase de nombre Futbolista en el que se declaren y protejan sus métodos y 
propiedades utilizando encapsulamiento, desde la clase que contiene el método principal, 
establecer y obtener su edad, nombre y equipoActual (Métodos set y get).
* 
* Parte2:
1. Cree una clase abstracta llamada Equipo, que contenga los siguientes métodos 
abstractos: getEquipo, getCapitan

2. Declare 3 clases con diferentes paises extendiendo de la clase Equipo, 
por ejemplo: RealMadrid, Barcelona, Liverpool, etc. 

En la clase que contiene el método principal (main), imprimir el nombre de los equipos 
y su presidente.
*/
public class Tarea4 {

    public static void main(String[] args) {
        
        //Parte 1:
        Futbolista futbolista = new Futbolista();
        
        futbolista.setNombre("Vivian Zelaya");
        System.out.println(futbolista.getNombre());
      
        futbolista.setEdad(20);
        System.out.println(futbolista.getEdad());
        
        futbolista.setEquipoActual("Liverpool");
        System.out.println(futbolista.getEquipoActual());
        
        System.out.println("  ");
        
        //Parte 2:
        RealMadrid rm = new RealMadrid();
    
        System.out.println(rm.getEquipo());
        System.out.println(rm.getCapitan());
        
        Barcelona ba = new Barcelona();
        
        System.out.println(ba.getEquipo());
        System.out.println(ba.getCapitan());
        
        Liverpool li = new Liverpool();
        
        System.out.println(li.getEquipo());
        System.out.println(li.getCapitan());
    }
}
