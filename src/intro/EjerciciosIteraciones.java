package intro;

import java.util.Scanner;

public class EjerciciosIteraciones {
    public static void main(String[] args) {
//        cajaFuerte();
//        tablaDeMultiplicarDeN();
//        calcularMedia();
//        numeroCuadradoCubo();
//        nPrimerosTerminosFibonacci();
//        negativoPositivo();
//        esNumeroPrimo();
//        dibujarPiramide();
//        dibujarPiramideHueca();
//        dibujarPiramideSerieNumeros();
//        darVueltaNumero();
//        dibujarL();
//        dibujarLForAnidado();a
        dibujarU();
    }

    public static void cajaFuerte() {
        Scanner sc = new Scanner(System.in);

        final int CLAVE_ACCESO = 1234;
        final int MAX_FALLOS = 4;

        int intentosFallidos = 0; // Contador de fallos

        while (intentosFallidos < MAX_FALLOS) {
            System.out.print(intentosFallidos == 0 ? "Bienvenido, introduce la contraseña para acceder al sistema: " : "Intentelo de nuevo: ");
            // Double para que no se rompa el programa en caso de meter muchos números
            double claveIntroducida = sc.nextDouble();


            if (claveIntroducida == CLAVE_ACCESO) {
                System.out.println("Accediendo al sistema...");
                break;
            }

            // De no ser la clave
            if (Double.toString(claveIntroducida).length() > 4)
                System.out.println("La contraseña debe contener máximo cuatro caracteres");
            intentosFallidos++;
            System.out.println("La contraseña no es correcta, le quedan " + (MAX_FALLOS - intentosFallidos) + " intentos.");
        }

        // Al sobrepasar los MAX_FALLOS
        if (intentosFallidos == MAX_FALLOS)
            System.out.println("Ha sobrepasado el número máximo de intentos, llame a un administrador para desbloquear el sistema.");
    }

    public static void tablaDeMultiplicarDeN() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número para calcular su tabla de multiplicar: ");
        int num = sc.nextInt();

        System.out.println("La tabla de multiplicar de " + num + " es:");

        for (int i = 1; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }

    public static void calcularMedia() {
        Scanner sc = new Scanner(System.in);

        int contadorNumerosIntroducidos = 0;
        int num = 0;

        while (num >= 0) {
            if (contadorNumerosIntroducidos > 0) {
                System.out.print("Introduce otro número, si ya están todos introduce -1: ");
            } else {
                System.out.print("Introduce un número: ");
            }


            int userInput = sc.nextInt();
            if (userInput < 0) break; // Si introduce -X salir
            contadorNumerosIntroducidos++;
            num += userInput;
        }

        System.out.println("La media de los " + contadorNumerosIntroducidos + " números que has introducido es: " + ((float) num / contadorNumerosIntroducidos));
    }

    public static void numeroCuadradoCubo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el número de inicio: ");
        int numIninicio = sc.nextInt();

        for (int i = numIninicio; i > 0; i--) {
            System.out.println(numIninicio + " | " + (int) Math.pow(numIninicio, 2) + " | " + (int) Math.pow(numIninicio, 3));

            numIninicio--;
        }
    }

    public static void nPrimerosTerminosFibonacci() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos términos quieres que muestre el programa: ");
        int cantidad = sc.nextInt();
        int val = 0;
        int val1 = 1;
        int sum = 0;

        for (int i = 0; i < cantidad; i++) {
            System.out.println(sum); // Imprime el siguiente termino
            sum = val + val1; // Calcula el siguiente PUTO FIBONACCI
            val = val1; // Mueve el valor del primero al anterior
            val1 = sum; // Asigna el anterior valor del BAUTISTA de FIBONACCI al primer valor
        }
    }

    public static void negativoPositivo() {
        Scanner sc = new Scanner(System.in);

        int positivo = 0;
        int negativo = 0;

        for (int i = 1; i < 11; i++) {
            System.out.println("Introduce el número " + i + ": ");
            int num = sc.nextInt();

            if (num >= 0) {
                positivo++;
            } else negativo++;
        }

        System.out.println("Ha introducido " + positivo + " números positivos y " + negativo + " negativos");
    }

    public static void esNumeroPrimo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        System.out.println("El número " + num + (count == 2 ? " es primo" : " no es primo"));
    }

    public static void dibujarPiramide() {
        Scanner sc = new Scanner(System.in);

        // Altura
        System.out.print("Introduce la altura: ");
        int height = sc.nextInt();

        // Carácter
        System.out.print("Introduce el carácter que forma la pirámide: ");
        String character = sc.next();

        int charNum = 0;

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j < height - charNum; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < charNum * 2 + 1; j++) {
                System.out.print(character);
            }
            charNum++;
            System.out.println();
        }
    }

    public static void dibujarPiramideHueca() {
        Scanner sc = new Scanner(System.in);

        // Altura
        System.out.print("Introduce la altura: ");
        int height = sc.nextInt();

        // Carácter
        System.out.print("Introduce el carácter que forma la pirámide: ");
        String character = sc.next();

        for (int i = 0; i < height; i++) { // Da altura a la pirámide
            for (int j = 0; j < height - i; j++) { // Espacios laterales
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) + 1; k++) {  // Imprime el carácter o un espacio o la última línea de carácteres
                if (k == 0 || k == (i * 2 + 1) - 1) {
                    System.out.print(character);
                } else if (i == height - 1) {
                    System.out.print(character);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void dibujarPiramideSerieNumeros() {
        Scanner sc = new Scanner(System.in);


        // Carácter
        System.out.print("Introduce el numero que forma serie de la pirámide: ");
        int num = sc.nextInt();

        int spaceNum = 0;

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < num - spaceNum; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            spaceNum++;
            System.out.println();
        }
    }

    public static void darVueltaNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        int newNum = 0;

        while (num > 0) {
            int digit = num % 10; // Extrae el último dígito, ya que el resto de X / 10 siempre es el último número
            newNum = num * 10 + digit; // Al multiplicarlo por 10 se obtiene la posición en la que va.
            num /= 10; // Quita el ultimo digito.
        }

        System.out.println(newNum);
    }

    public static void dibujarL() {
        for (int i = 0; i < 4; i++) {
            System.out.println("*");
        }
        for (int i = 0; i < 3; i++) {
            System.out.print("* ");
        }
    }

    public static void dibujarLForAnidado() {
        for (int i = 0; i < 4; i++) {
            System.out.println("*");
            if (i == 3) {
                for (int j = 0; j < 3; j++) {
                    System.out.print("* ");
                }
            }
        }
    }

    public static void dibujarU() {
        int altura = 5;
        for (int i = 0; i < altura - 1; i++) {
            System.out.print("*");
            for (int j = 0; j < altura - 2; j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        }

        for (int i = 0; i < altura - 3; i++) {
            System.out.print(" *");
        }
    }
}
