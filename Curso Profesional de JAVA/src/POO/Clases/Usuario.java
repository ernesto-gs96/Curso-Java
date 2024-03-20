package POO.Clases;

public class Usuario {
    // Modificadores de acceso
    // Default
    // Public
    // Privat
    // Protected

    public String username;
    private String password;

    // Constructor
    public Usuario(){
        this.username = "";
        this.password = "";
    }

    public Usuario(String usename){
        this.username = usename;
        this.password = "";
    }

    public Usuario(String username, String password){
        this.username = username;
        this.password = password;
    }

    public void establecerRol(){
        Administrador admin = new Administrador();
        admin.trabajar();
    }

    // Clase anidada
    public class Administrador {
        // Las clases anidadas tiene acceso a los atributos y metodos de la clase principal
        public void trabajar(){
            System.out.printf("\nEl administrador %s se encuentra trabajando",username);
        }
    }

    public void saluda(){
        System.out.println("Hola, mi username es " + this.username);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    // Getter
    public String getPassword(){
        return this.password;
    }

    // Setter
    public void setPassowrd(String password){
        this.password = password;
    }
}
