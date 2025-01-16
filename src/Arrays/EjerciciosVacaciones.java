package Arrays;

import java.util.Scanner;

public class EjerciciosVacaciones {
    public static void main(String[] args) {
//        imprimirFrecuenciaParesImpares();
//        histogramaCalificaciones();
        invertirArraysConAuxiliares();
    }


    public static int[] calcularFrecuenciaParesImpares() {
        int[] arr = new int[2];

        for (int i = 0; i < 200; i++) {
            int rand = (int) (Math.random() * 98 + 1);

            if (rand % 2 == 0) {
                arr[0]++;
            } else {
                arr[1]++;
            }
        }

        return arr;
    }

    public static void imprimirFrecuenciaParesImpares() {
        int[] arr = calcularFrecuenciaParesImpares();
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println("Pares: " + arr[i]);
            } else System.out.println("Impares: " + arr[i]);
        }
    }

    public static void histogramaCalificaciones() {
        Scanner sc = new Scanner(System.in);
        float[] notas = new float[3];

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Introduce la nota (0-10): ");
            float nota = sc.nextFloat();
            if (nota > 10 || nota < 0) {
                System.out.print("Nota invalida, introduce de nuevo una nota del 0 al 10: ");
                nota = sc.nextFloat();
            }

            notas[i] = nota;
        }

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Calificación: " + notas[i] + " => ");
            for (int j = 0; j < (int) notas[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void invertirArraysConAuxiliares() {
        /* Constante para dar tamaño al array */
        final int NUM_PALABRAS = 6;

        Scanner sc = new Scanner(System.in);
        String[] palabras = new String[NUM_PALABRAS];
        String[] palabrasInvertido = new String[NUM_PALABRAS];

        for (int i = 0; i < palabras.length; i++) {
            System.out.print("Introduce la palabra " + (i + 1) + ": ");
            palabras[i] = sc.nextLine();
        }
        for (int i = palabras.length - 1; i >= 0; i--) {
            palabrasInvertido[(palabrasInvertido.length - 1) - i] = palabras[i];
            /*
             * Por ejemplo:
             * Digamos que i = 5,
             * lo que sería la primera ejecución del for(){}
             *
             * palabrasInvertido[(6 - 1) - 5] = palabras[5]
             * por lo que...
             * palabrasInvertido[0] = palabras[5]
             *
             * Y así hasta qué i = 0.
             */
        }

        imprimirArrayPalabras(palabras, "Antes de invertirlo");
        imprimirArrayPalabras(palabrasInvertido, "Después de invertirlo");
    }

    public static void imprimirArrayPalabras(String arr[], String titulo) {
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) System.out.println("--- " + titulo + " ---");
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
