package POO;

public class Perro {
    // Atributos
    String nombre;
    String raza;
    int edad;

    // Parametros
    void establecerAtributos(String nombre,String raza,int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    // Metodos
    void comer() {
        System.out.println(nombre + " esta comiendo");
    }

    void ladrar(){
        System.out.println(nombre + " esta ladrando");
    }

    void dormir(){
        System.out.println(nombre + " esta durmiendo");
    }
}
