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
public class Circulo extends bidimensional{
    public String nombre = "Circulo";
    public Circulo(){
        super();
    }
    @Override
    public double getArea(){
        return Math.PI * (Math.pow(radio, 2));
    }
    @Override
    public double getPerimetro(){
        return 2*(Math.PI * radio);
    }
    @Override
    public int getLados(){
        lados = 0; // No tiene lados
        return lados;
    }
    
    @Override
    public int getAngulos(){
        lados = 0; // No tiene angulos
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
