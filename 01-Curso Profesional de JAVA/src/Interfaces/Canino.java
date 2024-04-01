package Interfaces;

public interface Canino {
    // Los metodos de una interfaz no tiene cuerpo ya que dice que hacer y no como
    public abstract void aullar();

    // Los metodos default puede tener cuerpo y no seran necesario sobre escribir en una clase
    public default void correr(){
        System.out.println("El canino, esta corriendo");
    }
}
