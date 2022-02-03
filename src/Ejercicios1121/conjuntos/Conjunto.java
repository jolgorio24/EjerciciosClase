package Ejercicios1121.conjuntos;

public interface Conjunto {
    default void insertarElemento(char a) {
    }
    default void insertarElemento(int a) {

    }
    default void borrarElemento(char a) {
    }
    default void borrarElemento(int a) {

    }
    default void vaciarConjunto(char a) {
    }
    default void vaciarConjunto(int a) {

    }
     default int esta(char a) {
        return 0;
     }
     default int esta(int a) {
        return 0;
     }
}
