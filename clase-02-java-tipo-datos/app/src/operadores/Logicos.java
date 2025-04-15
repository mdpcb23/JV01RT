package operadores;

import javax.sound.midi.Soundbank;

public class Logicos {

    public static void main(String[] args) {
        boolean esMayorDeEdad = true;
        boolean tieneLicencia = false;

        System.out.println("Brian puede conducir en españa? " + (esMayorDeEdad && tieneLicencia)); //false AND

        System.out.println("Puede brian acceder a un evento ? " + (esMayorDeEdad || tieneLicencia)); // true OR

        System.out.println(" Negar las variables: " + (!tieneLicencia));
    }
}
