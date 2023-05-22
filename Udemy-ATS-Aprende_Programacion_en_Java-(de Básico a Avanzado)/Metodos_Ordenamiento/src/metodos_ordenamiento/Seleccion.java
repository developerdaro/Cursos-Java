package metodos_ordenamiento;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Seleccion {

    public static void main(String[] args) {

        /*
        Seleccion
        
        Es un algoritmo de ordenamiento que requiere 0(n^2) operaciones para
        ordenar una lista de n numeros. Su funcionamiento es el siguiente:
        
        1.Buscar el minimo elemento de la lista
        2.Intercambiar con el primer elemento
        3.Buscar el minimo del resto de la lista
        4.Intercambiar con el segundo
        5.Y asi sucesivamente
        
        [4][5][2][1][3]
         */
        //Scanner para pedir datos al usuario por consola
        Scanner entrada = new Scanner(System.in);

        //declaramos el arriglo y el atributo para saber cuantos elementos tendra el arreglo
        int arreglo[], numeroElementos, minimo, temporal;

        //Pedirmos al usuario cuantos numeros tendra el arreglo
        numeroElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de elementos"));

        //instanciamos los numeros digitados por el usuario al arreglo
        arreglo = new int[numeroElementos];

        //Pedimos los datos del arreglo
        for (int i = 0; i < numeroElementos; i++) {
            System.out.print((i + 1) + "- Ingresa un numero: ");
            arreglo[i] = entrada.nextInt();
        }

        //Metodo por seleccion
        //Primer for va hacer la flecha  
        for (int i = 0; i < numeroElementos; i++) {

            //Buscamos el numero menor
            minimo = i;

            //Comprobamos en la siguiente posicion hasta encontrar el menor
            for (int j = i+1; j < numeroElementos; j++) {

                //Que elemento es el menor
                if (arreglo[j] < arreglo[minimo]) {
                    minimo = j;
                }

            }

            //Cambiamos de posicion con el menor
            temporal = arreglo[i];
            arreglo[i] = arreglo[minimo];
            arreglo[minimo] = temporal;

        }

        //Mostrar el arreglo ordenado acendente
        System.out.println("Arreglo acendente");
        for (int i = 0; i < numeroElementos; i++) {
            System.out.println(arreglo[i]);

        }
        //Mostrar el arreglo ordenado descendente
        System.out.println("Arreglo descendente");
        for (int i = numeroElementos - 1; i >= 0; i--) {
            System.out.println(arreglo[i]);
        }

    }

}
