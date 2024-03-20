package POO;

import POO.Clases.Triangulo;

public class RetornarValores {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo();

        triangulo.base = 10;
        triangulo.altura = 20;

        float area = triangulo.area();

        System.out.printf("El area de un triangulo de base %.2f y altura %.2f es : %.2f",triangulo.base,triangulo.altura,area);
    }
}
