package Matrices;

import java.util.Scanner;

public class EjerciciosRefuerzo2 {
    public static void main(String[] args) {
//        contarElementosMayoresQueValorDado();
//        comprobarFilaHomogenea();
//        intercambiarDosFilas();
        comprobarMatrizSimetrica();
    }


    /*
     * Crea una matriz de tamaño 4x4 con números aleatorios entre 1 y 50.
     * Pide al usuario un número y muestra cuántos elementos de la matriz
     * son mayores que ese número.
     */
    public static void contarElementosMayoresQueValorDado() {
        int[][] matriz = new int[4][4];
        Scanner sc = new Scanner(System.in);
        int contadorMayores = 0;

        /* POBLAR LA MATRIZ */
        // Rows
        for (int i = 0; i < matriz.length; i++) {
            // Cols
            for (int j = 0; j < matriz[0].length; j++) {
                int num = (int) (Math.random() * 50 + 1);
                matriz[i][j] = num;
            }
        }

        System.out.print("Introduce un número a comprobar: ");
        int numComprobar = sc.nextInt();

        /* COMPROBAR NÚMEROS MAYORES EN LA MATRIZ */
        // Rows
        for (int i = 0; i < matriz.length; i++) {
            // Cols
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] > numComprobar) {
                    contadorMayores++;
                }
            }
        }

        System.out.println("Hay " + contadorMayores + " números mayores que " + numComprobar);
    }

    /*
     *  Crea una matriz de tamaño 3x4 con números entre 1 y 5. Determina
     *  si alguna fila contiene únicamente el mismo número (es homogénea)
     *  y muestra cuál es.
     * */
    public static void comprobarFilaHomogenea() {
        int[][] matriz = new int[3][4];

        /* POBLAR LA MATRIZ */
        // Rows
        for (int i = 0; i < matriz.length; i++) {
            // Cols
            int primerValorFila = 0;
            boolean homogenea = true;

            for (int j = 0; j < matriz[0].length; j++) {
                int num = (int) (Math.random() * 5 + 1);

                /* DESCOMENTAR "num = 1" PARA VER QUE FUNCIONA */
                // num = 1
                matriz[i][j] = num;

                if (j == 0) primerValorFila = num;

                if (primerValorFila != num) {
                    homogenea = false;
                }
            }

            if (homogenea) {
                System.out.println("La fila " + (i + 1) + " es homogenea.");
            }
        }

        Helpers.imprimirMatriz(matriz);
    }

    /*
     * Crea una matriz de 4x4 con números consecutivos empezando desde 1.
     * Pide al usuario dos números de fila (entre 1 y 4) e intercambia
     * esas dos filas en la matriz.
     * */
    public static void intercambiarDosFilas() {
        int[][] matriz = new int[4][4];
        int numConsecutivos = 1;
        int[] filasACambiar = new int[2];
        Scanner sc = new Scanner(System.in);

        /* POBLAR LA MATRIZ */
        // Rows
        for (int i = 0; i < matriz.length; i++) {
            // Cols
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = numConsecutivos++;
            }
        }

        Helpers.imprimirMatriz(matriz);

        for (int i = 0; i < 2; i++) {
            System.out.print("Introduce el número de la fila a cambiar [1, 4]: ");
            filasACambiar[i] = sc.nextInt();

            while (filasACambiar[i] > 4) {
                System.out.print("Numero fuera de rango! Introduce el número de la fila a cambiar [1, 4]: ");
                filasACambiar[i] = sc.nextInt();
            }
        }

        // Rows
        for (int i = 0; i < matriz.length; i++) {
            // Cols
            for (int j = 0; j < matriz[0].length; j++) {
                int prev = 0; // Almacena el valor de la fila cambiada para asignarlo a la otra

                /* En caso de estar en la fila que hay que cambiar
                 * entonces intercambiar los valores de esas filas
                 * */
                if (i == filasACambiar[0] - 1) {
                    prev = matriz[i][j];
                    matriz[i][j] = matriz[filasACambiar[filasACambiar.length - 1] - 1][j];
                    matriz[filasACambiar[filasACambiar.length - 1] - 1][j] = prev;
                } else {
                    break;
                }
            }
        }

        Helpers.imprimirMatriz(matriz);
    }

    /*
     * Crea una matriz cuadrada de 4x4 con valores dados. Verifica si es simétrica
     * (es decir, si la matriz es igual a su transpuesta).
     * */
    public static void comprobarMatrizSimetrica() {
        /*
        COPIA ESTA PARA COMPROBAR QUE NO ES SIMETRICA

        {1, 1, 1, 1},
        {2, 2, 2, 2},
        {3, 3, 3, 3},
        {4, 4, 4, 4},
        */

        // Es simetrica
        int[][] matriz = {
                {1, 5, -3, 9},
                {5, 0, 2, -1},
                {-3, 2, 8, 4},
                {9, -1, 4, 6},
        };
        int[][] matrizTranspuesta = new int[matriz.length][matriz[0].length];


        /* CREAR MATRIZ TRASPUESTA */
        for (int i = 0; i < matriz.length; i++) {
            int prev = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                prev = matriz[i][j];
                matrizTranspuesta[i][j] = matriz[j][i];
                matriz[j][i] = prev;
            }
        }

        Helpers.imprimirMatriz(matriz);
        Helpers.imprimirMatriz(matrizTranspuesta);

        /* COMPROBAR SIMETRIA */
        boolean simetrica = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] != matrizTranspuesta[i][j]) {
                    simetrica = false;
                    break;
                }
            }
            if (!simetrica) break;
        }

        if (simetrica) {
            System.out.println("La matriz mostrada a continuación es simetrica.");
        } else {
            System.out.println("La matriz mostrada a continuación no es simetrica.");
        }
        System.out.println("Antes de transponer");
        Helpers.imprimirMatriz(matriz);
        System.out.println("Después de transponer");
        Helpers.imprimirMatriz(matrizTranspuesta);

    }
}
