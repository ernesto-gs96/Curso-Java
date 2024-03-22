package Entrada_de_datos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Capturar datos desde terminal
        Scanner sc = new Scanner(System.in);
        

        // Captura de datos

        System.out.print("Ingrese su nombre : ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad : ");
        // int edad =Integer.parseInt(sc.nextLine()); // Otra forma de hacerlo
        int edad = sc.nextInt();

        System.out.print("Ingrese su altura : ");
        float altura = sc.nextFloat();

        sc.nextLine(); // Captura el saldo de linea dado por nextFloat
        System.out.print("¿Tiene acceso? (si/no) : ");
        boolean acceso = sc.nextLine().equals("si");


        // Impresion de datos

        System.out.println("\nBienvenido " + nombre);

        if (edad > 18) {
            System.out.println("Ya eres mayor de edad");
        } else {
            System.out.println("Aún no eres mayor de edad");
        }

        if ( altura > 1.69f) {
            System.out.println("Tienes una altura mayor al promedio");
        } else if (altura == 1.69f) {
            System.out.println("Tienes una altura promedio");
        } else {
            System.out.println("Tienes una altura menor al promedio");
        }

        if (acceso) {
            System.out.println("Usted tiene acceso");
        } else {
            System.out.println("Usted no tiene acceso");
        }

        sc.close();
    }
}
