package ciclo01_forEach;

public class ForEach {

    public static void main(String[] args) {

        // for (inicio; condicion; modificador)
        for (int juan = 0; juan < 5; juan++) {
           /* System.out.println("Hola numero " + juan);*/
        }

        //for mejorado        0      1        2        3         4
        String[] nombres = {"Ana", "Juan", "Brian", "carlos", "Maria"};

        // for (tipoDato nombreElemento: elArray)

        for(String nombrePersona : nombres){
            //itero cada elemento del array

          /*  System.out.println("El nombre de la persona es: " + nombrePersona);*/
        }

      /*  for (int i = 0; i < 3; i++) {
            System.out.println("el nombre de la persona es: " + nombres[i] + " pero con un for");
        }
        */

        // array de paises
        String[] paises = {"Usa" ,"España", "Argentina" , "Venezuela", "Ecuador", "Alemania"};

        for (String pais : paises){
            if (pais.equals("Argentina")) {
                System.out.println("Si hay un pais llamado argentina en la lista");
            }
        }


    }
}
