package com.ucb.tdd;


import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;



import static org.junit.Assert.assertEquals;



import org.junit.rules.ExpectedException;


public class AscensorTest {



        @Rule

        public ExpectedException exception= ExpectedException.none();



        private ascensor ascensor;



        @Before

        public void before() {

            ascensor =  new ascensor();

        }



        @Test

        public void cuandoFueraDeXlanzarException() throws Exception{

//1. Preparacion de la prueba



            System.out.println("==================================== "+ascensor);



//2. Logica de la prueba



//3. Verificacion o Assert

            exception.expect(Exception.class);

            ascensor.jugar(5,2);

        }



        @Test

        public void cuandoFueraDeYlanzarException() throws Exception{

//1. Preparacion de la prueba



            System.out.println("==================================== "+ascensor);



//2. Logica de la prueba



//3. Verificacion o Assert

            exception.expect(Exception.class);

            ascensor.jugar(2,5);

        }



        @Test

        public void cuandoLugarOcupadoLanzarException() throws Exception{

//1. Preparacion de la prueba



            System.out.println("==================================== "+ascensor);



//2. Logica de la prueba

            exception.expect(Exception.class);

            ascensor.jugar(1,3); //Jugador X



//3. Verificacion o Assert

            exception.expect(Exception.class);

            ascensor.jugar(1,3);//Jugador +

        }



        @Test

        public void siPrimerTurnoEntoncesJuegaX() throws Exception{

//1. Preparacion de la prueba



            System.out.println("==================================== "+ascensor);



//2. Logica de la prueba



//3. Verificacion o Assert

            assertEquals('X',ascensor.siguienteTurno());//Jugador X

        }



        @Test

        public void siPrimerTurnoXsiguienteCruz() throws Exception{

//1. Preparacion de la prueba



            System.out.println("==================================== "+ascensor);



//2. Logica de la prueba

            ascensor.jugar(1,3); //Jugador X



//3. Verificacion o Assert

            assertEquals('+',ascensor.siguienteTurno());//Jugador +

        }



        @Test

        public void siUltimoTurnoCruzSiguienteX() throws Exception{

//1. Preparacion de la prueba



            System.out.println("==================================== "+ascensor);



//2. Logica de la prueba

            ascensor.jugar(1,3); //Jugador X



//3. Verificacion o Assert

            assertEquals('+',ascensor.siguienteTurno());



            ascensor.jugar(2,3); //Jugador +

            assertEquals('X',ascensor.siguienteTurno());

        }



        @Test

        public void cuandoNoHayGanador() throws Exception{

//1. Preparacion de la prueba



            System.out.println("==================================== "+ascensor);



//2. Logica de la prueba

            String resultado = ascensor.jugar(2,1); //Jugador X



//3. Verificacion o Assert

            assertEquals("No hay ganador aun",resultado);

        }



        @Test

        public void siLlenaFilaEntoncesGana() throws Exception{





//1. Preparacion de la prueba



            System.out.println("==================================== "+ascensor);



//2. Logica de la prueba

            ascensor.jugar(1,1); //Jugador X

            ascensor.jugar(1,2); //Jugador +

            ascensor.jugar(2,1); //Jugador X

            ascensor.jugar(2,2); //Jugador +



            String resultado = ascensor.jugar(3,1); //Jugador X



//3. Verificacion o Assert

            assertEquals("X es el ganador",resultado);

        }



        @Test

        public void siLlenaColumnaEntoncesGana() throws Exception{





//1. Preparacion de la prueba



            System.out.println("==================================== "+ascensor);



//2. Logica de la prueba

            ascensor.jugar(2,1); //Jugador X

            ascensor.jugar(1,1); //Jugador +

            ascensor.jugar(3,1); //Jugador X

            ascensor.jugar(1,2); //Jugador +

            ascensor.jugar(2,2); //Jugador X



            String resultado = ascensor.jugar(1,3); //Jugador +



//3. Verificacion o Assert

            assertEquals("+ es el ganador",resultado);

        }

    }


