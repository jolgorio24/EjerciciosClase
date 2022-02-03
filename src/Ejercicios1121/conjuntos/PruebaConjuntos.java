package Ejercicios1121.conjuntos;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PruebaConjuntos {
    public static boolean condicion = true;


    public static void main(String[] args) {
        ConjuntoDeCaracteres nuevo = new ConjuntoDeCaracteres();
        ConjuntoDeEnteros nuevo2 = new ConjuntoDeEnteros();

        Scanner sc = new Scanner(System.in);

        nuevo.rellenarConjunto();

        System.out.println("Introduzca una letra minúscula o una letra mayúsucla");
        String letra = sc.nextLine();


        if (letra.length() >= 2) {
            System.out.println("Debe ser un único caracter. Inténtelo de nuevo");
            letra = sc.nextLine();
        }

        if (nuevo.esta(letra.charAt(0)) == 2) {
            System.out.println("La letra escrita es una letra minúscula.");
        } else if (nuevo.esta(letra.charAt(0)) == 1) {
            System.out.println("La letra escrita es una letra mayúscula");
        } else {
            System.out.println("No es ni una letra mayúscula ni una letra minúscula");
        }

        System.out.println();

        while (condicion) {
            System.out.println("Introduzca números enteros para rellenar los conjuntos. \nIntroduzca un número negativo para parar.");
            int numero = sc.nextInt();

            if (numero > 0) {
                nuevo2.insertarElemento(numero);
            } else {
                condicion = false;
            }
        }

        System.out.println("Introduzca un número para reconocer si es par o impar dentro del conjunto");
        try {
            int valor = nuevo2.esta(sc.nextInt());

            if (valor == 2) {
                System.out.println("El número introducido es par");
            } else if (valor == 1) {
                System.out.println("El número introducido es impar");
            } else {
                System.out.println("No se encuentra en la lista");
            }
        } catch (InputMismatchException e) {
            System.out.println("No es ni un número par ni un número impar");
        }
    }
}
