package ejerciciosCadenas;
import java.util.Scanner;
import java.util.StringTokenizer;

public class EjercicioVeinticinco {
    private static String[] cadena1;
    private static String[] cadena2;
    private static StringTokenizer cad1;
    private static StringTokenizer cad2;

    public static void rellenarCadenas() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca la primera cadena de texto");
        cad1 = new StringTokenizer(sc.nextLine());

        System.out.println("Introduzca la segunda cadena de texto");
        cad2 = new StringTokenizer(sc.nextLine());
    }
    public static String[] modificarArray(String[] b, StringTokenizer a) {
        b = new String[a.countTokens()];
        int i = 0;

        while (a.hasMoreElements()) {
            b[i] = a.nextToken();
            i++;
        }
        return b;
    }
    public static void comprobarCoincidencias(String[] a, String[] b) {
        for (int i = 0; i < a.length; i++) {
            for (int y = 0; y < b.length; y++) {
                if (a[i].equals(b[y])) {
                    StringBuffer mod = new StringBuffer(a[i]);
                    for (int j = 0; j < a[i].length(); j++) {
                        mod.replace(j, a[i].length(), "*");
                    }
                    a[i] = mod.toString();
                }
            }
        }
        System.out.println("Cadena modificada con las coincidencias: ");
        for (String i : a) {
            System.out.print(i + " ");
        }
    }
    public static void representarArray(String[] a) {
        for (int i = 0;i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
    public static void main(String[] args) {
        rellenarCadenas();
        comprobarCoincidencias((modificarArray(cadena1, cad1)), modificarArray(cadena2, cad2));
    }
}
