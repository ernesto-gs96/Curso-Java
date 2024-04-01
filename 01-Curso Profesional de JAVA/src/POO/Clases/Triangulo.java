package POO.Clases;

public class Triangulo extends Figura{
    public float base;
    public float altura;

    public Triangulo(){
    }

    public Triangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    public float area(){
        return (this.base * this.altura) / 2;
    }
}
