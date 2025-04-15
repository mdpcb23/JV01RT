package clase_03_matrices;

import java.util.Scanner;

public class Matrices {

    public static final int ITERACION_MATRIZ = 3;

    public static void main(String[] args) {

        int[] vector = {};

       // ITERACION_MATRIZ =4;

        int[][] edades = new int[ITERACION_MATRIZ][ITERACION_MATRIZ];

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las edades de la matriz");

        //rellenar la matriz
        for (int fila = 0; fila < ITERACION_MATRIZ; fila++) {
            for (int columna = 0; columna < ITERACION_MATRIZ; columna++) {
                edades[fila][columna] = scanner.nextInt();
            }
        }

        for (int fila = 0; fila < ITERACION_MATRIZ; fila++) {
            for (int columna = 0; columna < ITERACION_MATRIZ; columna++) {

                System.out.println("Estoy en la fila " + (fila + 1) + " y en la columna " + (columna + 1) + " y su valor es " + edades[fila][columna]);
            }
        }

    }
}
