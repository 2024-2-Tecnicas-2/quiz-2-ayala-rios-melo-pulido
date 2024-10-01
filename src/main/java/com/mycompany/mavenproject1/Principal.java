/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author USUARIO
 */
public class Principal {

    public static void main(String[] args) {
        Coche carro1 = new Coche("pirata", "xyz33pro", 20, Tipodecombustible.GASOLINA );
        Lancha BarcoTomas1 = new Lancha("pirata3", "xyz33proaunmaspro", 2999, Tipodecombustible.ELECTRICO);

        System.out.println("carro1");
        carro1.acelerar();
        System.out.println("acelerado velocidad: "+carro1.getVelocidadActual());
         carro1.frenar();
        System.out.println("frenado velocidad: "+carro1.getVelocidadActual());
        
        
       System.out.println("Tipo de combustible: "+carro1.getCombustible());
      
       
       
       
       
       
       
       
        System.out.println("");
        System.out.println("");
        
        
        
        
        
        System.out.println("BarcoTomas1"); 
        BarcoTomas1.acelerar();
        System.out.println("velocidad: "+BarcoTomas1.getVelocidadActual());
        
        
       
        BarcoTomas1.frenar();
        System.out.println("velocidad: "+BarcoTomas1.getVelocidadActual());
        
        System.out.println("Tipo de combustible: "+BarcoTomas1.getCombustible());
    }
}
