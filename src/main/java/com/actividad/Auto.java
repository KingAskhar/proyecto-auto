package com.actividad;

public class Auto {
    String marca;
    int modelo;
    String color;
    double kilometraje;
    int velocidad;

    public void mostrarInformacion() {
        System.out.println("**** INFORMACION DEL VEHICULO ****");
        System.out.println("Este carro es de marca " + marca + ", modelo " + modelo + " es de color " + color
                + " y tiene un kilometraje de " + kilometraje + " y alcanaza una velocidad de " + velocidad + " KM por hora" + "\n");
    }

    public void encender() {
        System.out.println("El auto marca " + marca + " encendio correctamente"+ "\n");

    }

    public void acelera() {
        System.out.println("El auto " + marca + " de color " + color + " tiene un total de " + kilometraje + " kilometros y alcanza una velocidad de " + velocidad + " KM por hora"+ "\n");
    }

    public void frena() {
        System.out.println("El auto " + marca + " que estaba en movimiento, freno a " + velocidad + " KM, derrapando"+ "\n" );

    }
}