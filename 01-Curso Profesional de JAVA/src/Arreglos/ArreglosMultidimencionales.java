package Arreglos;

public class ArreglosMultidimencionales {
    public static void main(String[] args) {
        /*
         * Para ver los Arreglos Multidimencionales vamos a hacer el siguiente ejercicio:
         * Guardar calificaciones de los alumnos de sus diversar materias considerando lo siguiente:
         * AlumnoA toma 2 materias
         * AlumnoB toma 4 materias
         * AlumnoC toma 5 materias
         * AlumnoD toma 3 materias
         * AlumnoE toma 1 materia
         */

        int calificaciones[][] = new int[5][];

        calificaciones[0] = new int[2];
        calificaciones[1] = new int[4];
        calificaciones[2] = new int[5];
        calificaciones[3] = new int[3];
        calificaciones[4] = new int[1];

        // Alumno 1
        calificaciones[0][0] = 8;
        calificaciones[0][1] = 9;

        // Alumno 2
        calificaciones[1][0] = 10;
        calificaciones[1][1] = 8;
        calificaciones[1][2] = 8;
        calificaciones[1][2] = 9;

        // Alumno 3
        calificaciones[2][0] = 8;
        calificaciones[2][1] = 9;
        calificaciones[2][2] = 8;
        calificaciones[2][3] = 10;
        calificaciones[2][4] = 9;

        // Alumno 4
        calificaciones[3][0] = 8;
        calificaciones[3][1] = 9;
        calificaciones[3][2] = 10;

        // Alumno 5
        calificaciones[4][0] = 8;

        for (int[] alumno : calificaciones) {
            for (int calificacion : alumno) {
                System.out.print(calificacion + " ");
            }
            System.out.println("");
        }
    }
}
