package ejercicios;

import java.util.Scanner;

public class MezclarTablas {

    public static void main(String[] args) {

        /*
        ENUNCIADO
        Leer los datos correspondientes a dos tablas de 12 elementos numericos,
        y mezclarlos en una tercera de la forma: 3 de la tabla A, 3 de la B,
        otros 3 de A, otros 3 de la B, etc.
         */
        //Atributos
        int datosA, datosB;

        Scanner entrada = new Scanner(System.in);

        //Arrays
        int a[] = new int[12];
        int b[] = new int[12];

        //Longitud de tabla C
        int longitudTablaC = a.length + b.length;
        int c[] = new int[longitudTablaC];

        //Datos tabla A
        for (int i = 0; i < a.length; i++) {
            System.out.print("Tabla A: ");
            a[i] = entrada.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print("Tabla B: ");
            b[i] = entrada.nextInt();
        }

        int temporal = 2;
        int segundoFor=0;
        int contadorInterno=2;
        for (int i = 0; a.length > i; i++) {
            c[i] = a[i];
            System.out.println("Valor FOR 1 - " + c[i]);

            if (i == temporal) {
                temporal = a.length;
                for (int j = 0; j < temporal; j++) {
                    c[i + segundoFor] = b[segundoFor];
                    System.out.println("Valor FOR 2 - " + c[i + segundoFor]);

                    if (j == contadorInterno) {
                        temporal=5;
                        break;
                    }
                    segundoFor++;

                }
            }

        }

        //Mostrar tabla C
        for (int elementoC : c) {
            //System.out.println(elementoC);
        }

    }

}
