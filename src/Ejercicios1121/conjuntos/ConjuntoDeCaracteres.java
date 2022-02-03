package Ejercicios1121.conjuntos;
import java.util.HashSet;
import java.util.Set;

public class ConjuntoDeCaracteres implements Conjunto {
    private static Set<Character> mayusculas = new HashSet<>();
    private static Set<Character> minusculas = new HashSet<>();

    public void rellenarConjunto() {
        for (int i = 0; i < 26; i++) {
            mayusculas.add((char) ('A' + i));
            minusculas.add((char) ('a' + i));
        }
        mayusculas.add('Ñ');
        minusculas.add('ñ');
    }

    @Override
    public void insertarElemento(char a) {
        if ((int) a > (int) 'Z') {
            minusculas.add(a);
        } else {
            mayusculas.add(a);
        }
    }

    @Override
    public void borrarElemento(char a) {
        if ((int) a > (int) 'Z') {
            minusculas.remove(a);
        } else {
            mayusculas.remove(a);
        }
    }

    @Override
    public void vaciarConjunto(char a) {
        if ((int) a > (int) 'Z') {
             minusculas.clear();
        } else {
            mayusculas.clear();
        }
    }

    @Override
    public int esta(char a) {
        int valor = 0;
        if (mayusculas.contains(a) && a == 'Ñ') valor = 1;
        if ((int) a > (int) 'Z') {
            for (char b : minusculas) {
                if (a == (b)) {
                    valor = 2;

                }
            }
        } else {
            for (char b : mayusculas) {
                if (a == (b)) {
                    valor = 1;
                }
            }
        }
        return valor;
    }
    public static void printearConjunto(Set a) {
        for (Object i : a) {
            System.out.println(a);
        }
    }
}
