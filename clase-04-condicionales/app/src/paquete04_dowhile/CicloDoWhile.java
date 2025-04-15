package paquete04_dowhile;

public class CicloDoWhile {

    public static void main(String[] args) {
        // que tu ciclo haga algo primero antes de ingresar al dicho ciclo
        int contador = 18;

        do {
           // lo que quiero haceer antes
            System.out.println("El contador tiene un valor de =" + contador);
            System.out.println("Hola brian");
            contador++;
        }while (contador < 10); // true verdadero

        System.out.println("Se salio");

        // la condicion que se tiene que cumplir para
        // ejecutar nuevamente el DO
    }
}
