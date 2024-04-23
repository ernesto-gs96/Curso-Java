import java.util.Scanner;

public class EjemploArregloNotasAlumnos {
    public static void main(String[] args) {
        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumaNotasMatematicas, sumaNotasHistoria, sumaNotasLenguaje;

        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        sumaNotasMatematicas = 0;
        sumaNotasHistoria = 0;
        sumaNotasLenguaje = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 7 notas de estudiantes para matemáticas : ");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = s.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para historia : ");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = s.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para lenguaje : ");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = s.nextDouble();
        }

        for (int i = 0; i < claseMatematicas.length; i++) {
            sumaNotasMatematicas += claseMatematicas[i];
            sumaNotasHistoria += claseHistoria[i];
            sumaNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematicas = sumaNotasMatematicas/claseMatematicas.length;
        double promedioHistoria = sumaNotasHistoria/claseHistoria.length;
        double promedioLenguaje = sumaNotasLenguaje/claseLenguaje.length;
        double promedioTotal = (promedioMatematicas+promedioHistoria+promedioLenguaje)/3;

        System.out.println("Promedio clase matematicas : " + promedioMatematicas);
        System.out.println("Promedio clase historia : " + promedioHistoria);
        System.out.println("Promedio clase lenguaje : " + promedioLenguaje);
        System.out.println("Promedio total de las clases : " + promedioTotal);

        System.out.println("Ingrese el indentificador del alumno (de 0 - 6) : ");
        int id = s.nextInt();
        double promedioAlumno = (claseMatematicas[id]+claseHistoria[id]+claseLenguaje[id])/3;
        System.out.println("El promedio del alumno" + id + " es : " + promedioAlumno);
    }
}
