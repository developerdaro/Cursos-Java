package ejercicios;

import java.util.Scanner;

public class combinarTablas {

    public static void main(String[] args) {

        /*
        ENUNCIADO
        
        Leer por teclado dos tablas de 10 numeros enteros y mezclarlas en una tercera de la
        forma:
        
        El 1° de A, el 1° de B, el 2° de A, el 2° de B, etc.
         */
        //Atributos
        int numeroTablaA;
        int numeroTablaB;

        //Scanner para pedir por teclado
        Scanner entrada = new Scanner(System.in);

        //arrays
        int a[] = new int[10];
        int b[] = new int[10];

        //Pedir datos de tabla A
        for (int tablaA = 0; tablaA < a.length; tablaA++) {
            System.out.print("Tabla A: ");
            a[tablaA] = entrada.nextInt();
        }
        //Pedir datos de tabla B
        for (int tablaB = 0; tablaB < b.length; tablaB++) {
            System.out.print("Tabla B: ");
            b[tablaB] = entrada.nextInt();
        }

        //dimension de la tabla c
        int dimension = a.length + b.length;
        int c[] = new int[dimension];
        int control;

        //Insercion de datos en la tabla C
        int contador = 0;
        int contador2 = 10;
        int longitud = c.length;
        for (int i = 0; i < longitud; i += 2) {

            for (int x = 1; x < longitud; x += 2) {
                c[i] = a[contador];
                c[i+1] = b[contador];
            }
            contador++;
        }

        //Recorro tabla C
        for (int tablaC : c) {
            System.out.println(tablaC);
        }

    }

}
