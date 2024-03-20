package POO;

public class Usuario {
    // Modificadores de acceso
    // Default
    // Public
    // Privat
    // Protected

    public String username;
    private String password;

    // Constructor
    public Usuario(String username, String password){
        this.username = username;
        this.password = password;
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
