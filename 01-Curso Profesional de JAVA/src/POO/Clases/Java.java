package POO.Clases;

public class Java {
    private final String titulo;

    public Java(){
        this.titulo = "Curso profesional de Java";
    }

    // protected no permite usar en programas o clases fuera del paquete
    // Con default solo se puede ultizar en clases del mismo paquete
    protected String getTitulo() {
        return this.titulo;
    }
}
