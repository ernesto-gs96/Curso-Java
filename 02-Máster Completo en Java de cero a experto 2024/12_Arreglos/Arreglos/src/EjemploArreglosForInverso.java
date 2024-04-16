import java.util.Arrays;

public class EjemploArreglosForInverso {
    public static void main(String[] args) {

        String[] productos = { "Kingston Pendrive 64GB", "Samsumg Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generacion", "Bicicleta Oxford" };
        int total = productos.length;

        Arrays.sort(productos); // Sort ordena el arreglo

        System.out.println("=== Usando for ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("=== Usando for inverso ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + (total-i-1) + " : " + productos[total-i-1]);
        }

        System.out.println("=== Usando for inverso 2 ===");
        for (int i = (total-1); i >= 0; i--) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }
    }
}