package Calculadoras;//Crear un programa Java que lea 25 números enteros ordenados de menor a mayor
//y que permita llamar a un método de búsqueda secuencial y otro método de busqueda binaria

import java.util.Scanner;

public class EjercicioUno {
    private static int[] numeros = new int[25];

    public static int busquedaSecuencial(int dato) {
        int posicion = -1;

        for (int i = 0; i < numeros.length; i++) {
            if (dato == numeros[i]) {
                posicion = i;
            }
        }
        return posicion;
    }
    public static int busquedaBinaria(int dato) {
        int encontrado = 0;
        int izq = 0;
        int mitad = 0;
        int der = numeros.length - 1;

        while ((izq < der -1) && (encontrado == 0)) {
            mitad = izq + ((der - izq) / 2);

            if (numeros[mitad] == dato) encontrado = 1;
            if (numeros[mitad] > dato) der = mitad;
            if (numeros[mitad] < dato) izq = mitad;
        }

        if (encontrado == 1) {
            return mitad;
        } else {
            return -1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Introduzca el numero " + (i  + 1) + " de la serie de 25 números");

            int num = sc.nextInt();
            numeros[i] = num;
        }

        System.out.println("Introduzca el número que desea encontrar");
        int dato = sc.nextInt();

        if (busquedaSecuencial(dato) != -1) {
            System.out.println("La posicion de el número buscado en el array es " + busquedaSecuencial(dato));
        } else {
            System.out.println("El número buscado no se encuentra en el array");
        }
        System.out.println("");

        if (busquedaBinaria(dato) != -1) {
            System.out.println("La posicion de el número buscado en el array es " + busquedaSecuencial(dato));
        } else {
            System.out.println("El número buscado no se encuentra en el array");
        }
    }
}
