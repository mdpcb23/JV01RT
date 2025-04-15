import poo_04_polimorfismo.Basurero;

public class Persona implements Basurero {
    @Override
    public String cargarBasura() {
        return "Recoger la basura de la calle";
    }

    @Override
    public String descargarBasura() {
        return "echar la basura en un tacho de basura en su casa";
    }
}
