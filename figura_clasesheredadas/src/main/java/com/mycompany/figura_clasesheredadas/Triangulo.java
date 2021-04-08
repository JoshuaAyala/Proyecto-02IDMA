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
public class Triangulo extends bidimensional{
    public String nombre = "Triangulo";
    public double base;
    public double altura;
    public Triangulo(){
        super();
    }
    @Override
    public double getArea(){
        return (base * altura)/2;
    }
    @Override
    public double getPerimetro(){
        return base * 3;
    }
    @Override
    public int getLados(){
        lados = 3;
        return lados;
    }
    
    @Override
    public int getAngulos(){
        angulos = 3;
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