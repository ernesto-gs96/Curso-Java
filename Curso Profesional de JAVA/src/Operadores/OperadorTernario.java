package Operadores;
public class OperadorTernario {
    public static void main(String[] args) {
        final int edadPermitida = 18;
        int edad = 19;
        String mensaje;

        /*
         * Operador ternario
         * expresion1 ? expresion2 : expresion3
         * Si expresion1 es verdadero se ejecuta la expresion2
         * Si expresion1 es falsa se ejecuta la expresion3
         */
        mensaje = edad >= edadPermitida ? "Tiene la edad permitida" : "No tiene la edad permitida";

        System.out.println(mensaje);
    }
}
