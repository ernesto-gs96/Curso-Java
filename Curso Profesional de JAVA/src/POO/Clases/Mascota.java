package POO.Clases;

public class Mascota {
    // Atributos
    public String nombre;
    public String raza;
    public int edad;

    // Constructores
    public Mascota(){
        
    }

    public Mascota(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    // Metodos
    public void dormir(){
        System.out.println(nombre + " esta durmiendo");
    }

    public void comer() {
        System.out.println(nombre + " esta comiendo");
    }

    public void duchar(){
        System.out.println(nombre + " se esta duchando");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
