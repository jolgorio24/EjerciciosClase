package EjerciciosMatrices;

import java.util.Scanner;

public class EjercicioDieciocho {
    public static int[][] matrizCinco = new int[5][5];

    public static void rellenarMatriz() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrizCinco.length; i++) {
            for (int y = 0; y < matrizCinco[0].length; y++) {
                System.out.println("Introduzca el numero de la columna " + (y + 1) + " en la fila " + (i + 1));
                matrizCinco[i][y] = sc.nextInt();
            }
        }
    }
    public static void diagonalPrincipal() {
        for (int i = 0; i < matrizCinco.length; i++) {
            System.out.print("-" + matrizCinco[i][i] + "-");
        }
    }
    public static void triangularSuperior() {
        int limite = 1;
        for (int i = 1; i < matrizCinco.length; i++) {
            for (int y = 0; y < limite; y++) {
                System.out.print("-" + matrizCinco[i][y] + "-");
            }
            if (limite < matrizCinco[0].length) {
                limite++;
            }
            System.out.println();
        }
    }
    public static void representarMatriz(int[][] a) {
        for (int[] i : a) {
            for (int y : i) {
                System.out.print("-" + y + "-");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rellenarMatriz();
        representarMatriz(matrizCinco);

        System.out.println();
        diagonalPrincipal();
        System.out.println("\n");
        triangularSuperior();
    }
}
