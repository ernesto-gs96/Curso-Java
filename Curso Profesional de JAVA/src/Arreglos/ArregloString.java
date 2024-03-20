package Arreglos;

public class ArregloString {
    public static void main(String[] args) {
        // Un String es una cadena de caracteres y podemos realizar operaciones como un arreglo
        String cadena = "Soy una cadena de caracteres";

        System.out.println("La cadena es : " + cadena);

        // Obtener su tamaño
        System.out.println("El tamaño de la cadena es : " + cadena.length());

        // Acceder a sus posiciones
        System.out.println("Primer caracter de la cadena : " + cadena.charAt(0));
        System.out.println("Ultimo caracter de la cadena : " + cadena.charAt(cadena.length()-1));

        // Obtener indice de un caracter (primera aparicion de izquierdad a derecha)
        System.out.println("El caracter 'y' se encuentra en el indice : " + cadena.indexOf("y"));

        // Busqueda de subcadena
        System.out.println("Extracción de la a sub cadena 'Soy' : " + cadena.substring(cadena.indexOf("S"), cadena.indexOf("S")+3));
    }
}
