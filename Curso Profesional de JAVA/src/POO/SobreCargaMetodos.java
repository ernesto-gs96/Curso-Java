package POO;

import POO.Clases.Calculadora;

public class SobreCargaMetodos {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultado1 = calculadora.suma(5, 3);
        float resultado2 = calculadora.suma(1.01f, (float)resultado1);
        double resultado3 = calculadora.suma((double)resultado2, (double)resultado1);

        System.out.println(resultado1);
        System.out.println(resultado2);
        System.out.println(resultado3);
    }
}
