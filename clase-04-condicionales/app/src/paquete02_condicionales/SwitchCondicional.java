package paquete02_condicionales;

public class SwitchCondicional {

    public static void main(String[] args) {
        //españa = 1
        //portugal = 2
        //alemania = 3

        int idDestino = 385;
        double costoEnvio;

        switch (idDestino){
            case 1:
                costoEnvio =5.0;
                break;
            case 2:
                costoEnvio = 7.5;
                break;
            case 3:
                costoEnvio = 9.5;
                break;
            default:
                costoEnvio = 0.0;
        }

        System.out.println("El precio de envio es " + costoEnvio);

    }
}
