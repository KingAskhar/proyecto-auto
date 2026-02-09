package com.actividad;

public class Main {
    public static void main(String[] args) {
         Auto auto1 = new Auto();
         Auto auto2 = new Auto();
         Auto auto3 = new Auto();
         Auto auto4 = new Auto();


         auto1.marca = "Audi";
         auto1.modelo = 2020;
         auto1.color = "Negro";
         auto1.kilometraje = 0.02;
         auto1.velocidad = 2;

         auto2.marca = "TOYOTA Corola";
         auto2.modelo = 2025;
         auto2.color = "Blanco";
         auto2.kilometraje = 150;
         auto2.velocidad = 200;

         auto3.marca = "NISSAN";
         auto3.modelo = 2019;
         auto3.color = "Verde coinbra";
         auto3.kilometraje = 2944;
         auto3.velocidad = 20;

         auto4.marca = "Renault 5";
         auto4.modelo = 1972;
         auto4.color = "Rojo";
         auto4.kilometraje = 10000000;
         auto4.velocidad = 4;

         auto1.mostrarInformacion();
         auto1.encender();
         auto1.acelera();

         auto2.mostrarInformacion();
         auto2.encender();
         auto2.acelera();
         auto2.frena();
         
         auto3.mostrarInformacion();
         auto3.encender();
         auto3.acelera();
         
         auto4.mostrarInformacion();
         auto4.encender();
         auto4.acelera();
         auto4.frena();

    }
}