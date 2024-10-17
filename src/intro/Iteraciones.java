package intro;

import java.util.Scanner;

/**
 *
 * @author alvaro.hercol
 */
public class Iteraciones {

    public static void main(String[] args) {
        getNumberFactorial();
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
}
