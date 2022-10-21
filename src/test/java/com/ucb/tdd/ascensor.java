package com.ucb.tdd;

public class ascensor {

           private Character[][] tablero = {{'0', '0', '0'},

                {'0', '0', '0'},

                {'0', '0', '0'}};



/*

{{'+', 'X', 'X'},

      {'+', 'X', '0'},

      {'+', '0', '0'}};

* */



        private char ultimoJugador = '+';

        private final int SIZE=3;



        public String jugar(int x, int y ) throws Exception{



            verificarEje(x);

            verificarEje(y);



            ultimoJugador = siguienteTurno();

            asignarPosicion(x,y,ultimoJugador);



            if(hayGanador()) {

                return ultimoJugador + " es el ganador";

            }

            return "No hay ganador aun";

        }



        private boolean hayGanador() {

            int acumulado = ultimoJugador*SIZE;



            for(int index = 0; index < SIZE; index++) {

                if(tablero[0][index]+ tablero[1][index] + tablero[2][index] == acumulado) {

                    return true;

                }

                if(tablero[index][0]+ tablero[index][1] + tablero[index][2] == acumulado) {

                    return true;

                }

            }

            return false;

        }



        private void verificarEje(int eje) throws Exception{



            if(eje < 1 || eje >3) {

                throw new Exception("La coordenada "+eje+" esta fuera del cuadro");

            }

        }



        private void asignarPosicion(int x, int y, char ultimoJugador ) throws Exception{



            if(tablero[x-1][y-1]!='0') {

                throw new Exception("La posicion ya esta ocupada");

            } else {

                System.out.println("Asignando posicion: "+x+", "+y+" ultimoJugador: "+ultimoJugador);

                tablero[x-1][y-1] = ultimoJugador;

            }



        }



        public char siguienteTurno() {

            if(ultimoJugador == 'X') {

                return '+';

            }

            return 'X';

        }



    }