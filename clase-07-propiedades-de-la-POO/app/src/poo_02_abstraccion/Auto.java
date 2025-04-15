package poo_02_abstraccion;

public class Auto { //clase generica

    private String marca;
    private String modelo;
    private String color;
    private Integer velocidad;

    // viene las funciones creadoras o constructoras
    // vacio

    public Auto() {
    }


    //con parametros

    public Auto(String marca, String modelo, String color, Integer velocidad) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.velocidad = velocidad;
    }

    // getter y setter


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    // a un string

    @Override
    public String toString() {
        return "Auto {" +
                "marca ='" + marca + '\'' +
                ", modelo ='" + modelo + '\'' +
                ", color ='" + color + '\'' +
                ", velocidad =" + velocidad +
                '}';
    }

    //metodo
    public String acelerar(){
        this.velocidad += 10;
        return "La velocidad actual es : " + this.velocidad + " Km/h.";
    }
}
