package Arreglos;

public class ArreglosBidemencionales {
    public static void main(String[] args) {
        int matriz[][] = new int[4][3];

        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;

        matriz[1][0] = 1;
        matriz[1][1] = 2;
        matriz[1][2] = 3;

        matriz[2][0] = 1;
        matriz[2][1] = 2;
        matriz[2][2] = 3;

        matriz[3][0] = 1;
        matriz[3][1] = 2;
        matriz[3][2] = 3;

        System.out.println(matriz[2][1]);

        // Recorrer matriz
        int contador = 1;
        for (int posX = 0; posX < matriz.length; posX++) {
            for (int posY = 0; posY < matriz[posX].length; posY++) {
                matriz[posX][posY] = contador++;
            }
        }

        System.out.println("\nImpresion de matriz:");
        for (int[] fila : matriz) {
            for (int celda : fila) {
                System.out.println(celda);
            }
        }


    }
}
