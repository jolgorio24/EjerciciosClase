import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class EjercicioColas {
    private static Queue<Integer> cola = new LinkedList<>();

    public static void pedidoDeDados() {
        Scanner sc = new Scanner(System.in);
        boolean condicion = true;

        while (condicion) {
            System.out.println("¿Desea realizar una tirada?\n1) Si sí desea realizar una tirada\2) Si desea parar");
            int decision = sc.nextInt();

            if (decision == 1) {
                introducirTirada();
            } else {
                System.out.println("A continuación se representarán las tiradas en orden de generación");
                representarTiradas();
                condicion = false;
            }
        }
    }
    public static void introducirTirada() {
        int azar = (int) (Math.random() * 6 + 1);
        System.out.println("Su tirada ha sido el numero" + azar);
        cola.add(azar);
    }
    public static void representarTiradas() {
        //for (Integer i : cola) {
        //    System.out.println(i);
        //}
        int numTirada = 0;
        while (!cola.isEmpty()) {
            System.out.print("-" + cola.poll() + "-");
            numTirada++;
        }

        System.out.println("\nNumero de tiradas: " + numTirada);
    }

    public static void main(String[] args) {
        pedidoDeDados();
    }
}
