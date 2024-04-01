package Strings;

public class MetodosCadenas {
    public static void main(String[] args) {
        String cadena = "Soy un String";

        System.out.println("cadena = '" + cadena + "'");
        
        // Tamaño de la cadena
        int tamano = cadena.length();
        System.out.println("Tamaño de la cadena : " + tamano);

        // Buscar en cadena
        boolean existe = cadena.contains("String");
        System.out.println("Cotiene 'String' la cadena ? " + existe);

        // Buscar en inicio de la cadena
        boolean comienzaCon = cadena.startsWith("s");
        boolean terminaCon = cadena.endsWith("g");
        System.out.println("La cadena comienza con 's' ? " + comienzaCon);
        System.out.println("La cadena termina con 'g' ? " + terminaCon);

        // Concatenar cadenas
        cadena = cadena.concat(" y no soy de tipo nativo");
        System.out.println("Nueva cadena = '" + cadena + "'");
    }
}
