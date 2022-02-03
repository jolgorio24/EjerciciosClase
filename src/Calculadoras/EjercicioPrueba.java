package Calculadoras;

public class EjercicioPrueba {
    private static int arrayGiganteDirecta[] = new int[1400000];

    public static void rellenarArray() {
        for (int i = 0; i < arrayGiganteDirecta.length; i++) {
            arrayGiganteDirecta[i] = (int) (Math.random() * 2E6);
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
    public static void main(String[] args) {
        EjercicioPrueba.rellenarArray();

        long tiempoInicio = System.nanoTime();
        ordenacionDirecta();
        long tiempoFin = System.nanoTime();
        System.out.println("El tiempo que ha tardado el metodo directo es de " + (tiempoFin - tiempoInicio) + " nanosegundos");

    }
}