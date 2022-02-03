public class EjercicioOcho {
    private static int arrayGiganteRecursivo[] = new int[1400000];
    private static int arrayGiganteBurbuja[] = new int[1400000];
    private static int arrayGiganteDirecta[] = new int[1400000];

    public static void rellenarArray() {
        for (int i = 0; i < arrayGiganteRecursivo.length; i++) {
            arrayGiganteRecursivo[i] = (int) (Math.random() * 2E6);
        }
        for (int i = 0; i < arrayGiganteBurbuja.length; i++) {
            arrayGiganteBurbuja[i] = (int) (Math.random() * 2E6);
        }
        for (int i = 0; i < arrayGiganteDirecta.length; i++) {
            arrayGiganteDirecta[i] = (int) (Math.random() * 2E6);
        }
    }
    public static void ordenarRecursivo(int iz, int de) {
        int w;
        int i = iz;
        int j = de;
        int x = arrayGiganteRecursivo[(iz + de) / 2];

        do
        {
            while (arrayGiganteRecursivo[i] < x) i++;
            while (x < arrayGiganteRecursivo[j]) j--;

            if (i <= j) {
                w = arrayGiganteRecursivo[i];
                arrayGiganteRecursivo[i] = arrayGiganteRecursivo[j];
                arrayGiganteRecursivo[j] = w;
                i++;
                j--;
            }
        } while (i <= j);

        w = arrayGiganteRecursivo[i];
        arrayGiganteRecursivo[i] = arrayGiganteRecursivo[de];
        arrayGiganteRecursivo[de] = w;

        if (iz < j) ordenarRecursivo(iz, j);
        if (i < de) ordenarRecursivo(i, de);
    }
    public static void ordenacionBurbuja() {

        int i, j, num;

        for (i = 1; i < arrayGiganteBurbuja.length; i++) {
            for (j = arrayGiganteBurbuja.length - 1; j >= 1; j--) {
                if (arrayGiganteBurbuja[j - 1] > arrayGiganteBurbuja[j]) {
                    num = arrayGiganteBurbuja[j - 1];
                    arrayGiganteBurbuja[j - 1] = arrayGiganteBurbuja[j];
                    arrayGiganteBurbuja[j] = num;
                }
            }
        }

    }
    public static void ordenacionDirecta() {
        for (int i = 0; i < arrayGiganteDirecta.length - 1; i++) {
            for (int j = i + 1; j < arrayGiganteDirecta.length; j++) {
                if (arrayGiganteDirecta[i] > arrayGiganteDirecta[j]) {

                    int temporal = arrayGiganteDirecta[i];
                    arrayGiganteDirecta[i] = arrayGiganteDirecta[j];
                    arrayGiganteDirecta[j] = temporal;
                }
            }
        }
    }
    public static void printearArray() {
        for (int i : arrayGiganteBurbuja) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        EjercicioOcho.rellenarArray();

        long tiempoInicio = System.nanoTime();
        ordenarRecursivo(0, arrayGiganteRecursivo.length - 1);
        long tiempoFin = System.nanoTime();
        System.out.println("El tiempo que ha tardado el metodo recursivo es de " + (tiempoFin - tiempoInicio) + " nanosegundos");


        //Los tiempos del metodo de la burbuja de de la ordenacion directa son tan inmensos en comparacion
        //al recursivo, que parece que el programa se queda en un bucle infinito, pero en realidad tarda más
        //de 15 minutos en realizar el proceso en estos dos sistemas de ordenacion siguientes

        tiempoInicio = System.nanoTime();
        ordenacionBurbuja();
        tiempoFin = System.nanoTime();
        System.out.println("El tiempo que ha tardado el metodo de la burbuja es de " + (tiempoFin - tiempoInicio) + " nanosegundos");

        tiempoInicio = System.nanoTime();
        ordenacionDirecta();
        tiempoFin = System.nanoTime();
        System.out.println("El tiempo que ha tardado el método directo es de " + (tiempoFin - tiempoInicio) + " nanosegundos");

    }
}
