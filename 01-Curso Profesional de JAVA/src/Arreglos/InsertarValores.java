package Arreglos;

public class InsertarValores {
    public static void main(String[] args) {
        int valores[] = new int[10];

        for (int i = 0; i < valores.length; i++) {
            valores[i] = i;
        }

        for (int valor : valores) {
            System.out.println(valor);
        }
    }
}
