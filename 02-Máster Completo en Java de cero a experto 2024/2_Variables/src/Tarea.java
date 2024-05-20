/*
* La tarea consiste en crear una nueva clase con el método main llamada DetalleDeFactura, 
* se requiere desarrollar un programa que reciba datos de la factura utilizando la clase Scanner de la siguiente manera:
*
* 1.- Reciba el nombre de la factura o descripción, utilizar método nextLine() para obtener el nombre de la factura con espacios.
*
* 2.- Reciba 2 precios de productos de tipo double, utilizar método nextDouble() para obtener precios con decimales (,).
*
* 3.- Calcule el total, sume ambos precios y agregue un valor de impuesto del 19%
* 
* Se pide mostrar en un solo String el nombre de la factura, el monto total bruto (antes de impuesto), el impuesto 
* y el monto total neto incluyendo impuesto.
*
* Por ejemplo, el resultado podría ser algo así:
*
* La factura producto de oficina tiene un total bruto de 134.78, con un impuesto de 25.6082 y el monto después de impuesto es de 160.3882
*/

import java.util.Scanner;

public class Tarea {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String descripcion;
        Double precio1;
        Double precio2;
        Double impuesto = 0.19;
        Double totalBruto;
        Double totalImpuesto;
        Double totalNeto;

        System.out.println("Ingrese descripcion de la factura: ");
        descripcion = scanner.nextLine();

        System.out.println("Ingrese precio 1 de la factura: ");
        precio1 = scanner.nextDouble();

        System.out.println("Ingrese precio 2 de la factura: ");
        precio2 = scanner.nextDouble();

        totalBruto = precio1 + precio2 ;
        totalImpuesto = totalBruto*impuesto;
        totalNeto = totalBruto + totalImpuesto;

        System.out.printf("La factura %s tiene un total bruto de %.2f, con un impuesto de %.2f y el monto después de impuesto es de %.2f",descripcion,totalBruto,totalImpuesto,totalNeto);
        
        scanner.close();
    }
}
