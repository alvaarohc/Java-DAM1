/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intro;

import java.util.Scanner;

/**
 *
 * @author alvaro.hercol
 */
public class OperadorTernario {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Introduce a: ");
//        int a = sc.nextInt();
//        System.out.print("Introduce b: ");
//        int b = sc.nextInt();
//
//        int numeroMayor = a > b ? a : b;
//
//        System.out.println("El numero mayor es: " + numeroMayor);

        int nota = 5;
        String notaCadena = nota >= 5 ? "aprobado" : "suspenso";
        System.out.println(notaCadena);
    }
}
