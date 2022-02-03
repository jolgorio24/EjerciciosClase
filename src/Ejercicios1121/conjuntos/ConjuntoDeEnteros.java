package Ejercicios1121.conjuntos;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoDeEnteros implements Conjunto {
    private static Set<Integer> pares = new HashSet<>();
    private static Set<Integer> impares = new HashSet<>();

    @Override
    public void borrarElemento(int a) {
        if (a % 2 == 0) {
            pares.remove(a);
        } else {
            impares.remove(a);
        }
    }

    @Override
    public void insertarElemento(int a) {
        if (a % 2 == 0) {
            pares.add(a);
        } else {
            impares.add(a);
        }
    }

    @Override
    public void vaciarConjunto(int a) {
        if (a % 2 == 0) {
            pares.clear();
        } else {
            impares.clear();
        }
    }

    @Override
    public int esta(int a) {
        int valor = 0;
        if (a % 2 == 0) {
            valor = pares.contains(a) ? 2 : 0;
        } else {
            valor = impares.contains(a) ? 1 : 0;
        }
        return valor;
    }
    public static void printearConjunto() {
        for (Object i : impares) System.out.println(i);
    }
}
