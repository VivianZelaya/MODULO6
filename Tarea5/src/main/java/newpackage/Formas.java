/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author Vivian Zelaya
 */
public class Formas {
    
    //Atributos
    private String Dibujar;
    private double CalcularRadio;
    private double CalcularArea;
    private double Area;
    
    public Formas(){ 
        //Constructor sin parametros
    }
    
    //set and get
    public void setDibujar(String Dibujar){
        this.Dibujar = Dibujar;
    }
    public String getDibujar(){
        return this.Dibujar;
    }
    
    
    public void setCalcularRadio(double diametro){
        this.CalcularRadio = diametro/2;
    }
    public double getCalcularRadio(){
        return this.CalcularRadio;
    }
 
    
    public void setCalcularArea(double base, double altura){
        this.CalcularArea = (base * altura) / 2;
    }
    public double getCalcularArea(){
        return this.CalcularArea;
    } 
    
    
    public void setArea(double lado){
        this.Area = (lado*lado);
    }
    public double getArea(){
        return this.Area;
    }
    
    //Retornar Información
    public void imprimir(){
        System.out.println("Forma: " + Dibujar);
        System.out.println("Calcular Radio: " + CalcularRadio);
    }
    
    public void imprimirL(){
        System.out.println("Forma: " + Dibujar);
    }
    
    public void imprimirT(){
        System.out.println("Forma: " + Dibujar);
        System.out.println("Calcular Area: " + CalcularArea);
    }
    
    public void imprimirC(){
        System.out.println("Forma: " + Dibujar);
        System.out.println("Calcular Area: " + Area);
    }
}
