package clase_02_enumeraciones;

public class Principal {

    public static void main(String[] args) {

        for (DiaDeLaSemana dia : DiaDeLaSemana.values()){
            System.out.println("Hoy es el dia : " + dia);
        }
    }
}
