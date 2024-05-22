/*
Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros
y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...

La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.

Si la capacidad actual es 70 litros: imprimir Estanque lleno

Si está entre 60 y menor a 70: imprimir Estanque casi lleno

Si está entre 40 y menor a 60: imprimir Estanque  3/4

Si está entre 35 y menor a 40: imprimir Medio Estanque

Si está entre 20 y menor a 35: imprimir Suficiente

Si está entre 1 y menor a 20: imprimir Insuficiente
 */

import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la medida actual del tanque : ");
        Double medidaActual = scanner.nextDouble();
        String mensaje = "";

        if ( medidaActual == 70  ) {
            mensaje = "Tanque lleno";
        } else if (medidaActual >= 60 && medidaActual < 70) {
            mensaje = "Tanque casi lleno";
        } else if (medidaActual >= 40 && medidaActual < 60) {
            mensaje = "Tanque 3/4";
        } else if (medidaActual >= 35 && medidaActual < 40) {
            mensaje = "Tanque 1/2";
        } else if (medidaActual >= 20 && medidaActual <35) {
            mensaje = "Tanque suficiente";
        } else if (medidaActual >=1 && medidaActual < 20) {
            mensaje = "Tanque insuficiente";
        } else {
            mensaje = "Lectura no valida";
        }

        System.out.println(mensaje);
    }
}
