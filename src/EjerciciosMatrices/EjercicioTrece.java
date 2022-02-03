package EjerciciosMatrices;

import java.util.Arrays;

public class EjercicioTrece {
    public static int[][] matrizSimple = new int[10][10];

    public static void rellenarMatriz(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int y = 0; y < a[0].length; y++) {
                a[i][y] = -1;
            }
        }
    }
    public static void representarMatriz(int[][] a) {
        for (int[] i : a) {
            for (int y : i) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        rellenarMatriz(matrizSimple);
        representarMatriz(matrizSimple);
    }
}
