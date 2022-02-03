package ejerciciosCadenas;

import java.util.Scanner;
import java.util.StringTokenizer;

public class EjercicioVeintisiete {
    public static StringTokenizer introducirFrase() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una frase cualquiera para contar sus palabras.");
        StringTokenizer cadena = new StringTokenizer(sc.nextLine());
        return cadena;
    }
    public static void representarFrase(StringTokenizer a) {
        int i = 1;
        while (a.hasMoreElements()) {
            System.out.println("Palabra " + i + ": " + a.nextToken());
            i++;
        }
        System.out.println("Total palabras: " + i);
    }

    public static void main(String[] args) {
        representarFrase(introducirFrase());
    }
}
