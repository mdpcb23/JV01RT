


import utilidades.Calculadora;
import utilidades.ModificarTextos;

import java.util.Scanner;


public class Main {

    // esta funcion lo que hace es ..............
    public static void main(String[] args) { // metodo o funcion

       /* Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        double numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo numero");
        double numero2 = scanner.nextDouble();

        System.out.println("Ingrese el tercer numero");
        double numero3 = scanner.nextDouble();

        double resultado  = Calculadora.sumarDoubles(numero1, numero2);
        long resultadoLong = Calculadora.sumarLong(45245455455L, 4512455L);

        System.out.println("El resultado es " + resultadoLong);*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un texto");

        String textoIngresado = scanner.nextLine();

        System.out.println(ModificarTextos.convertirAMiniscula(textoIngresado));



    }




}