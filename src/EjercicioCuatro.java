import java.util.Scanner;

public class EjercicioCuatro {
    private static int arrayNumeros[] = new int [10];

    public static void rellenarArray() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println("Introduzca el número entero " + (i + 1) + " de su serie de 10 números enteros");
            arrayNumeros[i] = sc.nextInt();

            while (arrayNumeros[i] < 0) {
                System.out.println("Introduzca números enteros, inténtelo de nuevo.");
                arrayNumeros[i] = sc.nextInt();
            }
        }
    }
    public static int calculoMedia() {
        int acumulador = 0;

        for (int i = 0; i < arrayNumeros.length; i++) {
            acumulador += arrayNumeros[i];
        }
        acumulador /= arrayNumeros.length;
        return acumulador;
    }
    public static void valoresMayores() {

        for (int i : arrayNumeros) {
            if (i > calculoMedia()) {
                System.out.println("Numeros mayores a la media dentro del array: " + i);
            }
        }
    }

    public static void main(String[] args) {
        rellenarArray();
        valoresMayores();
    }
}
