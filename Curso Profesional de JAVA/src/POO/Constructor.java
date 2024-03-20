package POO;

public class Constructor {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("ernestogs", "123abc");

        System.out.println(usuario.username);
        System.out.println(usuario.getPassword());
        
        usuario.saluda();
    }
}
