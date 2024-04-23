public class EjemploMatricesFor2 {
    public static void main(String[] args) {
        String[][] nombres = {{"Pepe","Pepa"},{"Josefa","Paco"},{"Lucas","Pancha"}};

        System.out.println("Iterando con foreach:");
        for (String[] fila : nombres){
            for (String columna: fila){
                System.out.print(columna + "\t");
            }
            System.out.println();
        }
    }
}
