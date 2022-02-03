public class EjercicioOnce {
    //Establecemos dos tipos de longitud para nuestros arrays y matrices.
    private final static int LONGITUD_A = 11;
    private final static int LONGITUD_B = 21;

    //Inicializamos un array para cada operacion.
    private static int arrayUno[] = new int[LONGITUD_A];
    private static int arrayDos[] = new int[LONGITUD_A];
    private static int suma[] = new int[LONGITUD_A];
    private static int resta[] = new int[LONGITUD_A];
    //Multiplicar usará LONGITUD B debido a que su tamaño en cifras puede ser bastante mayor que la de LONGITUD A
    private static int multiplicar[] = new int[LONGITUD_B];

    public static void rellenarArray(int array[]) {
        //El bucle por defecto para añadir numeros aleatorios del 0 al 9
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = (int) (Math.random() * 10);
        }
    }
    public static void printArray(int array[]) {
        //Este método lo que, ya que nuestro array se inicializa desde atrás (la ultima posicion del array) hasta adelante,
        //ignorará los 0s iniciales que no significarán ningíun valor dentro de nuestras operaciones
        boolean condicion = false;
        for (int i : array) {
            if (i != 0) condicion = true;
            if (condicion == true) System.out.print(i);
        }
        System.out.println();
    }
    public static void sumaArray(int arrayUno[], int arrayDos[]) {
    //La suma, al igual que en el ejercicio 10, comenzará sumando desde atrás hacia adelante
    //llevandose consigo el acarreo cuando se sumen numeros y sea mayor a 9
        for (int i = arrayUno.length - 1; i > 0; i--) {
            suma[i] = (suma[i] + arrayUno[i]) + arrayDos[i];
        if (suma[i] >= 10) {
                suma[i - 1]  = suma[i] / 10 + suma[i - 1];
                suma[i] = suma[i] % 10;
            }
        }
    }
    public static void restaArray(int arrayUno[], int arrayDos[]) {
        //Para la resta, utilizamos dos variables acumuladoras, que lo que harán será
        //establecer cuál de los dos arrays que introducimos para realizar la resta
        //es el mayor de los dos, y en base a eso, realizar la resta del mayor menos el menor
        int acum1 = 0;
        int acum2 = 0;

        //Este bucle es el encargado de hacer lo mencionado anteriormente
        for (int i = 0; i < arrayUno.length; i++) {
            if (arrayUno[i] > arrayDos[i]) {
                acum1++;
                break;
            }
            if (arrayDos[i] > arrayUno[i]) {
                acum2++;
                break;
            }
        }

        //Si acum1 es mayor a 0, significa que arrayUno es mayor a arrayDos, por lo tanto restaremos
        //arrayUno - arrayDos
        if (acum1 > 0) {
            //Al igual que la suma, se restará desde atrás y se realizará un acarreo cuando
            //el resultado de la resta sea menor a 0.
            for (int i = arrayUno.length - 1; i > 0; i--) {
                if (arrayDos[i] > arrayUno[i]) {
                    resta[i] = (resta[i] + (arrayUno[i] + 10)) - arrayDos[i];
                    resta[i - 1] = resta[i - 1] - 1;
                } else {
                    //esto es un ajuste para la condicion excepcional de cuando se haya
                    //realizado un acarreo, y en la siguiente resta los dos numeros que van a ser restados sean iguales
                    //no se restaba correctamente.
                    if (resta[i] == -1 && arrayUno[i] == arrayDos[i]) {
                        resta[i] = 9;
                        resta[i - 1] = resta[i - 1] - 1;
                    } else {
                        resta[i] = (resta[i] + (arrayUno[i]) - arrayDos[i]);
                    }
                }
                //con esto quitamos el valor negativo de todos los acarreos.
                if (resta[i] < 0) resta[i] = Math.abs(resta[i]);
            }
        }
        //Si acum2 es mayor a 0, significa que arrayDos es mayor a arrayUno, por lo tanto restaremos
        //arrayDos - arrayUno
        if (acum2 > 0) {
            for (int i = arrayDos.length - 1; i > 0; i--) {
                if (arrayDos[i] < arrayUno[i]) {
                    resta[i] = (resta[i] + (arrayDos[i] + 10)) - arrayUno[i];
                    resta[i - 1] = resta[i - 1] - 1;
                } else {
                    if (resta[i] == -1 && arrayUno[i] == arrayDos[i]) {
                        resta[i] = 9;
                        resta[i - 1] = resta[i - 1] - 1;
                    } else {
                        resta[i] = (resta[i] + (arrayDos[i]) - arrayUno[i]);
                    }
                }
            }
        }
        //ya que estamos restando el mayor menos el menor, en esta circunstancia independientemente de eso
        //el menor sigue siendo el que está siendo restado, por lo que ponemos su primer digito en negativo
        if (acum2 > 0) {
            for (int i = 0; i < resta.length; i++) {
                if (resta[i] != 0) {
                    resta[i] *= -1;
                    break;
                }
            }
        }
    }
    public static void multiplicacionArray(int a[], int b[]) {
        //Necesitamos una matriz para guardar todas las multiplicaciones, asi que
        //creamos una que guarde el resultado de cada multiplicacion
        int multiplicacion[][] = new int[LONGITUD_A][LONGITUD_B];

        //multiplicado registra la longitud maxima del arrayA y, multiplicador la longitud maxima del arrayB
        //los usaremos para realizar las multiplicaciones de cada número MULTIPLICADO, por todos los que
        //lo van a MULTIPLICAR, es decir, el MULTIPLICADOR
        int multiplicado = a.length - 1;
        int multiplicador = b.length - 1;
        int limiteA = multiplicacion[0].length - 1;
        int limiteB = a.length - 1;


        for (int i = 0; i < multiplicacion.length; i++) {
            for (int y = limiteA; y > limiteB - 1; y--) {
                //este doble bucle for, mutiplica cada numero del arrayA por todos los valores del arrayB,
                //y los guarda en la matriz
                multiplicacion[i][y] += a[multiplicado] * b[multiplicador];
                multiplicado--;

                //este if hace que si el valor de la multiplicacion es superior a 9, se acarrea el valor
                //a la siguiente posicion de memoria, dejando a la posicion actual con un valor inferior a 10 siempre
                if (multiplicacion[i][y] >= 10) {
                    multiplicacion[i][y - 1] += multiplicacion[i][y] / 10;
                    multiplicacion[i][y] %= 10;
                }
            }
            limiteB--;
            limiteA--;
            multiplicador--;
            multiplicado = arrayDos.length - 1;
        }
        int posicionDigito = multiplicar.length - 1;

        //el siguiente bucle, ejecuta la suma de la matriz y nos rellena nuestro array multiplicacion
        for (int i = multiplicar.length - 1; i > 0; i--) {
            for (int y = 0; y < multiplicacion.length - 1; y++) {
                multiplicar[posicionDigito] += (multiplicacion[y][i]);
            }
            if (multiplicar[posicionDigito] >= 10) {
                multiplicar[posicionDigito - 1] += multiplicar[posicionDigito] / 10;
                multiplicar[posicionDigito] %= 10;
            }
            posicionDigito--;
        }
    }
    public static double divisionArray(int[] a, int[] b) {
        //para dividir numeros gigantes, lo que vamos a hacer es tomar un valor aproximado,
        //dividiendo los 20 primeros numeros de cada array entre sí
        int j = 1;
        int y = 1;
        int limiteA = 10;
        int limiteB = 10;

        double aproximacionArray1 = a[j];
        while (aproximacionArray1 == 0) {
            aproximacionArray1 = a[++j];
        }
        double aproximacionArray2 = b[y];
        while (aproximacionArray2 == 0) {
            aproximacionArray2 = b[++y];
        }

        for (int i = j; i < limiteA; i++) {
            aproximacionArray1 = aproximacionArray1 * 10 + a[i];
            j++;
        }
        for (int o = y; o < limiteB; o++) {
            aproximacionArray2 = aproximacionArray2 * 10 + b[o];
            y++;
        }
        double division =  aproximacionArray1 / aproximacionArray2;
        return division;
    }
    //Este método está comentado y sirve para comprobar la matriz de la multiplicación
    //Era necesario para conocer la exactitud del método de multiplicar
    /*
    public static void representarMultiplicacion() {
        for (int[] i : multiplicacion) {
            for (int y : i) {
                System.out.print(y);
            }
            System.out.println();
        }
    }
     */
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
        System.out.println("Suma de los dos arrays: ");
        printArray(suma);


        restaArray(arrayUno, arrayDos);
        System.out.println("\nResta de los dos arrays: ");
        printArray(resta);

        System.out.print("\nDivision del array1 / array2: ");
        System.out.println(divisionArray(arrayUno, arrayDos));


        System.out.println("\nMultiplicación del array1 * array2:");
        multiplicacionArray(arrayUno, arrayDos);
        printArray(multiplicar);
    }
}
