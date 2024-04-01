package Arreglos;

public class Arreglos {
    public static void main(String[] args) {
        // Declaración o definición
        String nombres[];
        nombres = new String[3];

        // Asignación
        nombres[0] = "Cirilo";
        nombres[1] = "Ernesto";
        nombres[2] = "Diana";

        // Acceso
        System.out.println(nombres[1]);

        // Una vez definido su tipo y tamaño no se puede cambiar y marcara error
        // nombres[4] = 10;
        // nombres[4] = "Lizeth";

        // Otra forma de definir un arreglo
        // int calificaciones[] = new int[3];
        int calificaciones[] = {5,8,10};

        System.out.println(calificaciones[1]);
    }
}
