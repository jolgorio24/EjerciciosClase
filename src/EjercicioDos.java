import java.util.Arrays;

public class EjercicioDos {
    private int arrayPares[] = new int [100];
    private int arrayImpares[] = new int [100];

    public void rellenarArrayPares() {
        int num = 2;
        for (int i = 0; i < arrayPares.length; i++) {
            arrayPares[i] = num;
            num += 2;
        }
    }
    public void rellenarArrayImpares() {
        int num = 1;
        for (int i = 0; i < arrayImpares.length; i++) {
            arrayImpares[i] = num;
            num += 2;
        }
    }
    public void representarArray(int arrayNumeros[]) {
        for (int i : arrayNumeros) {
            System.out.print("-" + i + "-");
        }
    }
    public static void main(String[] args) {
        EjercicioDos nuevo = new EjercicioDos();

        nuevo.rellenarArrayPares();
        nuevo.rellenarArrayImpares();

        System.out.println("\nArray de números pares.");
        nuevo.representarArray(nuevo.arrayPares);
        System.out.println("\nArray de numeros impares");
        nuevo.representarArray(nuevo.arrayImpares);
    }
}
