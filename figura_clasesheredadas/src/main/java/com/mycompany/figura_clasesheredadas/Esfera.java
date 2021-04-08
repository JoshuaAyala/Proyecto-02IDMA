package com.mycompany.figura_clasesheredadas;

/**
 *
 * @author joshu
 */
public class Esfera extends tridimensionales{
    
    public String nombre = "Esfera";
    
    public Esfera(){
        super();
    }
    @Override
    public double getArea(){
        return 4*Math.PI*(Math.pow(radio,2));
    }
    @Override
    public double getVolumen(){
        return (4*Math.PI*(Math.pow(radio, 3)))/3;
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
