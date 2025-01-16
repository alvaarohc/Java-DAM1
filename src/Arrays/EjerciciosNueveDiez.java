package Arrays;

import java.util.Scanner;

public class EjerciciosNueveDiez {
    public static void main(String[] args) {
        /* Ejercicio 9 */
        int[] arr = devolverMultiplos();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] != 0 ? arr[i] + " " : "");
        }
    }

    public static int[] devolverMultiplos() {
        int[] arr = new int[20];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            int num = (int) (Math.random() * 401);
            arr[i] = num;

        }
        for (int num : arr) { // Mostar array
            if (num == arr[0]) {
                System.out.print("[");
            }
            System.out.print(num + ", ");
            if (num == arr[arr.length - 1]) {
                System.out.print(num);
                System.out.println("]");
            }
        }

        System.out.print("Introduce de que número quieres los múltiplos (3, 5, 7): ");
        int multiplosDe = sc.nextInt();

        while (multiplosDe != 5 && multiplosDe != 3 && multiplosDe != 7) {
            System.out.print("Número no válido! Introduce de que número quieres los múltiplos (3, 5, 7): ");
            multiplosDe = sc.nextInt();
        }


        int[] numerosMultiplos = new int[arr.length];
        for (int i = 0; i < numerosMultiplos.length; i++) {
            if (arr[i] % multiplosDe == 0) {
                numerosMultiplos[i] = arr[i];
            }
        }

        return numerosMultiplos;
    }
}