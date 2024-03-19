package Condicionales;

public class CondicionalIfElse {
    public static void main(String[] args) {
        /*
         * Para ver el condicional IF ELSE consideramos el siguiente ejercicio:
         * Se necesita validar el color de luz para avanzar, tomando los siguientes casos
         * Si tiene la luz es de color 'Verde' 'Puede avanzar'
         * Si tiene la luz es de color 'Rojo' 'No puede avanzar'
         */

        final String colorAvanzar = "Verde";
        String colorLuz = "Verde";
        String mensaje = "";

        System.out.print("Primer semaforo : ");
        if (colorLuz == colorAvanzar) {
            mensaje = "Puede avanzar";
        } else {
            mensaje = "No puede avanzar";
        }
        System.out.print(mensaje);


        System.out.print("\nSegundo semaforo : ");
        colorLuz = "Rojo";
        if (colorLuz == colorAvanzar) {
            mensaje = "Puede avanzar";
        } else {
            mensaje = "No puede avanzar";
        }
        System.out.print(mensaje);
    }
}
