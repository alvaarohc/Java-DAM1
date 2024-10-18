package intro;

import java.util.Scanner;

/**
 *
 * @author alvaro.hercol
 */
public class Iteraciones {

    public static void main(String[] args) {
//        getNumberFactorial();
        throwCoin(new Scanner(System.in), "Cuantas veces quieres tirar la moneda: ");
    }

    public static void getNumberFactorial() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to calculate its factorial (x!): ");

        int number = sc.nextInt();
        int factorial = number;

        while (number > 2) {
            number--;
            factorial *= number;

            if (number == 2) {
                System.out.println(factorial);
            }

        }
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
