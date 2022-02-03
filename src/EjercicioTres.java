import java.util.HashSet;
import java.util.Set;

public class EjercicioTres {
    private Set<Integer> set = new HashSet<>();
    private int arrayQuiniela[] = new int[6];

    public void rellenarArrayRandom() {
        //Usamos el set para comprobar que no se repiten elementos
        //por lo que la variable del bucle for solo suma si eso es asi
        for (int i = 0; i < arrayQuiniela.length; ) {
            int numero = (int) (Math.random() * 49);
            if (set.contains(numero))
                continue;

            arrayQuiniela[i++] = numero;
            set.add(numero);
        }
    }
    public void representarArray() {
        for (int i : arrayQuiniela) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        EjercicioTres nuevo = new EjercicioTres();

        System.out.println("Serie de seis números de la primitiva.");
        nuevo.rellenarArrayRandom();
        nuevo.representarArray();
    }
}
