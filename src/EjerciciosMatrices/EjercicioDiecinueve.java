package EjerciciosMatrices;

import java.util.Scanner;

public class EjercicioDiecinueve {
    private static final int LONGITUD = 7;
    private static int[][] matriz = new int[LONGITUD][LONGITUD];

    public static void rellenarMatriz(int[][] a) {
        for (int i = 0; i < matriz.length; i++) {
            for (int y = 0; y < matriz[0].length; y++) {
                matriz[i][y] = (int) (Math.random() * 10);
            }
        }
    }
    public static void mostrarMatriz(int[][] a) {
        for (int[] i : a) {
            for (int y : i) {
                System.out.print("-" + y + "-");
            }
            System.out.println();
        }
    }
    public static void perimetro(int[][] a) {
        for (int i = 0; i < matriz.length; i++) System.out.print("-" + matriz[0][i] + "-");
        for (int i = 1; i < matriz.length; i++) System.out.print("-" + matriz[i][matriz.length - 1] + "-");
        for (int i = matriz.length - 2; i >= 0; i--) System.out.print("-" + matriz[matriz.length - 1][i] + "-");
        for (int i = matriz.length - 2; i > 0; i--) System.out.print("-" + matriz[i][0] + "-");
        System.out.println("\n");
    }
    public static void espiral(int[][] a) {
        //la variable movimientos es la cantidad maxima de repeticiones de los bucles que van a ocurrir
        //para calcular dicha espira, y dichos movimientos tienen siempre el mismo tamaño, que es
        //multiplicar por 2 la longitud de la matriz (en este caso es un cuadrado asi que será cualquiera de los dos)
        // y restarle 1.
        int movimientos = (LONGITUD * 2) - 1;
        int limite = matriz.length;

        //cada variable representa donde comienza cada uno de los 4 bucles, o donde acaba
        //utilizamos esta forma para controlar la representacion en espiral a la perfeccion
        int filaDerecha = 0;
        int columnaAbajo = matriz.length - 1;
        int filaIzquierda = matriz.length - 1;
        int columnaArriba = matriz.length - 2;

        int limiteAbajo = 0;
        int aux = 0;

        //4 bucles para cada lado de la matriz, como con el perímetro
        while (movimientos > 0) {
            for (int i = filaDerecha; i < limite; i++) System.out.print("-" + matriz[filaDerecha][i] + "-"); movimientos--; filaDerecha++;
            for (int i = filaDerecha; i < limite; i++) System.out.print("-" + matriz[i][columnaAbajo] + "-"); movimientos--; columnaAbajo--; limite--;
            for (int i = columnaAbajo; i >= limiteAbajo; i--) System.out.print("-" + matriz[filaIzquierda][i] + "-"); movimientos--; filaIzquierda--;
            for (int i = columnaArriba; i > limiteAbajo; i--) System.out.print("-" + matriz[i][aux] + "-"); movimientos--; columnaArriba--; limiteAbajo++; aux++;
        }
        System.out.println("\n");
    }
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        boolean condicion = true;

        while (condicion) {
            System.out.println("Introduzca la opción deseada a realizar.\n1) Mostrar la matriz por pantalla.\n2) Mostrar el perímetro de la matriz por pantalla.\n3) Mostrar el contenido de la matriz en forma de espiral.\n4) Salida del programa.");
            int decision = sc.nextInt();

            switch (decision) {
                case 1:
                    System.out.println("Matriz generada de forma aleatoria:");
                    mostrarMatriz(matriz);
                    break;
                case 2:
                    System.out.println("Números que conforman perímetro de la matriz:");
                    perimetro(matriz);
                    break;
                case 3:
                    System.out.println("Numeros que conforman la matriz representados en forma de espiral:");
                    espiral(matriz);
                    break;
                case 4:
                    condicion = false;
                    break;
                default:
                    System.out.println("No se ha reconocido la opción. Vuelva a intentarlo");
                    condicion = false;
                    menu();
            }
        }
    }
    public static void main(String[] args) {
        rellenarMatriz(matriz);
        menu();
    }
}
