package ejerciciosCadenas;

import java.util.Scanner;

public class EjercicioVeintiuno {
    public static StringBuffer revertirCadena() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca una cadena de texto.");
        StringBuffer cadena = new StringBuffer(sc.nextLine());

        return cadena.reverse();
    }

    public static void main(String[] args) {
        System.out.println("La cadena invertida es: " + revertirCadena());
    }
}
