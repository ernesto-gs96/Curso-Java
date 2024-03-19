package Strings;

public class ConcatenarCadenas {
    public static void main(String[] args) {
        /*
         * La limitante de concatenar cadenas con concat, es que
         * unicamente se puede concatenar dos variables, por ello
         * igualmente podemos concatenar con el signo '+'
         */
        String cadena = "Hola ";
        String nombre = "Ernesto";
        float total = 150.50f;
        int articulos = 5;
        
        cadena += nombre + " su total es de $" + total + " por la cantidad de " + articulos + " articulo(s).";

        System.out.println(cadena);
    }   
}
