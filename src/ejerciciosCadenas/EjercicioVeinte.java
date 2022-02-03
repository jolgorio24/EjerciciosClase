package ejerciciosCadenas;

import java.util.Scanner;

public class EjercicioVeinte {

    public static StringBuffer introducirCadena() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena de texto.");
        StringBuffer cadena = new StringBuffer(sc.nextLine());

        return cadena;
    }
    public static StringBuffer modificarCadena(StringBuffer a) {

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                a.setCharAt(i, '*');
            }
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("La cadena modificada es: ");

        System.out.println(modificarCadena(introducirCadena()));
    }
}
