package Condicionales;

public class IfElse {
    public static void main(String[] args) {
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
