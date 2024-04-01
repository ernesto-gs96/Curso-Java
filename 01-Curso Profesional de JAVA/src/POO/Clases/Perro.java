package POO.Clases;

public class Perro extends Mascota{
    public Perro(){
        super();
    }

    public Perro(String nombre, String raza, int edad){
        super(nombre, raza, edad);
    }
    // Parametros
    public void establecerAtributos(String nombre,String raza,int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    // Metodos
    public void ladrar(){
        System.out.println(nombre + " esta ladrando");
    }
}
