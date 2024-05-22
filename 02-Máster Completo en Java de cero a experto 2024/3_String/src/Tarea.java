/*
* La tarea consiste en crear una clase llamada ProgramaManejoDeNombres de la siguiente manera:
*
* Se requiere desarrollar un programa que reciba los nombres de 3 integrantes de tu familia o amigos 
* como argumentos de línea de comandos.
*
* Se pide por cada nombre de la persona una nueva variable del tipo String al tomar el segundo carácter 
* pero convertido en mayúscula y se le concatena un punto y los dos últimos caracteres de la persona. 
* Por ejemplo para Andres debe quedar como N.es
*
* Debe imprimir como resultado los tres nuevos nombres separado con guion bajo (como una única variable).
*
* Ejemplo, un resultado final esperado para los nombres Andres, Maria y Pepe podría ser:
* 
* N.es_A.ia_E.pe
 */

import java.util.Scanner;

public class Tarea {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer nombre : ");
        String nombre1 = scanner.nextLine();

        System.out.println("Ingrese el segundo nombre : ");
        String nombre2 = scanner.nextLine();

        System.out.println("Ingrese el tercer nombre : ");
        String nombre3 = scanner.nextLine();

        String resultado = "";

        resultado = nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length()-2);
        resultado += "_" + nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2);
        resultado += "_" + nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length()-2);

        System.out.println(resultado);
    }
}
