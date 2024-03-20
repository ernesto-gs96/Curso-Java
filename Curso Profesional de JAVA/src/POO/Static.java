package POO;

public class Static {
    public static void main(String[] args) {
        // Cuando un atributo es estatico podemos acceder a el sin anicializarla
        System.out.println(Circulo.pi);

        // De igual modo podemos usuarlo al inicializar
        // Circulo circulo = new Circulo(1f);
        // System.out.println(circulo.pi);

        // Metodo estatico
        System.out.println(Circulo.area(10));
    }
}
