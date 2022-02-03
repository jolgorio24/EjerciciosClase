package ejerciciosCadenas;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EjercicioVeinticuatro {
    private static String cadenaUno = "";
    private static StringBuffer cadenaDos;

    public static StringTokenizer introducirCadena() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena de texto.");
        StringTokenizer cadena = new StringTokenizer(sc.nextLine());

        return cadena;
    }
    public static void stringTokenizer (StringTokenizer a) {
        while (a.hasMoreTokens()) {
            cadenaUno += (a.nextToken());
        }
    }
    public static void limpiarAcentuaciones(String a) {
    StringBuffer cadenaLimpia = new StringBuffer(a);
        for (int i = 0; i < cadenaLimpia.length(); i++) {
            if (cadenaLimpia.charAt(i) == 'á') cadenaLimpia.setCharAt(i, 'a');
            if (cadenaLimpia.charAt(i) == 'é') cadenaLimpia.setCharAt(i, 'e');
            if (cadenaLimpia.charAt(i) == 'í') cadenaLimpia.setCharAt(i, 'i');
            if (cadenaLimpia.charAt(i) == 'ó') cadenaLimpia.setCharAt(i, 'o');
            if (cadenaLimpia.charAt(i) == 'ú') cadenaLimpia.setCharAt(i, 'u');
        }
        cadenaDos = cadenaLimpia;
    }
    public static StringBuffer reverseCadena (StringBuffer a) {
        StringBuffer cadenaDosCopia = new StringBuffer(a);
        cadenaDosCopia.reverse();
        return cadenaDosCopia;
    }
    public static boolean comparador(StringBuffer a, StringBuffer b) {
        int acum = 0;
        boolean condicion;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != (b.charAt(i))) {
                acum++;
            }
        }
        if (acum > 0) {
            condicion = false;
        } else {
            condicion = true;
        }
        return condicion;
    }
    public static void main(String[] args) {
        stringTokenizer(introducirCadena());
        limpiarAcentuaciones(cadenaUno);

        if (comparador(cadenaDos, reverseCadena(cadenaDos)) == true) {
            System.out.println("La cadena es un palindromio");
        } else {
            System.out.println("La cadena no es un palindromio");
        }
    }
}
