public class EjercicioSeis {
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
    public static void main(String[] args) {
        rellenarArray();
        ordenarArrayGigante(0, arrayGigante.length - 1);
        printearArray();
    }
 }
