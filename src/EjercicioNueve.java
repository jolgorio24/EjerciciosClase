import java.util.Scanner;

public class EjercicioNueve {
    private static int arrayCreciente[] = new int[11];

    public static void rellenarArray() {
        int rango = 91;

        for (int i = 0; i < arrayCreciente.length - 1; i++) {
            arrayCreciente[i] = (int) (Math.random() * rango);
            rango++;
            while (i != 0 && arrayCreciente[i] <= arrayCreciente[i - 1]) {
                arrayCreciente[i] = (int) (Math.random() * rango);
            }
        }
    }

    public static void printearArray() {
        for (int i : arrayCreciente) {
            if (i != 0) {
                System.out.print(" " + i + " ");
            }
        }
        System.out.println();
    }

    public static void ordenacionBurbuja(int array[]) {
        int i, j, num;

        for (i = 1; i < array.length; i++) {
            for (j = array.length - 1; j >= 1; j--) {
                if (array[j - 1] > array[j]) {
                    num = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = num;
                }
            }
        }
    }

    public static void introducirDato() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número entre " + arrayCreciente[0] + " y " + arrayCreciente[arrayCreciente.length - 2] + ". El número debe comprender esos dos números");
        arrayCreciente[arrayCreciente.length - 1] = sc.nextInt();

        while (arrayCreciente[arrayCreciente.length - 1] < arrayCreciente[0] || arrayCreciente[arrayCreciente.length - 1] > arrayCreciente[arrayCreciente.length - 2]) {
            System.out.println("El número no cumple con los requisitos previstos. Escríbalo de nuevo a continuación");
            arrayCreciente[arrayCreciente.length - 1] = sc.nextInt();
        }
    }

    public static void main(String[] args) {
        rellenarArray();
        printearArray();

        introducirDato();
        ordenacionBurbuja(arrayCreciente);
        printearArray();

    }
}
