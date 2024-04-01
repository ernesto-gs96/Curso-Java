package POO.Clases;

public class Gato extends Mascota{
    public Gato(){
        super();
    }

    public Gato(String nombre, String raza, int edad){
        super(nombre, raza, edad);
    }
    // Sobre escritura de metodos
    @Override // Buena practica, no es necesario
    public void duchar(){
        // super hace referencia a la clase padre
        super.duchar();
        System.out.println(nombre + " se escapo de la ducha");
    }
}
