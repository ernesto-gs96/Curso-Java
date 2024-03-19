package Operadores;
public class OperadoresRelacionales {
    public static void main(String[] args) {
        int variable1 = 200, variable2 = 200;
        boolean resultado;

        // Mayor a >
        resultado = variable1 > variable2;
        System.out.println(variable1 + " > " + variable2 + " = " + resultado);

        // Menor a <
        resultado = variable1 < variable2;
        System.out.println(variable1 + " < " + variable2 + " = " + resultado); 

        // Mayor igual a >
        resultado = variable1 >= variable2;
        System.out.println(variable1 + " >= " + variable2 + " = " + resultado); 

        // Mayor a >
        resultado = variable1 <= variable2;
        System.out.println(variable1 + " <= " + variable2 + " = " + resultado);

        // Igual a ==
        resultado = variable1 == variable2;
        System.out.println(variable1 + " == " + variable2 + " = " + resultado);

        // Diferente de !=
        resultado = variable1 != variable2;
        System.out.println(variable1 + " != " + variable2 + " = " + resultado);
    }
}
