package com.ucb.tdd;


public class Elevador {

    private int pisoActual = 1;
    private boolean elevadorAbierto = false;
    private int pisos = 3;
    int capacidad = 0;
    private int personas = 0;


    public void personaSubiendoElevador() throws Exception {
        personas++;
        if (personas > 1)
            throw new Exception("Capacidad exedida, Solo puede entra 1 persona");

    }

    void personaEnElevador(int persona) throws Exception {
        capacidad += persona;
        if (capacidad == 1) {
            System.out.println("En el elevador");
        } else if (capacidad == 0) {
            System.out.println("Elevador vacio");

        } else {
            throw new Exception("Capacidad exedida");
        }
    }

    public int getPisos() {
        return pisos;
    }

    public boolean getElevadorEstado() {
        return elevadorAbierto;
    }

    public int movimientoDeElevador(int pisoActual, int pisoDestino) {
        int aux;
        if (pisoActual != pisoDestino && pisoActual < pisoDestino) {
            aux = pisoDestino - pisoActual;
            pisoActual += aux;

        } else {
            aux = pisoActual - pisoDestino;
            pisoActual -= aux;
        }
        return pisoActual;
    }
}
