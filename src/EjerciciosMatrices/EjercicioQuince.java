package EjerciciosMatrices;

import java.util.Scanner;

public class EjercicioQuince {
    private static int[][] matrizTres = new int[3][3];
    private static int sumaFila1 = 0;
    private static int sumaFila2 = 0;
    private static int sumaFila3 = 0;
    private static int sumaColumna1 = 0;
    private static int sumaColumna2 = 0;
    private static int sumaColumna3 = 0;

    public static void rellenarMatriz() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < matrizTres.length; i++) {
            for (int y = 0; y < matrizTres[0].length; y++) {
                System.out.println("Introduzca el numero de la columna " + (y + 1) + " en la fila " + (i + 1));
                matrizTres[i][y] = sc.nextInt();
            }
        }
    }
    public static void sumaFilas() {
        for (int i = 0; i < matrizTres.length; i++) {
            for (int y = 0; y < matrizTres[0].length; y++) {
                if (i == 0) sumaFila1 += matrizTres[i][y];
                sumaColumna1 = y == 0 ? sumaColumna1 + matrizTres[i][y] : sumaColumna1;

                if (i == 1) sumaFila2 += matrizTres[i][y];
                sumaColumna2 = y == 1 ? sumaColumna2 + matrizTres[i][y] : sumaColumna2;

                if (i == 2) sumaFila3 += matrizTres[i][y];
                sumaColumna3 = y == 2 ? sumaColumna3 + matrizTres[i][y] : sumaColumna3;
            }
        }
    }

    public static void main(String[] args) {
        rellenarMatriz();
        sumaFilas();

        System.out.println("El valor de la suma de la primera fila es de: " + sumaFila1 + " y de la primera columna: " + sumaColumna1);
        System.out.println("El valor de la suma de la primera fila es de: " + sumaFila2 + " y de la segunda columna: " + sumaColumna2);
        System.out.println("El valor de la suma de la primera fila es de: " + sumaFila3 + " y de la tercera columna: " + sumaColumna3);
    }
}
