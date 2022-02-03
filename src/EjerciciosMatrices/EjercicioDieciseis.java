package EjerciciosMatrices;

import java.util.Scanner;

public class EjercicioDieciseis {
    public static int[][] matrizTres = new int[3][5];

    public static void rellenarMatriz() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrizTres.length; i++) {
            for (int y = 0; y < matrizTres[0].length; y++) {
                System.out.println("Introduzca el numero de la columna " + (y + 1) + " en la fila " + (i + 1));
                matrizTres[i][y] = sc.nextInt();
            }
        }
    }
    public static void permutarMatriz() {
        int aux = 0;
        for (int i = 2; i < matrizTres.length; i++) {
            for (int y = 0; y < matrizTres[0].length; y++) {
                if (i == 2) {
                    aux = matrizTres[i - 2][y];
                    matrizTres[i - 2][y] = matrizTres[i][y];
                    matrizTres[i][y] = aux;
                }
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
        rellenarMatriz();
        representarMatriz(matrizTres);
        permutarMatriz();

        System.out.println();
        representarMatriz(matrizTres);
    }
}