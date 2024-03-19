package Condicionales;

public class CondicionesAnidadas {
    public static void main(String[] args) {
        /*
         * Para ver la anidación de las codicionales consideramos el siguiente ejercicio:
         * Se necesita validar la calificación de un alumno, tomando los siguientes casos
         * Si tiene una calificación de 10 escribir 'Muchas felcidades'
         * Si tiene una calificación menor a 10 pero mayor a 7 escribir 'Felicidades'
         * Si tiene una calificación menor a 7 escribor 'Es necesario repasar los temas'
         */
        final int calificacionAprobatoria = 7;
        int calificacion = 6;
        String mensaje = "";

        if (calificacion >= calificacionAprobatoria){

            if (calificacion == 10 ){
                mensaje = "Muchas felicidades";
            } else {
                mensaje = "Felicidades";
            }
            
        } else {
            mensaje = "Es necesario repasar los temas";
        }

        System.out.println(mensaje);
    }
}
