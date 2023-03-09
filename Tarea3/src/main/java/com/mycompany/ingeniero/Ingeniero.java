/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ingeniero;

/**
 *
 * @author Vivian Zelaya
 */
public class Ingeniero {

    public static void main(String[] args){
        Persona persona = new Persona();
        persona.setname("Vivian");
        persona.setlastname("Zelaya");
        persona.setage(20);
        persona.setsex("Femenino");
        
        System.out.println("-----INGENIERO-----");
        System.out.println("Nombre: " + persona.getname());
        System.out.println("Apellido: " + persona.getlastname());
        System.out.println("Edad: " + persona.getage());
        System.out.println("Sexo: " + persona.getsex());
    }
    public static class Persona{
        private String name;
        private String lastname;
        private int age;
        private String sex;
        
        public String getname(){
            return name;
        }
        public String getlastname(){
            return lastname;
        }
        public int getage(){
            return age;
        }
        public String getsex(){
            return sex;
        }
        public void setname(String name){
            this.name=name;
        }
        public void setlastname(String lastname){
            this.lastname=lastname;
        }
        public void setage(int age){
            this.age=age;
        }
        public void setsex(String sex){
            this.sex=sex;
        }
    }
}
