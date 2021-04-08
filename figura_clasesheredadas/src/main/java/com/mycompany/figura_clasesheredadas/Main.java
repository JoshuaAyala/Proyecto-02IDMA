package com.mycompany.figura_clasesheredadas;
import java.util.*;

public class Main {
    public static void main(String [] Args){

        Scanner scan = new Scanner(System.in);
        
        System.out.println("+--------------+");
        System.out.println("+              +");
        System.out.println("+  Bienvenido  +");
        System.out.println("+              +");
        System.out.println("+--------------+\n");
        String oP = "";
        try{
            do{
                int op = 0;
                System.out.println("\n+- Elige una opción:\n");
                System.out.println("[1] Figuras Bidimensionales.");
                System.out.println("[2] Figuras Tridimensionales.\n");
                op = scan.nextInt();
                if(op == 1){  //opcion figuras bi / tri
                    op = 0;
                    System.out.println("\n+- Elige una figura:\n");
                    System.out.println("[1] Cuadrado.");
                    System.out.println("[2] Circulo.");
                    System.out.println("[3] Triángulo Equilatero.\n");
                    op = scan.nextInt();
                    if(op == 1){
                        // Cuadrado
                        Cuadrado x = new Cuadrado();
                        System.out.println("¿Cuál es el valor de la base?");
                        x.base = scan.nextDouble();
                        System.out.println("¿De qué color es la figura?");
                        x.color = scan.nextLine();
                        x.color = scan.nextLine();
                        System.out.println("¿De qué tamaño es la figura?");
                        x.tamaño = scan.nextLine();
                        System.out.println("¿Cuál es su largo?");
                        x.largo = scan.nextInt();
                        System.out.println("¿Cuál es su ancho?");
                        x.ancho = scan.nextInt();
                        System.out.println("\n  +- Área del " + x.nombre + " es " + x.getArea());
                        System.out.println("  +- Perimetro del " + x.nombre + " es " + x.getPerimetro());
                        System.out.println("  +- Los lados del " + x.nombre + " son " + x.getLados() + " de " + x.base + " cada uno.");
                        System.out.println("  +- Los ángulos del " + x.nombre + " son " + x.getAngulos());
                        System.out.println("  +- El color del " + x.nombre + " es " + x.getColor());
                        System.out.println("  +- El tamaño del " + x.nombre + " es " + x.getTamaño());
                        System.out.println("  +- El largo del " + x.nombre + " es " + x.getLargo());
                        System.out.println("  +- El ancho del " + x.nombre + " es " + x.getAncho());
                    }
                    else if(op == 2){
                        // Circulo
                        Circulo x = new Circulo();
                        System.out.println("¿Cuál es el valor del radio?");
                        x.radio = scan.nextDouble();
                        System.out.println("¿De qué color es la figura?");
                        x.color = scan.nextLine();
                        x.color = scan.nextLine();
                        System.out.println("¿De qué tamaño es la figura?");
                        x.tamaño = scan.nextLine();
                        System.out.println("¿Cuál es su largo?");
                        x.largo = scan.nextInt();
                        System.out.println("¿Cuál es su ancho?");
                        x.ancho = scan.nextInt();
                        System.out.println("\n  +- Área del " + x.nombre + " es " + x.getArea());
                        System.out.println("  +- Perimetro del " + x.nombre + " es " + x.getPerimetro());
                        System.out.println("  +- El color del " + x.nombre + " es " + x.getColor());
                        System.out.println("  +- El tamaño del " + x.nombre + " es " + x.getTamaño());
                        System.out.println("  +- El largo del " + x.nombre + " es " + x.getLargo());
                        System.out.println("  +- El ancho del " + x.nombre + " es " + x.getAncho());
                    }
                    else if(op == 3){
                        // Triángulo
                        Triangulo x = new Triangulo();
                        System.out.println("¿Cuál es el valor de la base?");
                        x.base = scan.nextDouble();
                        System.out.println("¿Cuál es el valor de la altura?");
                        x.altura = scan.nextDouble();
                        System.out.println("¿De qué color es la figura?");
                        x.color = scan.nextLine();
                        x.color = scan.nextLine();
                        System.out.println("¿De qué tamaño es la figura?");
                        x.tamaño = scan.nextLine();
                        System.out.println("¿Cuál es su largo?");
                        x.largo = scan.nextInt();
                        System.out.println("¿Cuál es su ancho?");
                        x.ancho = scan.nextInt();
                        System.out.println("\n  +- Área del " + x.nombre + " es " + x.getArea());
                        System.out.println("  +- Perimetro del " + x.nombre + " es " + x.getPerimetro());
                        System.out.println("  +- Los lados del " + x.nombre + " son " + x.getLados() + " de " + x.base + " cada uno.");
                        System.out.println("  +- Los ángulos del " + x.nombre + " son " + x.getAngulos());
                        System.out.println("  +- El color del " + x.nombre + " es " + x.getColor());
                        System.out.println("  +- El tamaño del " + x.nombre + " es " + x.getTamaño());
                        System.out.println("  +- El largo del " + x.nombre + " es " + x.getLargo());
                        System.out.println("  +- El ancho del " + x.nombre + " es " + x.getAncho());
                    }
                }
                else if(op == 2){
                    op = 0;
                    System.out.println("+- Elige una figura:\n");
                    System.out.println("[1] Cubo.");
                    System.out.println("[2] Esfera.\n");
                    op = scan.nextInt();
                    if(op == 1){
                        // Cubo
                        Cubo x = new Cubo();
                        System.out.println("¿Cuál es el valor de un lado?");
                        x.area = scan.nextDouble();
                        System.out.println("¿Cuál es el valor de la profundidad?");
                        x.profundidad = scan.nextInt();
                        System.out.println("¿Cuántos vertices tiene?");
                        x.vertices = scan.nextInt();
                        System.out.println("¿Cuántas aristas tiene?");
                        x.aristas = scan.nextInt();
                        System.out.println("¿De qué color es la figura?");
                        x.color = scan.nextLine();
                        x.color = scan.nextLine();
                        System.out.println("¿De qué tamaño es la figura?");
                        x.tamaño = scan.nextLine();
                        System.out.println("¿Cuál es su largo?");
                        x.largo = scan.nextInt();
                        System.out.println("¿Cuál es su ancho?");
                        x.ancho = scan.nextInt();
                        System.out.println("\n  +- Área del " + x.nombre + " es " + x.getArea());
                        System.out.println("  +- Volumen del " + x.nombre + " es " + x.getVolumen());
                        System.out.println("  +- La profundidad del " + x.nombre + " es " + x.getProfundidad());
                        System.out.println("  +- Los vertices del " + x.nombre + " son " + x.getVertices());
                        System.out.println("  +- Las aristas del " + x.nombre + " son " + x.getAristas());
                        System.out.println("  +- El color del " + x.nombre + " es " + x.getColor());
                        System.out.println("  +- El tamaño del " + x.nombre + " es " + x.getTamaño());
                        System.out.println("  +- El largo del " + x.nombre + " es " + x.getLargo());
                        System.out.println("  +- El ancho del " + x.nombre + " es " + x.getAncho());
                        
                    }
                    else if(op == 2){
                        // Esfera
                        Esfera x = new Esfera();
                        System.out.println("¿Cuál es el valor del radio?");
                        x.radio = scan.nextDouble();
                        System.out.println("¿Cuál es el valor de la profundidad?");
                        x.profundidad = scan.nextInt();
                        System.out.println("¿Cuántos vertices tiene?");
                        x.vertices = scan.nextInt();
                        System.out.println("¿Cuántas aristas tiene?");
                        x.aristas = scan.nextInt();
                        System.out.println("¿De qué color es la figura?");
                        x.color = scan.nextLine();
                        x.color = scan.nextLine();
                        System.out.println("¿De qué tamaño es la figura?");
                        x.tamaño = scan.nextLine();
                        System.out.println("¿Cuál es su largo?");
                        x.largo = scan.nextInt();
                        System.out.println("¿Cuál es su ancho?");
                        x.ancho = scan.nextInt();
                        System.out.println("\n  +- Área del " + x.nombre + " es " + x.getArea());
                        System.out.println("  +- Volumen del " + x.nombre + " es " + x.getVolumen());
                        System.out.println("  +- La profundidad del " + x.nombre + " es " + x.getProfundidad());
                        System.out.println("  +- Los vertices del " + x.nombre + " son " + x.getVertices());
                        System.out.println("  +- Las aristas del " + x.nombre + " son " + x.getAristas());
                        System.out.println("  +- El color del " + x.nombre + " es " + x.getColor());
                        System.out.println("  +- El tamaño del " + x.nombre + " es " + x.getTamaño());
                        System.out.println("  +- El largo del " + x.nombre + " es " + x.getLargo());
                        System.out.println("  +- El ancho del " + x.nombre + " es " + x.getAncho());
                    }
                }
                System.out.println("\n+- ¿Quieres realizar otra operación? (Y/n)");
                oP = (scan.nextLine()).toUpperCase();
                oP = (scan.nextLine()).toUpperCase();
            }while(oP.equals("Y"));
            System.out.print("\n - Adios :) -");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}