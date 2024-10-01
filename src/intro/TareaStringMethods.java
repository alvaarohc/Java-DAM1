package intro;

/**
 *
 * @author alvaro.hercol
 */
public class TareaStringMethods {

    public static void main(String[] args) {
        ejercicio1("id01-María López" + "\n");
        ejercicio2("ID01-María López-dam1" + "\n");
        ejercicio3("ID01-María López-dam1" + "\n");
        System.out.println("---> Álvaro Hernández Colino <---");
    }

    public static void ejercicio1(String str) {
        int indexOfDash = str.indexOf("-"); // Indice del guion

        System.out.println("Ejercicio 1");
        System.out.println(
                str.substring(0, indexOfDash).toUpperCase()
                + str.substring(indexOfDash, str.length())
        ); // OUTPUT: "ID01-María López"
    }

    public static void ejercicio2(String str) {
        String[] dashSeparatedStrings = str.split("-");
        String newPhrase = "";
        int index = 0;

        for (String string : dashSeparatedStrings) {
            index++; // Indice para saber en que parte del array se encuentra

            if (index == dashSeparatedStrings.length) { // Si es la ultima ponlo en mayusculas
                newPhrase += string.toUpperCase();
            } else {
                newPhrase += string + "-";
            }

        }

        System.out.println("Ejercicio 2");
        System.out.println(newPhrase); // OUTPUT: "ID01-María López-DAM1"
    }

    public static void ejercicio3(String str) {
        String[] dashSeparatedStrings = str.split("-");

        String id = dashSeparatedStrings[0];
        String nombre = dashSeparatedStrings[1];
        String ciclo = dashSeparatedStrings[dashSeparatedStrings.length - 1];

        System.out.println("Ejercicio 3");
        System.out.println(
                "id: " + id
                + "\nnombre: " + nombre
                + "\nciclo: " + ciclo
        );
        /* 
            OUTPUT:    
            id: ID01          
            nombre: María López
            ciclo: dam1
         */
    }

}
