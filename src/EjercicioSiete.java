import java.util.Scanner;

public class EjercicioSiete {
    private static int arrayGigante[] = new int[1000000];

    public static void rellenarArray() {
        for (int i = 0; i < arrayGigante.length; i++) {
            arrayGigante[i] = (int) (Math.random() * 2E6);
        }
    }
    public static void ordenarArrayGigante(int iz, int de) {
        int w;
        int i = iz;
        int j = de;
        int x = arrayGigante[(iz + de) / 2];

        do
        {
            while (arrayGigante[i] < x) i++;
            while (x < arrayGigante[j]) j--;

            if (i <= j) {
                w = arrayGigante[i];
                arrayGigante[i] = arrayGigante[j];
                arrayGigante[j] = w;
                i++;
                j--;
            }
        } while (i <= j);

        w = arrayGigante[i];
        arrayGigante[i] = arrayGigante[de];
        arrayGigante[de] = w;

        if (iz < j) ordenarArrayGigante(iz, j);
        if (i < de) ordenarArrayGigante(i, de);
    }
    public static void printearArray() {
        for (int i : arrayGigante) {
            System.out.println(i);
        }
    }
    public static void busquedaArray() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número entre el 0 y 2Millones para saber en qué posicion del array se encuentra");
        int num = sc.nextInt();


        int mitad = 0;
        int de = arrayGigante.length - 1;
        int iz = 0;
        int encontrado = 0;

        long tiempoInicio = System.nanoTime();

        while ((iz < de - 1) && (encontrado == 0)) {
            mitad = iz + ((de - iz) / 2);
            if (arrayGigante[mitad] == num) {
                encontrado = 1;
            } else if (arrayGigante[mitad] > num) {
                de = mitad;
            } else if (arrayGigante[mitad] < num) {
                iz = mitad;
            }
        }
        long tiempoFin = System.nanoTime();

        if (encontrado == 1) {
            System.out.println("El elemento buscado se encuentra en la posición " + mitad + ".");
            System.out.println("El tiempo que ha tardado la busqueda binaria en realizar el proceso es de " + (tiempoFin - tiempoInicio) + " nanosegundos");
        } else {
            System.out.println("El elemento buscado no se encuentra en el array.");
            System.out.println("El tiempo que ha tardado la busqueda binaria en realizar el proceso es de " + (tiempoFin - tiempoInicio) + " nanosegundos");
        }
    }
    public static void main(String[] args) {
        rellenarArray();
        ordenarArrayGigante(0, arrayGigante.length - 1);
        busquedaArray();
    }
}
