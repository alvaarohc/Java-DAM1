package Matrices;

public class Helpers {
    public static void imprimirMatriz(int[][] matriz) {
        System.out.println(); // Espacio por arriba
        System.out.println("===== Matriz =====");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%-4d", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println(); // Espacio debajo de la matriz
    }
    public static void imprimirMatrizStrings(String[][] matriz) {
        System.out.println(); // Espacio por arriba
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("%-4s", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println(); // Espacio debajo de la matriz
    }
}
