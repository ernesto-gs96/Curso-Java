public class OperadoresAritmeticos {
    public static void main(String[] args){
        int variableX = 50, variableY = 10;
        int resultado;

        // SUMA
        resultado = variableX + variableY;
        System.out.println( "La suma de " + variableX + " + " + variableY + " = " + resultado );

        // RESTA
        resultado = variableX - variableY;
        System.out.println( "La resta de " + variableX + " - " + variableY + " = " + resultado );

        // MULTIPLICACION
        resultado = variableX * variableY;
        System.out.println( "La multiplicacion de " + variableX + " * " + variableY + " = " + resultado );

        // DIVISION
        resultado = variableX / variableY;
        System.out.println( "La division de " + variableX + " / " + variableY + " = " + resultado );

        // INCREMENTAR 1 
        System.out.print( "\nAutocrementar 1 variableX " + variableX );
        variableX++;
        System.out.print(" + 1 = " + variableX);

        // DECREMENTAR 1 
        System.out.print( "\nDecrementar 1 variableX " + variableX );
        variableX--;
        System.out.print(" - 1 = " + variableX );

        // INCREMENTAR N 
        System.out.print( "\nAutocrementar N variableX " + variableX );
        variableX += variableY;
        System.out.print(" + " + variableY + " = " + variableX );

        // DECREMENTAR N 
        System.out.print( "\nDecrementar N variableX " + variableX );
        variableX -= variableY;
        System.out.print(" - " + variableY + " = " + variableX );

        // MULTIPLICAR POR N 
        System.out.print( "\nMultiplicar por N variableX " + variableX );
        variableX *= variableY;
        System.out.print(" * " + variableY + " = " + variableX );

        // DIVIDIR POR N 
        System.out.print( "\nDividir por N variableX " + variableX );
        variableX /= variableY;
        System.out.print(" / " + variableY + " = " + variableX );
    }
}
