package Condicionales;

public class ElseIf {
    public static void main(String[] args) {
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
