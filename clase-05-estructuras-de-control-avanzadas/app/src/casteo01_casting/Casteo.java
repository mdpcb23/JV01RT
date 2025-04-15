package casteo01_casting;

public class Casteo {

    public static void main(String[] args) {

        //casteo implicito
        int numeroEntero =  100; // posiblemente
        double numeroDouble = numeroEntero; // conversion automatica

        System.out.println("numero decimal: " + numeroDouble);

        //casteo explicito
        double numeroDecimal = 3.14;
        int numeroConvertido = (int) numeroDecimal;
        System.out.println(numeroConvertido);

        //numero a string
        int numero = 123;
        String numeroTexto = String.valueOf(numero);

        System.out.println(numeroTexto);

        //String a int
        String texto = "456";
        int numeroCambiado = Integer.parseInt(texto);
        System.out.println(numeroCambiado);

    }
}
