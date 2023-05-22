package ejercicios;

import java.util.Scanner;

public class IndicarOrden {

    public static void main(String[] args) {

        /*
        ENUNCIADO
        
        Leer por teclado una serie de 10 numeros enteros. la aplicacion
        debe indicarnos si los numeros estan ordenados de forma creciente,
        decreciente, o si estan desordenados.
         */
        //array
        int numeros[] = new int[10];
        int i = 0;

        Scanner entrada = new Scanner(System.in);

        //Insertar numeros
        for (int j = 0; j < numeros.length; j++) {
            System.out.print("Ingresa un numero: ");
            numeros[j] = entrada.nextInt();

        }

        //Ordenados
        int ordenados=0;
        int a=0;
        while (i<numeros.length) {

            //Ordenados
            if(ordenados ==9){
                System.out.println("Estan ordenados Acendentemente");
                a=1;
            }
            if (i==9){
                break;
            }
            if (numeros[i] <= numeros[i+1]) {
                ordenados+=1;
            }
            

            i++;

        }
        //Desordenados
        int desordenados = 0;
        int j = 9;
        int d=0;
        while (0 <= j) {

            if (j == 0) {
                break;
            }

            if (numeros[j] < numeros[j - 1]) {
                desordenados += 1;
                if (desordenados == 9) {
                    System.out.println("Estan en orden decendente");
                    d=1;
                }
            }

            j--;

        }
        
        if (a!=1 && d!=1){
            System.out.println("Estan desordenados");
        }

    }

}
