package Ciclos;

public class CicloWhile {
    public static void main(String[] args) {
        /*
         * Para usar WHILE realizaremos el siguiente ejercicio:
         * Conocer el número de números que tiene un valor númerico
         */
        int contador = 1;
        int numero = 123467890;
        int copiaContador = numero;

        while (copiaContador > 0) {
            copiaContador /= 10;
            contador++;
        }
        System.out.printf("%d tiene %d numero(s)",numero,contador);
    }
}
