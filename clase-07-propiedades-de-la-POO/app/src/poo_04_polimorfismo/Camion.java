package poo_04_polimorfismo;

import poo_02_abstraccion.Auto;

public class Camion extends Auto implements Basurero, Gasolinero {

    // extends = solo se puede heraedar de una clase
    // implements = se puede implementar metodos de muchas interfaces

    @Override
    public String acelerar() {
        return "El camion esta acelerando , pero mucho mas lento por el peso";
    }

    @Override
    public String cargarBasura() {
        return "levantar la basura del suelo";
    }

    @Override
    public String descargarBasura() {
        return "Lanzar la basura en un recipiente";
    }




    @Override
    public void echarGasolina() {

    }

    @Override
    public void consumirGasolina() {

    }
}
