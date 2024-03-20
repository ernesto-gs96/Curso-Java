package POO;

import POO.Clases.Perro;

public class Parametros {
    public static void main(String[] args) {
        Perro perro = new Perro();
        
        // Envio de argumentos
        perro.establecerAtributos("Aika", "Cruza", 9);

        System.out.println("El nombre es : " + perro.nombre);
        System.out.println("La raza es : " + perro.raza);
        System.out.println("La edad es : " + perro.edad);

        perro.comer();
        perro.ladrar();
        perro.dormir();
    }
}
