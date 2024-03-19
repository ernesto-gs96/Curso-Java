package Introduccion;
public class TiposDatos {
    public static void main(String[] args){
        // Tipos enteros
        byte uno = 1;
        short diez = 10;
        int cien = 100;
        long mil = 1000;

        System.out.println("Tipos de datos enteros");
        System.out.println("byte = " + uno);
        System.out.println("short = " + diez);
        System.out.println("int = " + cien);
        System.out.println("long = " + mil);

        // Tipos flotantes
        float gravedad = 9.80665f;
        double pi = 3.1415926535897932f;

        System.out.println("\nTipos de datos flotantes");
        System.out.println("float = " + gravedad);
        System.out.println("double = " + pi);

        // Tipo caracter
        char a = 'a';
        char aNumero = 61;

        System.out.println("\nTipos de datos carcter");
        System.out.println("char = " + a);
        System.out.println("char con numero = " + aNumero);

        // Tipo booleano
        boolean verdadero = true;
        boolean falso = false;

        System.out.println("\nTipos de datos booleano");
        System.out.println("boolean verdadero = " + verdadero);
        System.out.println("boolean falso = " + falso);
    }
}
