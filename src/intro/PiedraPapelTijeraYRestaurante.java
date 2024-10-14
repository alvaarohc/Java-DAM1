package intro;

import java.util.Scanner;

/**
 *
 * @author alvaro.hercol
 */
public class PiedraPapelTijeraYRestaurante {

    public static void main(String[] args) {
//        piedraPapelTijera();
        restaurante();
    }

    public static Scanner newScanner() {
        Scanner sc = new Scanner(System.in);
        return sc;
    }

    public static void piedraPapelTijera() {
        Scanner sc = newScanner();

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugador1 = sc.nextLine().trim().toLowerCase();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String jugador2 = sc.nextLine().trim().toLowerCase();

        if (jugador1.equals(jugador2)) {
            System.out.println("Empate!");
        } else if (jugador1.equals("tijera") && jugador2.equals("papel")) {
            System.out.println("Gana el jugador 1");
        } else if (jugador1.equals("papel") && jugador2.equals("tijera")) {
            System.out.println("Gana el jugador 2");
        } else if (jugador1.equals("piedra") && jugador2.equals("tijera")) {
            System.out.println("Gana el jugador 1");
        } else if (jugador1.equals("tijera") && jugador2.equals("piedra")) {
            System.out.println("Gana el jugador 2");
        } else if (jugador1.equals("tijera") && jugador2.equals("piedra")) {
            System.out.println("Gana el jugador 2");
        } else if (jugador1.equals("papel") && jugador2.equals("piedra")) {
            System.out.println("Gana el jugador 1");
        } else if (jugador1.equals("piedra") && jugador2.equals("papel")) {
            System.out.println("Gana el jugador 2");
        } else {
            System.out.println("Valor introducido no valido.\nPorfavor, ejecute de nuevo.");
        }
    }

    public static void restaurante() {
        Scanner sc = newScanner();

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
