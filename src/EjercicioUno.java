import java.util.Arrays;

public class EjercicioUno {
    private int arrayNumeros[] = new int [100];
    public void rellenarArray() {
        Arrays.fill(arrayNumeros, 0,100,-1);
    }
    public void representarArray() {
        for (int i : arrayNumeros) {
            System.out.print(i);
        }
    }
    public static void main(String[] args) {
        EjercicioUno nuevo = new EjercicioUno();

        System.out.println("Array de 100 números:");

        nuevo.rellenarArray();
        nuevo.representarArray();
    }
}
