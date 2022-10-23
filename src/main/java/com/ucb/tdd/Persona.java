package com.ucb.tdd;

public class Persona {
    int pisoDestino;
    int pisoPersona;

    public int getPisoDestino() {
        return pisoDestino;
    }

    public void asignarPisoAleatorio() {
        this.pisoDestino = (int) (Math.random() * 3 + 1);
    }

    public int crearPersona() throws Exception {
        pisoPersona = (int) (Math.random() * 3 + 1);
        if (pisoPersona > 3 || pisoPersona < 1) {
            throw new Exception("Fuera de Rango");
        }
        return pisoPersona;
    }

    public void llamarElevador() throws Exception {
        asignarPisoAleatorio();
        if (crearPersona() == pisoDestino) {
            throw new Exception("Pisos Iguales");
        }
    }


}
