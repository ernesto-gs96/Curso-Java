package Operadores;
public class OperadoresLogicos {
    public static void main(String[] args) {
        int numero1 = 5, numero2 = 5;
        boolean resultado, aux;

        // AND (Y) , Todas las comparaciones tiene que ser verdaderas (true)
        aux = true;
        resultado = numero1 >= numero2 && aux;
        System.out.println(numero1 + " >= " + numero2 + " && " + aux + " : " + resultado);

        aux = false;
        resultado = numero1 >= numero2 && aux;
        System.out.println(numero1 + " >= " + numero2 + " && " + aux + " : " + resultado);


        // OR (O) , Por lo menos una cmparacion tiene que ser verdadera (true)
        aux = true;
        resultado = numero1 >= numero2 || aux;
        System.out.println(numero1 + " >= " + numero2 + " || " + aux + " : " + resultado);

        aux = false;
        resultado = numero1 >= numero2 || aux;
        System.out.println(numero1 + " >= " + numero2 + " || " + aux + " : " + resultado);


        // Se pueden usar los operadores logicos en conjunto
        aux = true;
        resultado = (numero1 >= numero2 || aux) && (numero1 >= numero2 && aux);
        System.out.println(resultado);


        // NOT (no) , Negar o cambiar el booleano
        aux = false;
        resultado = !(numero1 >= numero2 && aux);
        System.out.println( "!( " + numero1 + " >= " + numero2 + " && " + aux + " ) : " + resultado);

        resultado = !(numero1 >= numero2 || aux);
        System.out.println( "!( " + numero1 + " >= " + numero2 + " || " + aux + " ) : " + resultado);
    }
}
