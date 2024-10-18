package intro;

import java.util.Scanner;

/**
 *
 * @author alvaro.hercol
 */
public class PiedraPapelTijera {

    public static void main(String[] args) {
        piedraPapelTijera();
    }

    public static void piedraPapelTijera() {
        Scanner sc = new Scanner(System.in);

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

}
