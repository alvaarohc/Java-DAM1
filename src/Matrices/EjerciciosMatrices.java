package Matrices;

import java.util.Scanner;

public class EjerciciosMatrices {
    public static void main(String[] args) {
        hojaCalculo();
    }

    public static void hojaCalculo() {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int totalCols = 0;
        int totalRows = 0;

        /* Llenar la matriz */

        // Cols
        for (int cols = 0; cols < matriz.length; cols++) {
            int sumRows = 0;

            if (cols < matriz.length - 1) { // Para no llenar la ultima columna
                for (int rows = 0; rows < matriz[0].length; rows++) { // Rows
                    if (rows < matriz[0].length - 1) {
                        System.out.print("Introduce el número para la columna " + (cols + 1) + " y fila " + (rows + 1) + ": ");
                        int num = sc.nextInt();

                        sumRows += num;
                        System.out.println(sumRows);
                        matriz[cols][rows] = num;
                    } else {
                        matriz[cols][rows] = sumRows;
                        totalRows += sumRows;
                    }
                }
            }
        }

        for (int rows = 0; rows < matriz[0].length; rows++) {
            int sumCols = 0;

            if (rows < matriz.length - 1) {
                for (int cols = 0; cols < matriz.length; cols++) { // Rows
                    if (cols < matriz[0].length - 1) {
                        System.out.println("valor" + matriz[cols][rows]);
                        sumCols += matriz[cols][rows];
                        System.out.println("despues de suma" + sumCols);
                    } else {
                        System.out.println(matriz[cols][rows] + " SUMA ");
                        matriz[cols][rows] = sumCols;
                        totalCols += sumCols;
                    }
                }
            }
        }

        // Asignar la suma total de las filas y columnas al ultimo valor de la matriz
        matriz[matriz.length - 1][matriz[0].length - 1] = totalCols + totalRows;

        // Imprimir matriz completa
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }
}




