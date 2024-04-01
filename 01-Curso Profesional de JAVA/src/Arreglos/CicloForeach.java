package Arreglos;

public class CicloForeach {
    public static void main(String[] args) {
        // Rescribiendo el código de RecorrerArreglo
        int calificaciones[] = { 9, 8, 7, 10, 10, 9, 8, 8, 10, 9 };
        int suma = 0;
        float promedio;
        
        System.out.println("Calificaciones");
        
        // For each nos permite recorrer un arreglo sin necesidad de extrar su valor como el caso anterior
        // for (int i = 0; i < calificaciones.length; i++) {
        //     int calificacion = calificaciones[i];
        for (int calificacion : calificaciones) {
            suma += calificacion;
            System.out.println(calificacion);
        }

        promedio = suma / calificaciones.length;

        System.out.println("La suma de las calificaciones es :" + suma);
        System.out.println("El promedio de las calificaciones es : " + promedio);
    }
}
