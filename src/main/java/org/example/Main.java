package org.example;


//¿Semezclanlasletras? Justificaelcomportamientoobservado.
//
//Sí, se mezclan. Es debido a que se ejecutan de manera "simultanea", no secuencialmente.
public class Main {
    public static void main(String[] args) {
        Hilos hebra1 = new Hilos('Z', 25);
        Hilos hebra2 = new Hilos('X', 25);
        Hilos hebra3 = new Hilos('C', 25);



        hebra1.start();
        hebra2.start();
        hebra3.start();
    }
}

