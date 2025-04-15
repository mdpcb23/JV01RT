package claseScanner;

import java.util.Scanner;

public class MiScanner {

    public static void main(String[] args) {

        /*ingrese un texto*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("por favor ingrese su nombre completo?");

        String nombreUsuario = scanner.nextLine();

        System.out.println("Hola, " + nombreUsuario);


        /*ingrese un numero*/
        System.out.println("Ingrese su edad?");
        int edad = scanner.nextInt();

        System.out.println(nombreUsuario + " tiene " + edad + " años.");
    }
}
