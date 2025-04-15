package entidades;

public class Auto {

    //atributos o caracteristicas
    String color;
    String marca;
    int velocidad;

    //constructor vacio
    public Auto() {
    }

    // constructor con parametros
    public Auto(String color, String marca, int velocidad) {
        this.color = color;
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //metodos de la clase
    public int acelerar(int velocidadSumada){
        int calcular = this.getVelocidad() + velocidadSumada;
       this.setVelocidad(calcular);
        return calcular;
    }

    //de frenado
    public int frenar(){
        int calcular = this.getVelocidad() / 2;
        this.setVelocidad(calcular);
        return calcular;
    }

    @Override
    public String toString() {
        return "Auto { " +
                " color = '" + color + '\'' +
                ", marca = '" + marca + '\'' +
                ", velocidad = " + velocidad +
                '}';
    }
}
