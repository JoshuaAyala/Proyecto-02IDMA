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
public class Cuadrado extends bidimensional{
    public String nombre = "Circulo";
    public Cuadrado(){
        super();
    }    
    @Override
    public double getArea(){
        return base * base;
    }
    @Override
    public double getPerimetro(){
        return base * 4;
    }
    @Override
    public int getLados(){
        lados = 4;
        return lados;
    }
    
    @Override
    public int getAngulos(){
        angulos = 4;
        return angulos;
    }
    @Override
    public String getColor(){
        return color;
    }
    @Override
    public String getTamaño(){
        return tamaño;
    }
    
    @Override
    public int getAncho(){
        return ancho;
    }
    @Override
    public int getLargo(){
        return largo;
    }
}
