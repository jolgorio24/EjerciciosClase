package ejerciciosCadenas;

import java.util.HashSet;
import java.util.Set;

public class EjercicioVeintinueve {
    private static String[][] alumnos = new String[2][10];
    private static int[] combinaciones = new int[20];
    private static HashSet<Integer> set = new HashSet<>();

    public static void rellenarArrayDatos() {
        alumnos[0][0] = "Harry Potter (Hogwarts)";
        alumnos[0][1] = "Sirius Black (Hogwarts)";
        alumnos[0][2] = "Alecto Carrow (Beauxbatons)";
        alumnos[0][3] = "Frank Bryce (Durmstrang)";
        alumnos[0][4] = "Terry Boot (Hogwarts)";
        alumnos[0][5] = "Regulus Arcturus Black (Hogwarts)";
        alumnos[0][6] = "Amycus Carrow (Beauxbatons)";
        alumnos[0][7] = "Colin Creevey (Durmstrang)";
        alumnos[0][8] = "Dirk Cresswell (Durmstrang)";
        alumnos[0][9] = "Amos Diggory (Beauxbatons)";

        alumnos[1][0] = "Hermione Granger (Hogwarts)";
        alumnos[1][1] = "Dilys Derwent (Durmstrang)";
        alumnos[1][2] = "Kendra Dumbledore (Durmstrang)";
        alumnos[1][3] = "Gabrielle DeLacour (Durmstrang)";
        alumnos[1][4] = "Arabella Figg (Beauxbatons)";
        alumnos[1][5] = "Merope Gaunt (Beauxbatons)";
        alumnos[1][6] = "Geller Grindelwald (Hogwarts)";
        alumnos[1][7] = "Rolanda Hooch (Hogwarts)";
        alumnos[1][8] = "Helga Hufflepuff (Hogwarts)";
        alumnos[1][9] = "Angelina Jhonson (Beauxbatons)";
    }
    public static void combinacionAleatoria() {
        for (int i = 0; i < combinaciones.length;) {
            int combinacionAlumno = (int) (Math.random() * 10);
            int combinacionSexo = i % 2 == 0 ? 1 : 2;

            int combinacion = combinacionSexo * 10 + combinacionAlumno;

            if (set.contains(combinacion))
                continue;

            set.add(combinacion);
            combinaciones[i++] = combinacion;

        }
    }
    public static String[] parejasAleatorias(int[] combinaciones) {
        String[] cadena = new String[alumnos[0].length];
        int y = 0;

         for (int i = 0; i < combinaciones.length; i++) {
             cadena[y] = alumnos[combinaciones[i] / 10 - 1][combinaciones[i] % 10]
             + " - " + alumnos[combinaciones[i + 1] / 10 - 1][combinaciones[++i] % 10];
             y++;
         }
         return cadena;
    }
    public static void representarParejas(String[] a) {
        int y = 1;
        for (String i : a) {
            System.out.println("Pareja " + y + " : " + i);
            y++;
        }
    }
    public static void main(String[] args) {
        rellenarArrayDatos();
        combinacionAleatoria();
        representarParejas(parejasAleatorias(combinaciones));

    }
}
