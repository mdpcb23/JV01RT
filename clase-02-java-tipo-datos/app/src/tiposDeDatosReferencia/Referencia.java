package tiposDeDatosReferencia;

import java.util.ArrayList;
import java.util.List;

public class Referencia {

    public static void main(String[] args) {
        // String = cadena de char "hola saludos"
        String nombre = "Brian Gomez";

        nombre = "Siham";

        String saludo = "como estas?";

        System.out.println(nombre + ", " + saludo);

        Integer numeroEnteros = 452785;

        // Coleccion
        List<String> frutas = new ArrayList<>(); // ["bananas", "manzana", "peras" ]
        frutas.add("Manzana");
        frutas.add("Banana");
        frutas.add("Pera");
        frutas.add("45"); // 45 --> "45"


        System.out.println("Frutas: " + frutas);

        DiaSemana dia = DiaSemana.SABADO;

        System.out.println("Hoy es: " + dia);

    }
}
