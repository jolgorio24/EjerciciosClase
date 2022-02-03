package EjerciciosMatrices;

import java.util.Scanner;

public class EjercicioDiecisiete {
    private static int[][] matrizUno = new int[10][5];
    private static int[][] matrizDos = new int[10][5];
    private static int[][] suma = new int[10][5];

    public static void rellenarMatriz() {
        for (int i = 0; i < matrizUno.length; i++) {
            for (int y = 0; y < matrizUno[0].length; y++) {
                matrizUno[i][y] = (int) (Math.random() * 255);
                matrizDos[i][y] = (int) (Math.random() * 255);
            }
        }
    }
    public static void sumarMatriz() {
        for (int i = 0; i < suma.length; i++) {
            for (int y = 0; y < suma[0].length; y++) {
                suma[i][y] = matrizUno[i][y] + matrizDos[i][y];
            }
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
        sumarMatriz();
        representarMatriz(suma);
    }
}
