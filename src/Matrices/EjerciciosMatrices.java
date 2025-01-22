package Matrices;

import java.util.Scanner;

public class EjerciciosMatrices {
    public static void main(String[] args) {
        hojaCalculo();
    }

    public static void hojaCalculo() {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        /* Llenar la matriz */
        // Cols
        for (int i = 0; i < matriz.length; i++) {
            // Rows
            int sum = 0;
            for (int k = 0; k < matriz[0].length; k++)
                if (k < matriz[0].length - 1) {
                    System.out.print("Introduce el número " + (k + 1) + ": ");
                    int num = sc.nextInt();

                    sum += num;
                    System.out.println(sum);
                    matriz[i][k] = num;
                } else {
                    matriz[i][k] = sum;
                    System.out.println(matriz[i][k] + " SUMA ");
                }
            }
        }


        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }

    }


}


