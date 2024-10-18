package intro;

import java.util.Scanner;

/**
 *
 * @author alvaro.hercol
 */
public class Iteraciones {

    public static void main(String[] args) {
//        getNumberFactorial();
        throwCoin();
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

    public static void throwCoin() {
        int cara = 1;

        int caras = 0;
        int cruzes = 0;

        while (caras < 10) {
            int caraCruz = (int) (Math.random() * 2);
            if (caraCruz == cara) {
                caras++;
                System.out.println("Cara número " + caras);
            } else {
                cruzes++;
            }
        }

        System.out.println("FIN DEL PROGRAMA, HAN SALIDO " + cruzes + " CRUZES");
    }
}
