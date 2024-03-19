package Condicionales;

public class CondicionalElseIf {
    public static void main(String[] args) {
        /*
         * Para ver el condicional ELSE IF consideramos el siguiente ejercicio:
         * Se necesita validar el color de luz para avanzar, tomando los siguientes casos
         * Si tiene la luz es de color 'Verde' 'Puede avanzar'
         * Si tiene la luz es de color 'Amarillo' 'Aún puede avanzar'
         * Si tiene la luz es de color 'Rojo' 'No puede avanzar'
         */
        final String colorAvanzar = "Verde";
        final String colorAunAvanzar = "Amarillo";
        String colorLuz = "Verde";
        String mensaje = "";

        System.out.print("Primer semaforo : ");
        if (colorLuz == colorAvanzar) {
            mensaje = "Puede avanzar";
        } else if (colorLuz == colorAunAvanzar) {
            mensaje = "Aún puede avanzar";
        } else {
            mensaje = "No puede avanzar";
        }
        System.out.print(mensaje);


        System.out.print("\nSegundo semaforo : ");
        colorLuz = "Amarillo";
        if (colorLuz == colorAvanzar) {
            mensaje = "Puede avanzar";
        } else if (colorLuz == colorAunAvanzar) {
            mensaje = "Aún puede avanzar";
        } else {
            mensaje = "No puede avanzar";
        }
        System.out.print(mensaje);
        

        System.out.print("\nTercer semaforo : ");
        colorLuz = "Rojo";
        if (colorLuz == colorAvanzar) {
            mensaje = "Puede avanzar";
        } else if (colorLuz == colorAunAvanzar) {
            mensaje = "Aún puede avanzar";
        } else {
            mensaje = "No puede avanzar";
        }
        System.out.print(mensaje);
    }
}
