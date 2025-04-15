package paquete01_condicionales;

import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu estatura");
        double estatura = scanner.nextDouble();



        if (estatura >= 1.50){
            // si se cumple la estatura

            if (estatura <= 1.95){
                System.out.println("Puede subirte al juego");
            }else {
                System.out.println("Si bien cumples la la estatura min no cumples con las maxima");
            }
        }else {
            System.out.println("Ingresa tu edad");
            int edad = scanner.nextInt();

            if (edad <= 12){
                System.out.println("Puedes jugar con los inflables");
            }else{
                System.out.println("Puedes acceder a un partido de futbol");
            }
        }




  /*      if( estatura >= 1.50){
            System.out.println("El niño puede subirse al juego");
        }else{
            System.out.println("No puede subirse al juego");
        }*/

    }
}
