package com.mycompany.figura_clasesheredadas;
/**
 *
 * @author joshu
 */
public abstract class bidimensional extends figura{
    public int lados; public int angulos;
    public bidimensional(){
        super();
    }
    public abstract int getLados();
    public abstract int getAngulos();
    public abstract double getPerimetro();
}
