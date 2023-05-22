package metodos_ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Burbuja {

    public static void main(String[] args) {

        /*
        Burbuja
        
        Ordenar los numeros o lementos de un arreglo
        Es un sencillo algoritmo de ordenamiento. Funciona revisando cada
        elemento de la lista que va a ser ordenada con el siguiente, 
        intercambiandolos de posicion si estan en el orden equivocado. Es necesario
        revisar varias veces toda la lista hasta que no se necesiten mas intercambios, 
        lo cual significa que la lista esta ordenada.
        
        Ejemplo
        [4][5][2][1][3]
        si
        numeroActual > numeroSiguiente :cambio orden
         */
        Scanner entrada = new Scanner(System.in);

        int arreglo[], numeroElementos, temporal;

        numeroElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el numero de elementos"));

        //Asignamos el numero de elementos al arreglo
        arreglo = new int[numeroElementos];

        for (int i = 0; i < numeroElementos; i++) {

            System.out.print((i + 1) + "- Digite un numero: ");
            arreglo[i] = entrada.nextInt();

        }

        //Metodo burbuja
        //Primer for es para que se de cuenta cuantas vueltas tiene que dar
        for (int i = 0; i < numeroElementos - 1; i++) {

            //Segundo for es para ordenar el arreglo, intercambiar valores
            for (int j = 0; j < numeroElementos - 1; j++) {

                //NumeroActual>numeroSiguiente
                if (arreglo[j] > arreglo[j + 1]) {
                    temporal = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = temporal;
                }

            }
        }

        //Mostrar el arreglo ordenado acendente
        System.out.println("Arreglo acendente");
        for (int i = 0; i < numeroElementos; i++) {
            System.out.println(arreglo[i]);

        }
        //Mostrar el arreglo ordenado descendente
        System.out.println("Arreglo descendente");
        for (int i = numeroElementos-1; i >= 0; i--) {
            System.out.println(arreglo[i]);
        }

    }

}
