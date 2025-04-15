import clase_03_matrices.Matrices;

public class Main {

    private int valorA = 100;
    private static int valorB = 20; /*puede ser estatica si da error*/

    public static void main(String[] args) {

        ClaseAnidadaEstatica anidadaEstatica = new ClaseAnidadaEstatica();
        anidadaEstatica.mostrar();

        //ejecutar el mostrar datos
        Main externa = new Main();
        ClaseInterna interna = externa.new ClaseInterna();

        interna.mostrarDatos();

    }

                            public static class ClaseAnidadaEstatica{

                                private void mostrar(){
                                    System.out.println("Valor de B: " + valorB);
                                }
                            }

                            public class ClaseInterna {
                                private void mostrarDatos(){
                                    System.out.println("valor de A " + valorB);
                                }
                            }
}