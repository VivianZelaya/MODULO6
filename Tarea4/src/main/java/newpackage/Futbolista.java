/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author Vivian Zelaya
 */
public class Futbolista {
    //Declaración de variables
    public String nombre;
    private int edad;
    private String equipoActual;
    
    public Futbolista(){
        
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEdad(int edad){
        this.edad= edad;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public void setEquipoActual(String equipoActual){
        this.equipoActual=equipoActual;
    }
    public String getEquipoActual(){
        return equipoActual;
    }

   
}
