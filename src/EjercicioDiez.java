public class EjercicioDiez {
    //inicializamos dos arrays con 100 espacios de memoria adicionales para realizar la suma
    //aunque sea más de lo necesario probablemente
    private static int arrayUno[] = new int[1100];
    private static int arrayDos[] = new int[1100];

    public static void rellenarArray(int array[]) {
        //inicializamos el array desde atrás para poder sumar, ya que necesitaremos
        //arrastrar los resultados de la suma entre digitos hacia adelante
        for (int i = array.length - 1; i > 100; i--) {
            array[i] = (int) (Math.random() * 10);
        }
    }
    public static void printArray(int array[]) {
        //para printear, ignoraremos los 0s iniciales y después printearemos todo lo demás
        boolean condicion = false;
        for (int i : array) {
            if (i != 0) condicion = true;
            if (condicion == true) System.out.print(i);
        }
        System.out.println();
    }
    public static void sumaArray(int arrayUno[], int arrayDos[]) {
        //la suma es simple, se trata de sumar los dos digitos, y si el numero supera
        // o iguala el numero 10, sumará su valor dividido entre 10 al siguiente digito
        // que en este caso será la posicion -1. Después el valor del numero anterior que
        // es mayor que nueve, será igual al módulo de dicho número

        for (int i = arrayUno.length - 1; i > 0; i--) {
           arrayUno[i] += arrayDos[i];
           if (arrayUno[i] >= 10) {
               arrayUno[i - 1]  = arrayUno[i] / 10 + arrayUno[i - 1];
               arrayUno[i] = arrayUno[i] % 10;
           }
        }
    }
    public static void main(String[] args) {
        rellenarArray(arrayUno);
        rellenarArray(arrayDos);

        System.out.println("Array 1: ");
        printArray(arrayUno);
        System.out.println("\n");

        System.out.println("Array 2: ");
        printArray(arrayDos);
        System.out.println("\n");

        sumaArray(arrayUno, arrayDos);
        System.out.println("Suma de los dos arrays:");
        printArray(arrayUno);

    }
}
