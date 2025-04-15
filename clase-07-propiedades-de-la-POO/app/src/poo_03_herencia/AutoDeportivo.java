package poo_03_herencia;

import poo_02_abstraccion.Auto;
import poo_04_polimorfismo.Basurero;

import java.util.prefs.BackingStoreException;

public class AutoDeportivo extends Auto {

    private boolean turboActivado;

    public String activarTurbo(){
        this.turboActivado = true;
        return "El turbo fue activado...";
    }

    @Override
    public String acelerar() {
        this.setVelocidad(100);
        return "La velocidad actual es : " + this.getVelocidad() + " Km/h.";
    }
}
