package intro;

public class StringMethods {

    public static void main(String[] args) {
        substringString("informatica");
        trimString("informatica");
        replaceString("informatica");
        indexOfString("101;Carlos López Díaz");
    }

    public static void substringString(String str) {
        System.out.println("substring: " + str.substring(0, 5).toUpperCase() + str.substring(5)); // OUTPUT: "INFORmatica"
    }

    public static void trimString(String str) {
        String strWithSpaces = "- " + str + " -"; // "- informatica -"
        System.out.println("trim: " + strWithSpaces.trim()); // OUTPUT: "-informatica-"
    }

    public static void replaceString(String str) {
        System.out.println("replace: " + str.replace('a', 'i')); // OUTPUT: "informitici"
    }

    public static void indexOfString(String str) {
        String ID = str.substring(0, str.indexOf(";"));
        String nombreUsuario = str.substring(str.indexOf(";") + 1, str.length());

        System.out.println("indexOf: " + ID); // OUTPUT: "101"
        System.out.println("indexOf: " + nombreUsuario); // OUTPUT: "Carlos López Díaz"
    }

}
