package intro;

import java.util.Scanner;

/**
 *
 * @author alvaro.hercol
 */
public class CaraCruz {

    public static void main(String[] args) {
        // Dos argumentos, el scanner y un mensaje
        throwCoin(new Scanner(System.in), "Cuantas veces quieres tirar la moneda: ");
    }

    public static void throwCoin(Scanner sc, String message) {
        System.out.print(message);
        int tiradas = sc.nextInt();
        int tiradasInicio = tiradas; // Guarda las tiradas antes de modificar su valor en el while para luego imprimirlo

        // Contadores
        int totalCaras = 0;
        int totalCruzes = 0;

        while (tiradas > 0) {
            int caraCruz = (int) (Math.random() * 2); // Entre 0 y 1 (por que el ultimo valor no es incluido, en este caso 2)

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
