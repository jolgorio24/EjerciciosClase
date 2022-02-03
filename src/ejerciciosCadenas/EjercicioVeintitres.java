package ejerciciosCadenas;

import java.util.Scanner;

public class EjercicioVeintitres {
    private static int[] vocales = new int[5];

    public static String insertaCadena() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte una cadena de texto para conocer el número de vocales de cada una de ellas");
        String cadena = sc.nextLine();

        return cadena;
    }

    public static void contarVocales(String a) {
        for (int i = 0; i < a.length(); i++) {
            switch (a.charAt(i)) {
                case 'a':
                    vocales[0]++;
                    break;
                case 'e':
                    vocales[1]++;
                    break;
                case 'i':
                    vocales[2]++;
                    break;
                case 'o':
                    vocales[3]++;
                    break;
                case 'u':
                    vocales[4]++;
                    break;
            }
        }
    }
    public static void representarVocales(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (i == 0) System.out.println("A: " + a[i]);
            if (i == 1) System.out.println("E: " + a[i]);
            if (i == 2) System.out.println("I: " + a[i]);
            if (i == 3) System.out.println("O: " + a[i]);
            if (i == 4) System.out.println("U: " + a[i]);
        }
    }

    public static void main(String[] args) {
        contarVocales(insertaCadena());
        representarVocales(vocales);
    }
}
