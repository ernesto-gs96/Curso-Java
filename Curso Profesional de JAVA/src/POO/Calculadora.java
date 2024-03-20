package POO;

public class Calculadora {
    /*
     * JAVA permite la sobre carga de metodos siempre y cuando sea diferentes tipos en RETURN, PARAMETROS TIPO y CANTIDAD
     */
    // ... Multiples parametros
    public int suma(int... numeros){
        int suma = 0;
        for (int numero : numeros) {
            suma += numero;
        }

        return suma;
    }

    public float suma(float... numeros){
        float suma = 0;
        for (float numero : numeros) {
            suma += numero;
        }

        return suma;
    }

    public double suma(double... numeros){
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }

        return suma;
    }

}
