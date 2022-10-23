package com.ucb.tdd;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Random;

import static org.junit.Assert.*;

public class PersonaTest {
    private Persona persona;

    @Rule
    public ExpectedException exception = ExpectedException.none();


    @Before
    public void before() {
        persona = new Persona();
    }

    @Test
    public void crearPersonaEnUnPiso() throws Exception {
        persona.crearPersona();
        assertTrue(1 <= persona.crearPersona() && persona.crearPersona() <= 3);
    }
    @Test
    public void samefloors() throws Exception{
        persona.llamarElevador();
    }
}