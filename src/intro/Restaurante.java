package intro;

import java.util.Scanner;

/**
 *
 * @author alvaro.hercol
 */
// CONDICIONALES
public class Restaurante {

    public static void main(String[] args) {
        restaurante();
    }

    public static void restaurante() {
        Scanner sc = new Scanner(System.in);

        boolean error = false;
        float total = 0.00f;

        System.out.println("¿Qué ha tomado de comer? (palmera, donut o tostada): ");
        String comida = sc.nextLine().trim().toLowerCase();
        System.out.println("¿Qué ha tomado de beber? (zumo o café): ");
        String bebida = sc.nextLine().trim().toLowerCase();
        System.out.println(bebida);

        // Comida
        switch (comida) {
            case "palmera":
                total += 1.40f;
                break;
            case "donut":
                total += 1.00f;
                break;
            case "tostada":
                System.out.println("Con que tomo la tostada (aceite o tortilla): ");
                String tostada = sc.nextLine().trim().toLowerCase();
                if (tostada.equals("aceite")) {
                    total += 1.20f;
                } else if (tostada.equals("tortilla")) {
                    total += 1.60f;
                } else {
                    System.out.println("Valor introducido para la tostada no valido.\nPorfavor, ejecute de nuevo.");
                    error = true;
                }
                break;
            default:
                System.out.println("Valor introducido para la comida no valido.\nPorfavor, ejecute de nuevo.");
                error = true;

        }

        // Bebida
        switch (bebida) {
            case "zumo":
                total += 1.50f;
                break;
            case "caf�":
                total += 1.20f;
                break;
            default:
                System.out.println("Valor introducido para la bebida no valido.\nPorfavor, ejecute de nuevo.");
                error = true;
        }

        if (!error) {  // Para evitar que impripa el total en caso de error
            System.out.println("El total a pagar es: " + total);
        }
    }

}
