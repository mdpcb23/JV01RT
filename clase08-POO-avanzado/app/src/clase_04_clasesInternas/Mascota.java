package clase_04_clasesInternas;

public class Mascota {

    public static void main(String[] args) {

    }

    public class Perro{
        private String nombre;
        private int patas;

        public String hacerSonido(){
            return "un perro ladra";
        }
    }

    public class Gato{
        private String nombre;
        private int patas;

        public String hacerSonido(){
            return "el gato maulla";
        }
    }
}
