package intro;

import java.util.Scanner;

public class IntroduccionArrays {
    public static void main(String[] args) {
        /*
         * Mover los números una posición a la derecha,
         * si es el último, se mueve al principio del array
         */
//        int[] nums = {1, 7, 14, 5};
//        rotarDerecha(nums);

        /*
         * Devuelve un array de 9 posiciones con las veces que han
         * salido los números del 1 al 9 en 100 iteraciones.
         * Por lo que si cada número sale 10 veces (menos el 9 que sale 20)
         * el array sería -> [10, 10, 10, 10, 10, 10, 10, 10, 20]
         */
//        int[] arr = calcularFrecuencia();
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        graficoTemperaturasMediasPorMeses();

//        rellenarArrayYMostrarMinMax();
        generearDiezNumerosYPedirUno();
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

    public static void graficoTemperaturasMediasPorMeses() {
        Scanner sc = new Scanner(System.in);
        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre",};
        float[] temperaturas = new float[12];
        final String NOMBRE_EJE_X = "Cº"; // "final" para que sea una constante
        final String NOMBRE_EJE_Y = "Mes del año";
        int maxTemp = 0;


        for (int i = 0; i < meses.length; i++) {
            System.out.print("Introduce la temperatura media de " + meses[i] + ": ");
            temperaturas[i] = sc.nextFloat();
        }
        System.out.println();

        for (float temperatura : temperaturas) { // Sacar la temperatura máxima a representar
            if (temperatura > maxTemp) maxTemp = (int) temperatura;
        }
        final int NUM_SEPARADORES = 12 + (maxTemp * 4);

        System.out.print(NOMBRE_EJE_Y);
        for (int j = 0; j < 12 - NOMBRE_EJE_Y.length(); j++) {
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < NUM_SEPARADORES; i++) {
            if (i == 12) System.out.print("|");
            System.out.print("-");
        }
        System.out.println();

        for (int i = 0; i < meses.length; i++) {
            System.out.print(meses[i]);
            for (int j = 0; j < 12 - meses[i].length(); j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            // Math.floor(temperaturas[i]) + 1, pq 0º también es representado entonces necesitamos un valor más
            for (int j = 0; j < Math.floor(temperaturas[i]) + 1; j++) {
                System.out.print("  *");
            }
            System.out.println();
        }

        // Imprimir el eje X (las temperaturas)
        /*
         * Imprimo la separación del eje primero, luego el símbolo y los espacios,
         * después la barra de separación, y por último las temperaturas.
         */
        for (int i = 0; i < NUM_SEPARADORES; i++) {
            if (i == 12) System.out.print("|");
            System.out.print("-");
        }
        System.out.println();
        System.out.print(NOMBRE_EJE_X);
        for (int j = 0; j < 12 - NOMBRE_EJE_X.length(); j++) {
            System.out.print(" ");
        }
        System.out.print("|");
        for (int i = 0; i <= maxTemp + 4; i++) {
            if (i < 10) {
                System.out.print(" 0" + i);
            } else {
                System.out.print(" " + i);
            }
        }
    }

    /**
     * @param arr    el array a iterar
     * @param maxVal el valor máximo posible almacenado
     * @return el valor más pequeño
     */
    public static int buscarMin(int[] arr, int maxVal) {
        int minVal = maxVal;

        for (int num : arr) {
            if (num < minVal) minVal = num;
        }

        return minVal;
    }

    /**
     * @param arr el array a iterar
     */
    public static int buscarMax(int[] arr) {
        int maxVal = 0;

        for (int num : arr) {
            if (num > maxVal) maxVal = num;
        }

        return maxVal;
    }

    /**
     * @param arr        el array a iterar
     * @param min        valor min
     * @param max        valor max
     * @param mostrarMin boolean, mostrar o no el mínimo
     * @param mostrarMax boolean, mostrar o no el máximo
     */
    public static void imprimirArrayFormateado(int[] arr, int min, int max, boolean mostrarMin, boolean mostrarMax) {
        int counter = 0;

        System.out.println("[");
        for (int i = 0; i < arr.length; i++) {
            if (mostrarMin && arr[i] == min) {
                System.out.print("-->" + arr[i] + "<--" + ", ");
            } else if (mostrarMax && arr[i] == max) {
                System.out.print("-->" + arr[i] + "<--" + ", ");
            } else {
                System.out.print(arr[i] + ", ");
            }

            if (counter == 6) { // Saltos de línea cada 6 números
                counter = 0;
                System.out.println();
            }

            counter++;
        }
        System.out.println("]");
    }

    // Solo imprimir el array con formato
    public static void imprimirArrayFormateadoSinMinMax(int[] arr) {
        imprimirArrayFormateado(arr, 0, 0, false, false);
    }

    public static void rellenarArrayYMostrarMinMax() {
        final int NUM_ELEMENTOS = 100;
        int[] arr = new int[NUM_ELEMENTOS];
        final int MAX_VAL = 500;


        for (int i = 0; i < arr.length; i++) { // Llenar el array
            int num = (int) (Math.random() * 501);
            arr[i] = num;
        }

        imprimirArrayFormateadoSinMinMax(arr);
        final int MIN = buscarMin(arr, MAX_VAL);
        final int MAX = buscarMax(arr);

        // Preguntar si quiere el mínimo y el máximo y mostrarlo
        Scanner sc = new Scanner(System.in);
        System.out.print("Quieres mostrar el valor mínimo o máximo (min, max): ");
        String mostrar = sc.nextLine().toLowerCase();

        System.out.println("(" + mostrar + ") -> De acuerdo, mostrando valores...");

        if (mostrar.equals("max")) {
            imprimirArrayFormateado(arr, MIN, MAX, false, true);
            System.out.println("(" + mostrar + ") -> Finalizando programa...");
        } else if (mostrar.equals("min")) {
            imprimirArrayFormateado(arr, MIN, MAX, true, false);
            System.out.println("(" + mostrar + ") -> Finalizando programa...");
        } else {
            System.out.println("Valor invalido!\nPor favor, ejecuta de nuevo e introduce 'si' o 'no'.");
        }
    }

    public static void generearDiezNumerosYPedirUno() {
        Scanner sc = new Scanner(System.in);
        boolean estaEnArray = false;
        int[] arr = new int[10];


        for (int i = 0; i < arr.length; i++) {
            int num = (int) (Math.random() * 101);
            arr[i] = num;
        }

        System.out.print("Introduzca un número del 0 al 100: ");
        int num = sc.nextInt();

        for (int arrNum : arr) {
            if (arrNum == num) estaEnArray = true;
        }

        if (estaEnArray) {
            System.out.println("El numero " + num + " si se encuentra en el array");
        } else System.out.println("El numero " + num + " no se encuentra en el array");


    }
}
