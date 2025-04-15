# 08. Programación Orientada a Objetos Avanzada

<br>

## Interfaces

En Java, una **interfaz** es una estructura que define un conjunto de métodos que una clase debe implementar. A diferencia de las clases, las interfaces no pueden contener implementaciones de métodos (hasta Java 8, cuando se introdujeron los métodos `default`).

<br>

### Características de las Interfaces

- Se definen con la palabra clave `interface`.
  
- No pueden contener atributos (salvo los `static final`).
  
- Una clase puede implementar múltiples interfaces.
  
- Pueden contener métodos `default` y `static` desde Java 8.
  
- Desde Java 9, pueden tener métodos privados.

<br>

### Ejemplo de una Interfaz

```java
interface Animal {
    void hacerSonido();
}

class Perro implements Animal {
    public void hacerSonido() {
        System.out.println("Guau guau");
    }
}
```

<br>

---
---

<br>

## Enumeraciones (Enums)

Las **enumeraciones** en Java son un tipo especial de clase que representa un conjunto fijo de constantes.

<br>

### Características de los Enums

- Se definen con la palabra clave `enum`.
  
- Son `final`, lo que significa que no pueden ser extendidos.
  
- Pueden contener atributos, métodos y constructores.
  
- Se utilizan comúnmente para representar estados o categorías fijas.

<br>

### Ejemplo de un Enum

```java
enum Dia {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}

public class TestEnum {
    public static void main(String[] args) {
        Dia diaActual = Dia.LUNES;
        System.out.println("Hoy es: " + diaActual);
    }
}
```

<br>

---
---

<br>

## Clases Abstractas

Las **clases abstractas** son aquellas que no pueden instanciarse y sirven como base para otras clases. Se utilizan cuando queremos definir una estructura común, pero dejando ciertos métodos sin implementación.

<br>

### Características de las Clases Abstractas

- Se definen con la palabra clave `abstract`.
  
- Pueden contener métodos con o sin implementación.
  
- No pueden ser instanciadas directamente.
  
- Pueden contener atributos y constructores.
  
<br>

### Ejemplo de una Clase Abstracta

```java
abstract class Figura {
    abstract double calcularArea();
}

class Circulo extends Figura {
    private double radio;

    Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    double calcularArea() {
        return Math.PI * radio * radio;
    }
}
```

<br>

---
---

<br>

## Clases dentro de Clases

Java permite definir **clases anidadas** dentro de otras clases. Estas clases pueden ser de diferentes tipos:

<br>

### Tipos de Clases Anidadas

1. **Clases Internas**: Definidas dentro de otra clase.
   
2. **Clases Estáticas Internas**: Usan `static` y no dependen de una instancia externa.
   
3. **Clases Locales**: Definidas dentro de un método.
   
4. **Clases Anónimas**: Clases sin nombre que se crean para ser utilizadas inmediatamente.

<br>

### Ejemplo de Clase Interna

```java
class Externa {
    class Interna {
        void mostrar() {
            System.out.println("Soy una clase interna");
        }
    }
}

public class TestInterna {
    public static void main(String[] args) {
        Externa externa = new Externa();
        Externa.Interna interna = externa.new Interna();
        interna.mostrar();
    }
}
```

---
> [⬅️ Anterior: Propiedades de la POO](07-propiedades-de-la-POO.md) | 📂 [Volver al índice](./README.md) | [Siguiente: Collections en Java ➡](09-collections-en-java.md)
