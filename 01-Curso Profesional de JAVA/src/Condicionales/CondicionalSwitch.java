package Condicionales;

public class CondicionalSwitch {
    public static void main(String[] args) {
        /*
         * Para ver el condicional SWITCH consideramos el siguiente ejercicio:
         * Se necesita validar el color de luz para avanzar, tomando los siguientes casos
         * Si tiene la luz es de color 'Verde' 'Puede avanzar'
         * Si tiene la luz es de color 'Amarillo' 'Aún puede avanzar'
         * Si tiene la luz es de color 'Rojo' 'No puede avanzar'
         */
        final String colorAvanzar = "Verde";
        final String colorAunAvanzar = "Amarillo";
        final String colorNoAvanzar = "Rojo";
        String colorLuz = "Rosa";
        String mensaje = "";

        // Nota: Los casos a evaluar tiene que ser del mismo tipo
        switch (colorLuz) {
            case colorAvanzar:
                mensaje = "Puede avanzar";
                break;
            
            case colorAunAvanzar:
                mensaje = "Aún puede avanzar";
                break;

            case colorNoAvanzar:
                mensaje = "No puede avanzar";
                break;
        
            default:
                mensaje = "Color no valido, No puede avanzar";
                break;
        }

        System.out.println(mensaje);
    }
}
