package ejerciciosCadenas;

import java.util.Scanner;

public class EjercicioVeintiseis {
    public static char[][] sopaLetras = new char[8][8];

    public static void rellenarSopa(char[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int y = 0; y < a[0].length; y++) {
                a[i][y] = (char) ('A' + (int) (Math.random() * 26));
            }
        }
    }
    public static String palabraUsuario() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una palabra de máximo 8 caracteres");
        String palabra = sc.nextLine();

        while (palabra.length() > sopaLetras.length || palabra.length() <= 0) {
            System.out.println("La palabra se sale de los límites. Vuelve a intentarlo");
            palabra = sc.nextLine();
        }
        return palabra;
    }
    public static void introducirPalabra(char[][]a, String b) {
        int posicionPalabra = (int) (Math.random() * 7);

        for (int i = 0; i < b.length(); i++) {
            a[posicionPalabra][i] = b.charAt(i);
        }
    }
    public static void representarSopa (char[][] a) {
        for (char[] b : a) {
            for (char c : b) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rellenarSopa(sopaLetras);
        introducirPalabra(sopaLetras, palabraUsuario());
        representarSopa(sopaLetras);
    }
}
