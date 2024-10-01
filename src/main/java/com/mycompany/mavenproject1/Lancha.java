/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author USUARIO
 */
public class Lancha extends VehiculoBase {
    private Tipodecombustible combustible;

    public Lancha(String marca, String modelo, int VelocidadActual, Tipodecombustible Combustible) {
        super(marca, modelo, VelocidadActual, Combustible);
    }

    @Override
    public String toString() {
        return super.toString()+"Lancha{" + "combustible=" + combustible + '}';
    }

  
    public Tipodecombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Tipodecombustible combustible) {
        this.combustible = combustible;
    }
    
}
