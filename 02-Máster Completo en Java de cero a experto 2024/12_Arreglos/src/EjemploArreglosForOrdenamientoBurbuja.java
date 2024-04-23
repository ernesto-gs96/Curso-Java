public class EjemploArreglosForOrdenamientoBurbuja {

    public  static void arregloInverso(String[] arreglo){
        int total = arreglo.length;
        int total2 = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso = arreglo[total-i-1];
            arreglo[i] = inverso;
            arreglo[total-i-1] = actual;
            total2--;
        }
    }

    public static void sortBurbuja(Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;

        for (int i = 0; i < total-1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if ( ( (Comparable)arreglo[j+1]).compareTo(arreglo[j] ) < 0 ){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("=== Se itero " + contador + " veces ===");
    }

    public static void sortBurbujaDesc(Object[] arreglo){
        int total = arreglo.length;
        int contador = 0;

        for (int i = 0; i < total-1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if ( ( (Comparable)arreglo[j+1]).compareTo(arreglo[j] ) > 0 ){
                    Object auxiliar = arreglo[j];
                    arreglo[j] = arreglo[j+1];
                    arreglo[j+1] = auxiliar;
                }
                contador++;
            }
        }

        System.out.println("=== Se itero " + contador + " veces ===");
    }

    public static void main(String[] args) {

        String[] productos = { "Kingston Pendrive 64GB", "Samsumg Galaxy", "Disco Duro SSD Samsung Externo",
                "Asus Notebook", "Macbook Air", "Chromecast 4ta generacion", "Bicicleta Oxford" };
        int total = productos.length;

        // Arrays.sort(productos); // Sort ordena el arreglo
        // Metodo burbuja
        System.out.println("=== Ordenado arreglo con metodo burbuja ===");
        int contador = 0;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < total; j++) {
                if (productos[i].compareTo(productos[j]) < 0){
                    String auxiliar = productos[i];
                    productos[i] = productos[j];
                    productos[j] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("=== Se itero " + contador + " veces ===");

        System.out.println("=== Imprimiendo arreglo ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        System.out.println("=== Inviertiendo arreglo con funcion propia ===");
        arregloInverso(productos);
        // Collections.reverse(Arrays.asList(productos));

        System.out.println("=== Imprimiendo arreglo ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        // Metodo burbuja optimizado
        System.out.println("=== Ordenado arreglo con metodo burbuja optimizado ===");
        contador = 0;
        for (int i = 0; i < total-1; i++) {
            for (int j = 0; j < total - 1 - i; j++) {
                if (productos[j+1].compareTo(productos[j]) < 0){
                    String auxiliar = productos[j];
                    productos[j] = productos[j+1];
                    productos[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("=== Se itero " + contador + " veces ===");

        System.out.println("=== Imprimiendo arreglo ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + productos[i]);
        }

        // Arreglo de numeros
        Integer [] numeros = new Integer[4];
        total = numeros.length;

        numeros[0] = 10;
        numeros[1] = Integer.valueOf("7");
        numeros[2] = -1;
        numeros[3] = 35;

        System.out.println("=== Imprimiendo arreglo numeros ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + numeros[i]);
        }

        // Metodo burbuja optimizado
        System.out.println("=== Ordenado arreglo con metodo burbuja optimizado y para todo objeto ===");
        sortBurbuja(numeros);

        System.out.println("=== Imprimiendo arreglo numeros ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + numeros[i]);
        }

        // Metodo burbuja optimizado
        System.out.println("=== Ordenado arreglo con metodo burbuja descendente optimizado y para todo objeto ===");
        sortBurbujaDesc(numeros);

        System.out.println("=== Imprimiendo arreglo numeros ===");
        for (int i = 0; i < total; i++) {
            System.out.println("Para indice " + i + " : " + numeros[i]);
        }

    }
}