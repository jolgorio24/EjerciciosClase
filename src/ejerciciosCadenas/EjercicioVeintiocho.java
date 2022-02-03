package ejerciciosCadenas;

import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioVeintiocho {
    private static ArrayList<Integer> calculo = new ArrayList<>();
    public static int introducirCadena() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número decimal");
        String cadena = sc.nextLine();

        int valorCadena = Integer.parseInt(cadena);
        return valorCadena;
    }
    public static void calculoBinario(int numero) {
        int aux = 0;

        while (numero > 0) {
            aux = numero % 2 == 0 ? 0 : 1;
            calculo.add(aux);
            numero >>= 1;
        }
    }
    public static void representarArray() {
        System.out.println("Numero en binario: ");
        for (int i = calculo.size() - 1; i >= 0; i--) {
            System.out.print(calculo.get(i));
        }
    }
    public static void main(String[] args) {
        calculoBinario(introducirCadena());
        representarArray();
    }
}
