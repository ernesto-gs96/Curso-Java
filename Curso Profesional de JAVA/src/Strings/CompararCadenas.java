package Strings;

public class CompararCadenas {
    public static void main(String[] args) {
        String cadena1 = "Hola";
        String cadena2 = "hola";
        boolean resultado;

        // equals reconoce MAYUSCULAS y minusculas
        resultado = cadena1.equals(cadena2);
        System.out.printf("(%s == %s) = %b",cadena1,cadena2,resultado);

        // cadena1 = cadena1.toUpperCase();
        // cadena2 = cadena2.toUpperCase();
        // resultado = cadena1.equals(cadena2);
        resultado = cadena1.toUpperCase().equals(cadena2.toUpperCase());
        System.out.printf("\n(%s == %s) = %b",cadena1,cadena2,resultado);

        // equalsIgnore omite si son MAYUSCULA y minusculas
        resultado = cadena1.equalsIgnoreCase(cadena2);
        System.out.printf("\n(%s == %s) = %b",cadena1,cadena2,resultado);
    }
}
