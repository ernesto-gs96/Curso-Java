package POO;

import POO.Clases.Usuario;

public class ModificadoresAcceso {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Sin asignar","Sin asignar");

        usuario.username = "ernestogs";
        // usuario.password = "123abc"; // Ya no permitido por modificador de acceso
        usuario.setPassowrd("123abc");

        System.out.println(usuario.username);
        // System.out.println(usuario.password); // Ya no permitido por modificador de acceso
        System.out.println(usuario.getPassword());

        usuario.saluda();
    }
}
