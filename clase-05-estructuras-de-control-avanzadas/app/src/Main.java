public class Main {
    public static void main(String[] args) {
        // validar la edad de una persona
        int edad = 4;
        String mensaje;

        //validar edad
        if (edad > 17)
            mensaje = "Entrada permitida";
        else if(edad >= 16)
            mensaje = "Puedes ingresar con un representante";
        else if(edad >= 14)
            mensaje = "Puedes ir a la parte de matine";
        else
            mensaje = "No puedes ingresar a las instalaciones";


        System.out.println(mensaje);



    }
}