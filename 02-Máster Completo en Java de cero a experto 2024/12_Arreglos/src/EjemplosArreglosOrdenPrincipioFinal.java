public class EjemplosArreglosOrdenPrincipioFinal {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int totalNumeros = numeros.length;
        int[] numeros2 = new int[totalNumeros];

        // Establecer valores
        for (int i = 0; i < totalNumeros; i++) {
            numeros[i] = i + 1;
        }

        // i-esimo numero
        int aux = 0;
        for (int i = 0; i < totalNumeros - i ; i++) {
            System.out.println(numeros[i] + " " + numeros[totalNumeros - i - 1]);
            numeros2[aux++] = numeros[i];
            numeros2[aux++] = numeros[totalNumeros - i -1];

        }

        System.out.println("=== Arreglo numeros2 ===");
        for (int i = 0; i < totalNumeros; i+=2) {
            System.out.println(numeros2[i] + " " + numeros2[i+1]);
        }
    }
}
