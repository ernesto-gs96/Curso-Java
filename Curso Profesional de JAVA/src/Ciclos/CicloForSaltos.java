package Ciclos;

public class CicloForSaltos {
    public static void main(String[] args) {

        /*
         * break nos permite interrupir un ciclo si deseamos al cumplir una condición
         * En este ejemplo interrumpimos el ciclo al llegar a 50
        */
        for (int i = 100; i > 0; i--) {
            if (i < 50) {
                System.out.println("Ciclo interrumpido");
                break;
            }

             System.out.println(i);
        }

        /*
         * continue nos permite saltar a la siguiente interacción
         * En este ejemplo no imprimimos los numeros impares
         */

        System.out.println("\nImpresion de número pares : ");
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                continue;
            }

            System.out.println(i);
        }
    }
}
