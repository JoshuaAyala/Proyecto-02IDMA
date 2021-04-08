package com.mycompany.figura_clasesheredadas;

/**
 *
 * @author joshu
 */
public abstract class tridimensionales extends figura{
    public int profundidad; public int vertices; public int aristas;
    public tridimensionales(){
        super();
    }
    public abstract double getVolumen();
    public abstract int getProfundidad();
    public abstract int getVertices();
    public abstract int getAristas();
}
