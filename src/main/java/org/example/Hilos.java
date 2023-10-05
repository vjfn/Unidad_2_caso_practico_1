package org.example;

public class Hilos extends Thread{

    private char caracter;
    private int repeticiones;

    public Hilos(char caracter, int repeticiones) {
        this.caracter = caracter;
        this.repeticiones = repeticiones;
    }

    @Override
    public void run() {
        for (int i = 0; i < repeticiones; i++) {
            System.out.println(caracter);
        }
    }
}
