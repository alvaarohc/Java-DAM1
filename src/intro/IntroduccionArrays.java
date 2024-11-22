package intro;

import java.util.ArrayList;

public class IntroduccionArrays {
    public static void main(String[] args) {
        /*
         * Mover los números una posición a la derecha,
         * si es el último, se mueve al principio del array
         */
//        int[] nums = {1, 7, 14, 5};
//        rotarDerecha(nums);


        /*
         * Generar un array de números pares
         */
//        int[] arr = generarArray();
//        for (int i = 0; i < arr.length; i++) {
//            if (i == arr.length - 1 && arr[i] > 0) {
//                System.out.print(arr[i]);
//            } else if (arr[i] > 0) {
//                System.out.print(arr[i] + ", ");
//            }
//        }
//        System.out.print("]");

        /*
        * Devuelve un array de 9 posiciones con las veces que han
        * salido los números del 1 al 9 en 100 iteraciones.
        * Por lo que si cada número sale 10 veces (menos el 9 que sale 20)
        * el array sería -> [10, 10, 10, 10, 10, 10, 10, 10, 20]
        */
        int[] arr = calcularFrecuencia();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotarDerecha(int[] nums) {
        int[] newArr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                newArr[0] = nums[i];
            } else {
                newArr[i + 1] = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static int[] generarArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            int num = (int) (Math.random() * 51);

            if (num % 2 == 0) arr[i] = num;
        }

        return arr;
    }

    public static int[] calcularFrecuencia() {
        int[] arr = new int[9];
        for (int j = 0; j <= 100; j++) {
            int num = (int) (Math.random() * 9 + 1); // del 1 al 9
            arr[num - 1]++;
            /* Ejemplo:
             * num = 1 | Hay que introducir el valor en arr[0] (posición 0 == 1 ya qué los arrays empiezan en 0)
             * por lo que arr[0] = num - 1 = 1 - 1 = 0
             */
        }

        return arr;
    }
}
