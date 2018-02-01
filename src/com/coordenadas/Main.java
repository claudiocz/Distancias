package com.coordenadas;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Punto p1 = new Punto(1.5,5.3);
        Punto p2 = new Punto(3.5,5.0);

        //calculo de la distancia entre dos puntos
        double distancia = p1.calcularDistanciaDesde(p2);
        System.out.println("La distancia de p1 a p2 es:"  + distancia);
    }
}
