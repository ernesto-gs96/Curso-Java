package POO.Clases;

// Una clase abstracta debe tener al menos un metodo abstracto
public abstract class Figura {
    private int numeroLados = 1;

    public Figura(){
        this.numeroLados = 0;
    }

    // Metodo abstracto
    public abstract float area();

    public void verNumeroLados(){
        System.out.println(numeroLados);
    };
}
