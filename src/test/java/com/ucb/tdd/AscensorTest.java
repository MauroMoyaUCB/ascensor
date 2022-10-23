package com.ucb.tdd;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class AscensorTest {

    @Rule
    public ExpectedException exception = ExpectedException.none();
    private Elevador elevador;

    @Before
    public void before() {
        elevador = new Elevador();
    }

    @Test
    public void solounapersonaenelelevador() throws Exception {
        elevador.personaSubiendoElevador();
        exception.expect(Exception.class);
        elevador.personaSubiendoElevador();
    }

    @Test
    public void primetoarribaluegoabajo() {
        assertEquals(3, elevador.movimientoDeElevador(1, 3));
        assertEquals(1, elevador.movimientoDeElevador(3, 1));
        assertEquals(3, elevador.movimientoDeElevador(2, 3));
        assertEquals(1, elevador.movimientoDeElevador(2, 1));

    }

    @Test
    public void solotrespersonasenelelevador() {
        int floors = 3;
        assertEquals(floors, elevador.getPisos());
    }

    @Test
    public void aliniciarelelevadorenprimerpiso() {
        assertFalse(elevador.getElevadorEstado());
    }

    @Test
    public void personaDentroElevador() throws Exception {
        elevador.personaEnElevador(1);
    }
}