/*
    El desafío es un programa que pida dos números y los muestre ordenados de mayor a menor.
    Podría ser utilizando operador ternario.
 */

import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese primer numero : ");
        Double numero1 = scanner.nextDouble();

        System.out.println("Ingrese segundo numero : ");
        Double numero2 = scanner.nextDouble();

        String resultado = (numero1 >= numero2) ? (numero1 + " , " + numero2 ) : (numero2 + " , " + numero1 );

        System.out.println("El orden es : " + resultado);
    }
}
