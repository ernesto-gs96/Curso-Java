package Strings;

public class FormatCadena {
    public static void main(String[] args) {
        /*
         * format utiliza los siguientes formatos para cada tipo
         * %s para cadenas o String
         * %.f para float
         * %d para enteros
         * %b para booleanos
         * 
         * Se puede agregar orden de impresion con %n$d siendo n el numero de argumento
         * en format y $d el formato del argumento
         */
        // format con tipo String
        String mensaje = "Bienvenido al curso";
        String curso = "JAVA";
        mensaje = String.format(mensaje + " %s",curso);

        System.out.println(mensaje);

        // format con tipo float
        float total = 10.9876f;
        mensaje = "Su total es de = ";
        mensaje = String.format(mensaje + "%.2f", total);
        
        System.out.println(mensaje);

        // format con tipo int
        int articulos = 2;
        mensaje = String.format(mensaje + " por %d articulos", articulos);

        System.out.println(mensaje);

        // PODEMOS OCUPAR printf para ocupar las propiedades de format
        System.out.printf("Su total es de = %.4f por %d articulos",total,articulos);

        // format para boolean
        System.out.printf("\nTiene dinero para pagar ? %b",true);

        // Orden de impresion
        System.out.printf("\n%3$d %1$d %2$d", 1,2,3);
    }
}
