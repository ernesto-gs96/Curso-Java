package POO;

import POO.Clases.Perro;

public class Metodos {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.nombre = "Aika";
        perro.raza = "Cruza";
        perro.edad = 9;

        perro.comer();
        perro.ladrar();
        perro.ladrar();
        perro.dormir();
    }
}
