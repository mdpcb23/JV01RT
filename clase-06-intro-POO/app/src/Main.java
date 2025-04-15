import entidades.Auto;

public class Main {
    public static void main(String[] args) {

        // vamos a crear un objeto = auto
        Auto ferrari = new Auto("rojo", "Ferrari", 250);

        Auto ford = new Auto("Negro", "Ford", 120);

        Auto bmw = new Auto();

       /* ford.setColor("Azul");
        System.out.println(ford.getColor());*/

        bmw.setColor("Blanco");
        bmw.setMarca("BMW");
        bmw.setVelocidad(200); // se guardo dentro de la memoria de mi computadora

        bmw.acelerar(30);
        bmw.acelerar(20); //250

        /*System.out.println("La nueva velocidad es " + bmw.getVelocidad());*/

        bmw.frenar();
        bmw.frenar();

        System.out.println("el auto freno y la nueva velocidad es : " + bmw.getVelocidad());
    }
}