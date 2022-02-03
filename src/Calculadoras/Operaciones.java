package Calculadoras;

public class Operaciones {
    private double numeroUno;
    private double numeroDos;
    private double resultado;
    Operaciones() {
        this.numeroUno = numeroUno;
        this.numeroDos = numeroDos;
    }
    Operaciones(double numA, double numB) {
        numeroUno = numA;
        numeroDos = numB;
    }
    public double operacionesNumeros(String operador) {
        switch (operador) {
            case "+":
                resultado = numeroUno + numeroDos;
                break;
            case "-":
                resultado = numeroUno - numeroDos;
                break;
            case "*":
                resultado = numeroUno * numeroDos;
                break;
            case "/":
                resultado = numeroUno / numeroDos;
                break;
        }
        return resultado;
    }
}
