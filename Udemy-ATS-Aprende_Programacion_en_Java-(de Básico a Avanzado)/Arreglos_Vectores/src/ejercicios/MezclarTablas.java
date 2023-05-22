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

        int mitad = c.length / 2;
        int foruno = 0;
        int saltarin=2;
        int fordos=0;
        int j=0;
        for (int i = 0; 23 > i; i++) {

            c[i] = a[foruno];
            
            if (i == saltarin|| i==14|| i==20) {

                while(j< b.length) {
                    i++;
                    c[i] = b[j];
                    j++;
                    if (i == saltarin*saltarin+1|| i==11|| i==17) {
                        
                        saltarin=saltarin*4;
                        break;
                    }

                }
            }
            foruno++;
         

        }

        //Organizar
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        //Mostrar tabla C
        for (int elementoC : c) {

            //System.out.println(elementoC);
        }

    }

}
