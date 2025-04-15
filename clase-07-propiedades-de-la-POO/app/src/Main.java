import poo_01_encapsulamiento.AutoProtected;
import poo_02_abstraccion.Auto;
import poo_03_herencia.AutoDeportivo;
import poo_04_polimorfismo.Camion;

public class Main {
    public static void main(String[] args) {

        //todo: encapsulamiento
       /* AutoProtected.
        AutoProtected.main(null);*/

        //todo: abstraccion
        Auto miAuto = new Auto();

        Auto autoConParametros = new Auto("toyota", "corolla", "negro", 0);
        Auto camion = new Auto("volvo", "M3", "blanco", 0);

        camion.acelerar();
        camion.acelerar();

       /* System.out.println("La velocidad del camion " + camion.getVelocidad());*/

        //todo: herencia
        AutoDeportivo ferrari = new AutoDeportivo();

        ferrari.setVelocidad(0);


        System.out.println(ferrari.acelerar());

        //todo: Polimorfismo
        Camion camionBasura = new Camion();


    }
}