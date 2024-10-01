/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

/**
 *
 * @author USUARIO
 */
public class VehiculoBase implements Vehiculo{
    private String marca;
    private String modelo;
    private int VelocidadActual;
    
    

    public VehiculoBase(String marca, String modelo, int VelocidadActual, Tipodecombustible Combustible) {
        this.marca = marca;
        this.modelo = modelo;
        this.VelocidadActual = VelocidadActual;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadActual() {
        return VelocidadActual;
    }

    public void setVelocidadActual(int VelocidadActual) {
        this.VelocidadActual = VelocidadActual;
    }

 
 

    @Override
    public void tipodecombustible(Tipodecombustible a) {
        System.out.println("Tipo de combustible"+ a);
    }

    @Override
    public void acelerar() {
        int i = getVelocidadActual();
        i = i + 2;
        setVelocidadActual(i);
        System.out.println("se a aumentado la velocidad 2 unidades");
    }

    @Override
    public void frenar() {
        int i = getVelocidadActual();
        i = i - 2;
        setVelocidadActual(i);
        System.out.println("se a disminuido la velocidad 2 unidades");
    }
}
