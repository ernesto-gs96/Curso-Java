package Ciclos;

public class CicloDoWhile {
    public static void main(String[] args) {
        // Nota : Do While se ejecuta al menos 1 vez
        int contador = 11;

        do {
            System.out.printf("\nContador vale %d",contador);
            contador++;
        } while (contador <= 10);
    }
}
