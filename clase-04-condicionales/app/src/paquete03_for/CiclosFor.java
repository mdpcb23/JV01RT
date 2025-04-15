package paquete03_for;

public class CiclosFor {
    //Bucle for
    // cual es su inicio
    //cual es la condicion de detencion
    //modificar la iteracion

    public static void main(String[] args) {


        //  inicio;   condicion; modificador
    /*    for (int indice = 0; indice < 5; indice++) {
            System.out.println("Estoy en la vuelta " + indice);
        }
*/


        //vectores
        String pelicula = "titanic";
        //                          0           1               2           3        4
        String[] peliculas = {"El padrino" , "Titanic" , "Interestelar" , "cars" , "cars 2" };

       /* String info = peliculas[3];

        System.out.println(info);*/

        for (int i = 0; i < 8; i++) {
            System.out.println("La pelicula en la posicion " + i + " es " + peliculas[i]);
        }

    }

}
