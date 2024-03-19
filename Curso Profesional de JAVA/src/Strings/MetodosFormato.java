package Strings;

public class MetodosFormato {
    public static void main(String[] args) {
        String cadena = "Soy un String ";

        System.out.println("cadena = '" + cadena + "'");

        // Convertir toda la cadena a MAYUSCULAS
        System.out.println(cadena.toUpperCase());

        // Convertir toda la cadena a minusculas
        System.out.println(cadena.toLowerCase());

        // Remover espacios de los laterales
        System.out.println("'" + cadena.trim() + "'");
    }
}
