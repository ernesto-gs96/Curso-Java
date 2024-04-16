import java.util.Scanner;

public class EjemploArregloDetectarOrden {
    public static void main(String[] args) {
        int[] a = new int[7];
        Scanner s = new Scanner(System.in);

        System.out.printf("Ingresa %d números: ",a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        boolean ascendente = false;
        boolean descendente = false;
        for (int i = 0; i < a.length - 1; i++) {
            if ( a[i] > a[i+1] ) {
                ascendente = true;
            }
            if ( a[i] < a[i+1] ){
                descendente = true;
            }
        }

        if ( ascendente == true && descendente == true ){
            System.out.println("Arreglo = Desordenado");
        }

        if ( ascendente == false && descendente == false ){
            System.out.println("Arreglo = Todos iguales");
        }

        if ( ascendente == true && descendente == false ){
            System.out.println("Arreglo = Ascendente");
        }

        if ( ascendente == false && descendente == true ){
            System.out.println("Arreglo = Descendente");
        }
    }
}
