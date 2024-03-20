package POO;

public class Circulo {
    public static float pi = 3.1415926535f;
    public float radio = 0f;

    public Circulo(float radio){
        this.radio = radio;
    }

    // Al ser un metodo estatico no puede acceder a los atributos de instancia, por ello necesita recibirlo
    public static float area(float radio){
        return Circulo.pi * (radio * radio);
    }
}
