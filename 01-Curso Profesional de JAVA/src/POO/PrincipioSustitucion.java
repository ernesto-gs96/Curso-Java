package POO;

import POO.Clases.Circulo;
import POO.Clases.Figura;
import POO.Clases.Triangulo;

public class PrincipioSustitucion {
    public static void main(String[] args) {
        /*
         * El principio de sustitucion nos permite utilizar la inicializacion
         * de una clase padre con una clase hija, en otras palabras una clase hija
         * puede ser tratada como una clase padre
         */

        Circulo circulo = new Circulo(5);
        Triangulo triangulo = new Triangulo(5,10);

        System.out.println("El area del Circulo y Triangulo es : ");
        System.out.println("Area circulo = " + circulo.area());
        System.out.println("Area triangulo = " + triangulo.area());


        //  Lo anterior se puede hacer de la siguiente forma
        Figura figura1 = new Circulo(5);
        Figura figura2 = new Triangulo(5,10);

        System.out.println("\nEl area de las figuras es : ");
        System.out.println("Area figura1 (circulo) = " + figura1.area());
        System.out.println("Area figura2 (triangulo) = " + figura2.area());


        // De igual modo podemos manejar arreglos
        Figura figuras[] = new Figura[2];
        
        figuras[0] = circulo;
        figuras[1] = triangulo;

        System.out.println("\nEl area del arreglo de figuras es : ");
        System.out.println("Area [0] (circulo) = " + figuras[0].area());
        System.out.println("Area [1] (triangulo) = " + figuras[1].area());
    }
}
