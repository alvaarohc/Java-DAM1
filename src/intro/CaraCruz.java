package intro;

import java.util.Scanner;

/**
 *
 * @author alvaro.hercol
 */
public class CaraCruz {

    public static void main(String[] args) {
        throwCoin(new Scanner(System.in), "Cuantas veces quieres tirar la moneda: ");
    }

    public static void throwCoin(Scanner sc, String message) {
        System.out.print(message);
        int tiradas = sc.nextInt();
        int tiradasInicio = tiradas;

        int totalCaras = 0;
        int totalCruzes = 0;

        while (tiradas > 0) {
            int caraCruz = (int) (Math.random() * 2);

            if (caraCruz == 1) {
                totalCaras++;
            } else {
                totalCruzes++;
            }
            tiradas--;
        }

        System.out.println("El total de caras en las "
                + tiradasInicio + " tiradas"
                + " ha sido: " + totalCaras);
        System.out.println("El total de cruzes en las "
                + tiradasInicio + " tiradas"
                + " ha sido: " + totalCruzes);

    }
}
