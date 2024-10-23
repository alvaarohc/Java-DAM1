package intro;

/**
 * @author alvaro.hercol
 */
public class Bucles {

    public static void main(String[] args) {
        // drawSquare();
        // escribirTablasMultiplicar(5);
        contadorParImpar();
    }

    public static void drawSquare() {
        int num = 6;
        int i = 1;
        int o = 1;

        while (i <= num) {
            while (o <= num) {
                System.out.print(i + " ");
                o++;
            }
            System.out.println();
            i++;
            o = 1;
        }
    }

    public static void escribirTablasMultiplicar(int num) {
        int i = 1;
        int j = 1;
        while (i <= num) {
            System.out.println("Tabla del " + i);
            while (j <= 10) {
                System.out.println(i + " * " + j + " = " + i * j + " ");
                j++;
            }
            System.out.println("------------\n");
            j = 1;
            i++;
        }
    }

    public static void contadorParImpar() {
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 20; i++) {
            int num = (int) (Math.random() * 50) + 1;

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Números pares: " + pares);
        System.out.println("Números impares: " + impares);
    }
}
