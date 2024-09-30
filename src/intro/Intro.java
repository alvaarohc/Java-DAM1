package intro;

public class Intro {

    public static void main(String[] args) {
        stringMethods("informatica");
    }

    public static void stringMethods(String str) {
        /* SUBSTRING */
        System.out.println(str.substring(0, 5).toUpperCase() + str.substring(5)); // INFORmatica

        /* REPLACE */
        System.out.println(str.replace('a', 'i')); // informitici

        /* TRIM */
        String strWithSpaces = str + "     "; // "informatica     "
        System.out.println(strWithSpaces.trim()); // informatica

        
        /* ----- EJERCICIO ----- */
               /* INDEXOF */
        String prestamo = "101;Carlos López Díaz";
        String ID = prestamo.substring(0, prestamo.indexOf(";"));
        String nombreUsuario = prestamo.substring(prestamo.indexOf(";") + 1, prestamo.length());

        System.out.println(ID);
        System.out.println(nombreUsuario);
    }
}
