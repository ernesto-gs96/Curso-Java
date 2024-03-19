public class Casting {
    public static void main(String[] args) {
        int variableX = 50, variableY = 10;
        float variableZ = 5.5f;
        int resultado;

        // No esta permitido porque el resultado es de tipo float y resultado es int
        // resultado = variableX + variableZ;

        /*
            Para realizar la operacion se realiza un casting, transforma el tipo
            pero esto quitara los puntos decimales del flotante
        */
        resultado = variableX + (int)variableZ;
        System.out.println("Resultado = " + resultado);

        // Para obtener los puntos decimales, lo correcto sería guardar el resultado en un float
        float resultadoFinal = variableX + variableZ;
        System.out.println("Resultado final = " + resultadoFinal);
    }
}
