package Matrices;

import java.util.Scanner;

public class EjerciciosRefuerzo {
    public static void main(String[] args) {
//        rellenarMatriz();
//        sumarFilasMatriz();
//        buscarValorMaximoMatriz();
//        transponerMatriz();
//        comprobarMatrizIdentidad();
//        sumarDiagonalPrincipal();
    }

    /*
     * Crea una matriz de tamaño MxN, donde M y N son introducidos por el usuario.
     * Rellena la matriz con los números del 1 al M*N,
     * y luego muestra la matriz en pantalla.
     * */
    public static void rellenarMatriz() {
        Scanner sc = new Scanner(System.in);
        int cols = 0;
        int rows = 0;

        // Preguntar por el tamaño de la matriz
        System.out.print("Introduce las columnas de la matriz: ");
        cols = sc.nextInt();
        System.out.print("Introduce las filas de la matriz: ");
        rows = sc.nextInt();

        int[][] matriz = new int[cols][rows];
        int num = cols * rows;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = num--;
            }
        }

        Helpers.imprimirMatriz(matriz);
    }

    /*
     * Crea una matriz cuadrada de 5x5 y rellénala con valores aleatorios
     * entre 1 y 10. Luego, calcula la suma de los elementos de cada fila
     * y muestra los resultados.
     */
    public static void sumarFilasMatriz() {
        int[][] matriz = new int[5][5];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 10 + 1);
            }
        }

        Helpers.imprimirMatriz(matriz);

        for (int i = 0; i < matriz.length; i++) {
            int sumFila = 0;
            for (int j = 0; j < matriz[0].length; j++) {
                sumFila += matriz[i][j];
                // Sí es el último valor entonces imprimir el total
                if (j == matriz[0].length - 1) {
                    System.out.println("La suma de la fila " + (i + 1) + " es: " + sumFila);
                }
            }
        }

    }

    /*
     * Crea una matriz cuadrada de 6x6 con números aleatorios entre 1 y 50.
     * Luego, busca y muestra el valor máximo y sus coordenadas.
     */
    public static void buscarValorMaximoMatriz() {
        int[][] matriz = new int[6][6];
        int max = 0;
        int cordCols = 0;
        int cordRows = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = (int) (Math.random() * 50 + 1);
                if (matriz[i][j] > max) {
                    max = matriz[i][j];
                    cordRows = i;
                    cordCols = j;
                }
            }
        }

        Helpers.imprimirMatriz(matriz);

        System.out.print("El valor máximo es " + max + " y se encuentra en la columna ");
        System.out.println((cordCols + 1) + " y fila " + (cordRows + 1));
    }

    /*
     * Crea una matriz cuadrada de 3x3 y realiza la transposición, es decir,
     * convierte las filas en columnas y viceversa.
     * Muestra la matriz transpuesta.
     **/
    public static void transponerMatriz() {
        int[][] matrizAux = new int[3][3];
        int[][] matriz = {
                /*0 1  2   */
                {1, 2, 3}, //0 [0][0] [0][1] [0][2]
                {4, 5, 6}, //1 [1][0] [1][1] [1][2]
                {7, 8, 9}  //2 [2][0] [2][1] [2][2]
        };

        Helpers.imprimirMatriz(matriz);

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizAux[i][j] = matriz[j][i];
                matrizAux[j][i] = matriz[i][j];
            }

        }
        Helpers.imprimirMatriz(matrizAux);
    }

    /*
     * Crea una matriz cuadrada de 3x3 y verifica si es una matriz identidad
     * (todos los elementos de la diagonal son 1 y el resto son 0).
     * */
    public static void comprobarMatrizIdentidad() {
        int[][] matriz = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };

        boolean esIdentidad = true;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][i] != 1) {
                    esIdentidad = false;
                    break;
                } else if (i != j && matriz[i][j] != 0) {
                    esIdentidad = false;
                    break;
                }
            }
            if (!esIdentidad) {
                System.out.println("La matriz: ");
                Helpers.imprimirMatriz(matriz);
                System.out.println("No es identidad.");
                break;
            }
        }

        if (esIdentidad) {
            System.out.println("La matriz: ");
            Helpers.imprimirMatriz(matriz);
            System.out.println("Es identidad.");
        }
    }

    /*
     *  Crea una matriz cuadrada de tamaño 4x4 con valores
     *  aleatorios entre 1 y 20. Calcula y muestra la suma
     *  de los elementos que se encuentran en la diagonal
     *  principal de la matriz.
     * */
    public static void sumarDiagonalPrincipal() {
        int[][] matriz = new int[4][4];
        int sum = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                int num = (int) (Math.random() * 20 + 1);
                matriz[i][j] = num;
                if (j == matriz.length - 1 - i) {
                    System.out.println(matriz[i][matriz.length - i - 1]);
                    sum += num;
                }
            }
        }

        Helpers.imprimirMatriz(matriz);
        System.out.println(sum);
    }

}
