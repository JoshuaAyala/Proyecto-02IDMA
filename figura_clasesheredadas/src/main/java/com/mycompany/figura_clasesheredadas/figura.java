/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figura_clasesheredadas;

/**
 *
 * @author joshu
 */
public abstract class figura extends Main{
    public String tamaño; public String color; public int ancho; public int largo;
    public double area;
    public double radio;
    public double base;
    public figura(){
        super();
    }
    public abstract double getArea();
    public abstract String getColor();
    public abstract String getTamaño();
    public abstract int getAncho();
    public abstract int getLargo();
    
}