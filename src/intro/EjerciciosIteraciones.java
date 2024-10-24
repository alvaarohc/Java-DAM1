package intro;

import java.util.Scanner;

public class EjerciciosIteraciones {
    public static void main(String[] args) {
//        cajaFuerte();
//        tablaDeMultiplicarDeN();
        calcularMedia();
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

        System.out.println("La media de los " + contadorNumerosIntroducidos
                + " números que has introducido es: "
                + ((float) num / contadorNumerosIntroducidos));
    }
}
