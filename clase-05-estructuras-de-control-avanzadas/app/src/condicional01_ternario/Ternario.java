package condicional01_ternario;

public class Ternario {

    public static void main(String[] args) {
        //TipoDato variable = condición ? valor_si_verdadero : valor_si_falso;

        int numero = 4;
        String mensajeDelNumero = (numero > 0) ? "Es Positivo" : "Es Negativo o cero";

      /*  System.out.println("Ejemplo ternario: " + mensajeDelNumero);*/

        //determinar si un numero es par o impar
        int numeroPar = 45;

        String msj = (numeroPar % 2 == 0) ? "Par" : "Impar";

        System.out.println(msj);

    }
}
