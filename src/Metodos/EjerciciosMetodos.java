package Metodos;

import java.util.Scanner;

public class EjerciciosMetodos {
    public static void main(String[] args) {
        menuOpciones();
    }

    static float calcularPerimetroCircunferencia(float rad) {
        return (2 * (float) Math.PI) * rad;
    }

    static void esPar(int num) {
        if (num % 2 == 0) {
            System.out.println("Es par");
        } else System.out.println("Es impar");

    }

    static boolean devolverEsPar(int num) {
        return num % 2 == 0;
    }

    static void calcularCubo(int num) {
        System.out.println("El cubo de " + num + " es: " + (int) Math.pow(num, 3));
    }

    static void calcularCuadrado(int num) {
        System.out.println("El cuadrado de " + num + " es: " + (int) Math.pow(num, 2));
    }

    static int multiplicarNumeros(int num1, int num2) {
        return num1 * num2;
    }

    static void calcularTablaMultiplicar(int num) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }


    static void menuOpciones() {
        boolean salir = false;
        do {
            crearMenu();
            int opcion = pedirOpcionUsuario();
            Scanner sc = new Scanner(System.in);

            switch (opcion) {
                case 1:
                    System.out.print("Introduce un número para calcular el cuadrado: ");
                    calcularCuadrado(sc.nextInt());
                    break;
                case 2:
                    System.out.print("Introduce un número para calcular el cubo: ");
                    calcularCubo(sc.nextInt());
                    break;
                case 3:
                    System.out.print("Introduce un número para calcular la tabla de multiplicar: ");
                    calcularTablaMultiplicar(sc.nextInt());
                    break;
                default:
                    System.out.println("Saliendo...");
                    salir = true;
            }

            System.out.println("\n"); // Espacio
        } while (!salir);
    }

    static void crearMenu() {
        System.out.println("|-----------------------------------|");
        System.out.println("| Selecciona una opcion entre 1 y 4 |");
        System.out.println("|-----------------------------------|");
        System.out.println("| 1 - Mostrar cuadrado              |");
        System.out.println("| 2 - Mostrar cubo                  |");
        System.out.println("| 3 - Mostrar tabla multiplicar     |");
        System.out.println("| 4 - Salir                         |");
        System.out.println("|-----------------------------------|");
    }

    static int pedirOpcionUsuario() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una opcion [1, 4]: ");
        return sc.nextInt();
    }
}
