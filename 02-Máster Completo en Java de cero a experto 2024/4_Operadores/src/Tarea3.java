import javax.swing.*;

/*
Obtener el nombre mas largo de tres personas, según los siguientes requerimientos

Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos usando la clase JOptionPane y método showInputDialog().

Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)   (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)

Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo, y con el indice cero accedemos al nombre de la persona.

Restricción no usar loops en el desarrollo de la tarea.

Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
 */
public class Tarea3 {
    public static void main(String[] args) {
        String persona1 = JOptionPane.showInputDialog("Ingresa un nombre y apellido:");
        String persona2 = JOptionPane.showInputDialog("Ingresa un nombre y apellido:");
        String persona3 = JOptionPane.showInputDialog("Ingresa un nombre y apellido:");

        String nombreMayor;

        if (persona1.split(" ")[0].length() >= persona2.split(" ")[0].length()) {
            nombreMayor = persona1;
        } else {
            nombreMayor = persona2;
        }

        if (persona3.split(" ")[0].length() >= nombreMayor.split(" ")[0].length()) {
            nombreMayor = persona3;
        }

        System.out.println(nombreMayor + " tiene el nombre mas largo");
    }
}
