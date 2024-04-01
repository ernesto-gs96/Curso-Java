package POO;

import POO.Clases.Usuario;

public class SobreCargaConstructor {
    public static void main(String[] args) {
        Usuario usuario1 = new Usuario();
        Usuario usuario2 = new Usuario("ernestogs");
        Usuario usuario3 = new Usuario("ernestogs96","123abc");

        System.out.println(usuario1.username);
        System.out.println(usuario2.username);
        System.out.println(usuario3.username);
    }
}
