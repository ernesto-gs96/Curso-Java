package Ciclos;

public class CicloFor {
    public static void main(String[] args) {
        /*
         * Para ver el uso de FOR vamos a realizar el siguiente ejercicio:
         * Imprimir la tabla de multiplicar de un número.
         */
        int numero = 9;

        for (int x = 1 ; x < 11; x++) {
            System.out.printf("\n%d * %d = %d", numero,x,(numero*x));
        }

        System.out.print("\n\nForma 2 de hacerlo (Menos legible)");
        // Lo anterior se puede hacer de la siguiente manera tambien, pero es menos legible
        for (int numero2 = 9, x = 1; x < 11; System.out.printf("\n%d * %d = %d", numero2,x,(numero2*(x++)))) {}

        System.out.print("\n\nForma 3 de hacerlo");
        // Lo anterior se puede hacer de la siguiente manera tambien
        int numero2 = 9, x = 1;
        for (; x < 11 ;) {
            System.out.printf("\n%d * %d = %d", numero2,x,(numero2*x));
            x++;
        }
    
    }
}
