public class EjemploMatricesbuscar {
    public static void main(String[] args) {
        int [][] matrizDeEnteros = {
                {35, 90, 3, 1978},
                {155, 2020, 10, 5},
                {677, 127, 32767, 1999}
        };

        int elementoBuscar = 10;
        boolean encontrado = false;

        buscar : for (int[] numeros : matrizDeEnteros) {
             for (int numero : numeros){
                 if (numero == elementoBuscar){
                     encontrado = true;
                     break buscar;
                 }
             }
        }

        if (encontrado){
            System.out.println("Numero encontrado");
        } else {
            System.out.println("Numero no encontrado");
        }
    }
}
