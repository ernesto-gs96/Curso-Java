package POO.Clases;

import Interfaces.Canino;
import Interfaces.Mascota;
// Se puede importar todo con un * pero no es recomendable para paquetes con muchas clases

public class PastorAleman implements Canino, Mascota {

    @Override
    public void aullar() {
        System.out.println("El pastor aleman aulla");
    }
}