package Matrices;

import java.util.Random;

public class HundirLaFlota {
    /* SNIPETS */
   /*
        separar coordenadas X e Y

        String string = "A0";
        String[] split = string.split("");

        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
        */


    public static void main(String[] args) {
        generarTablero();
        colocarBarco();
    }

    static String[][] tablero = new String[11][11];
    static String letra = "A";

    // Incrementa el valor de letra con usando codigos ASCII
    public static void incrementarLetra() {
        char letraActual = letra.charAt(0);
        letraActual++;
        if (letraActual > 'Z') {
            letraActual = 'A';
        }
        letra = String.valueOf(letraActual);
    }

    public static void generarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                if (j >= 1 && i == 0) {
                    tablero[i][j] = Integer.toString(j);
                } else if (i >= 1 && j == 0) {
                    tablero[i][j] = letra;
                    incrementarLetra();
                } else {
                    tablero[i][j] = "0";
                }
                tablero[0][0] = " ";
            }
        }
        Helpers.imprimirMatrizStrings(tablero);
    }

    public static void colocarBarco() {

    }
}
