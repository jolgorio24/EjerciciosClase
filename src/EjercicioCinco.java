import java.util.Scanner;

public class EjercicioCinco {
    private static int arrayNumeros[] = new int [10];

    public static void rellenarArray() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println("Introduzca el número (negativo o positivo) " + (i + 1) + " de su serie de 10 números");
            arrayNumeros[i] = sc.nextInt();
        }
    }
    public static void sumaNumeros() {
        int acumPositivos = 0;
        int acumNegativos = 0;

        for (int i : arrayNumeros) {
            if (i > 0) {
                acumPositivos += i;
            } else {
                acumNegativos += i;
            }
        }
        System.out.println("La suma de todos los numeros positivos es de " + acumPositivos);
        System.out.println("La suma de todos los números negativos es de " + acumNegativos);
    }

    public static void main(String[] args) {
        rellenarArray();
        sumaNumeros();
    }
}
