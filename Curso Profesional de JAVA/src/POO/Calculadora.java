package POO;

public class Calculadora {
    /*
     * JAVA permite la sobre carga de metodos siempre y cuando sea diferentes tipos en RETURN, PARAMETROS TIPO y CANTIDAD
     */
    public int suma(int valor1, int valor2){
        return valor1 + valor2;
    }

    public float suma(float valor1, float valor2){
        return valor1 + valor2;
    }

    public double suma(double valor1, double valor2){
        return valor1 + valor2;
    }

}
