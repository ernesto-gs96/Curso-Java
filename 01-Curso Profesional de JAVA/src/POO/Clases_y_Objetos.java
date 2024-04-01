package POO;

import POO.Clases.Perro;

public class Clases_y_Objetos {
    public static void main(String[] args) {
        // Instancia de la clase
        Perro perro = new Perro();

        // Inicializacion de valores
        perro.nombre = "Aika";
        perro.raza = "Cruza";
        perro.edad = 9;

        System.out.println("El nombre es : " + perro.nombre);
        System.out.println("La raza es : " + perro.raza);
        System.out.println("La edad es : " + perro.edad);
    }
}
