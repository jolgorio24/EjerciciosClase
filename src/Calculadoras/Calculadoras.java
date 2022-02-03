package Calculadoras;

import java.util.Scanner;

public class Calculadoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean condicion = true;

        while (condicion) {
            System.out.println("Introduzca un número para realizar sus operaciones");
            double numeroUno = sc.nextDouble();

            System.out.println("Introduzca un segundo número para realizar sus operaciones");
            double numeroDos = sc.nextDouble();
            sc.nextLine();

            System.out.println("Introduzca + para sumar, - para restar, * para multiplicar, / para dividir sus numeros en orden de entrada");
            String operador = sc.nextLine();

            Operaciones operacion = new Operaciones(numeroUno, numeroDos);
            System.out.println("Su resultado es: " + operacion.operacionesNumeros(operador));

            System.out.println("Introduzca S, si desea continuar realizando operaciones o cualquier otro carácter o número si desea terminar de operar");
            String continuar = sc.nextLine();

            if (continuar.equals("S")) {
                condicion = true;
            } else {
                condicion = false;
                System.out.println("¡Gracias por usar la calculadora!");
            }
        }
    }
}
