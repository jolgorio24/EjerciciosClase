package ejerciciosCadenas;

import java.util.Scanner;

public class EjercicioVeintidos {
    public static String insertaCadena() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte letras en minúscula o mayúscula para saber si están ordenadas");
        String cadena = sc.nextLine();

        return cadena;
    }
    public static boolean ordenada(String a) {
        boolean condicion = true;

        for (int i = 0; i < a.length(); i++) {
            if (condicion) {
                if (i > 0 && (int) a.charAt(i) < a.charAt(i - 1)) {
                    condicion = false;
                }
            }
        }
        return condicion;
    }

    public static void main(String[] args) {
        if (ordenada(insertaCadena()) == false) {
            System.out.println("No está ordenada alfabéticamente");
        } else {
            System.out.println("Está ordenada alfabéticamente");
        }

        ordenada(insertaCadena());
    }
}
