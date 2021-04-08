package com.mycompany.figura_clasesheredadas;

/**
 *
 * @author joshu
 */
public class Cubo extends tridimensionales{
    public String nombre = "Cubo";

    public Cubo(){
        super();
    }
    @Override
    public double getArea(){
        return 6*(Math.pow(area, 2));
    }
    @Override
    public double getVolumen(){
        return Math.pow(area, 3);
    }
    @Override
    public int getProfundidad(){
        return profundidad;
    }
    @Override
    public int getVertices(){
        return vertices;
    }
    @Override
    public int getAristas(){
        return aristas;
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
