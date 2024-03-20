package POO;

import POO.Clases.Gato;
import POO.Clases.Perro;

public class Herencia {
    public static void main(String[] args) {
        /* 
         * Al Hererar las clases Gato y Perro de la clase Mascota
         * comparten atributos, metodos
         */
        Gato gato = new Gato("Don gato", "Cruza", 10);
        Perro perro = new Perro("Aika", "Cruza", 9);

        System.out.println("Dormir : ");
        gato.dormir();
        perro.dormir();

        System.out.println("\nDuchar : ");
        // Sobre escritura de metodos
        gato.duchar();
        perro.duchar();

        
    }
}