package busquedas;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Binaria {

    public static void main(String[] args) {

        /*
        Binaria
        
        El arreglo debe estar ordenado de manera ascendente antes de buscar
         */
        Scanner entrada = new Scanner(System.in);

        int arreglo[], numeroElementos, dato;

        numeroElementos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de posiciones"));
        dato = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dato a buscar"));

        arreglo = new int[numeroElementos];

        for (int i = 0; i < numeroElementos; i++) {
            System.out.print((i + 1) + "- Ingrese un numero");
            arreglo[i] = entrada.nextInt();
        }

        //Busqueda binaria
        int inferior, superior, mitad, iterador;
        boolean bandera = false;
        inferior = 0;
        superior = numeroElementos;
        iterador = 0;
        mitad = (inferior + superior) / 2;

        while (inferior <= superior && iterador < numeroElementos) {
            if (arreglo[mitad] == dato) {
                bandera = true;
                break;
            }
            if (arreglo[mitad] > dato) {
                superior = mitad;
                mitad = (inferior + superior) / 2;
            }
            if (arreglo[mitad] < dato) {
                inferior = mitad;
                mitad = (inferior + superior) / 2;
            }
            iterador++;

        }

        if (bandera == false) {
            JOptionPane.showMessageDialog(null, "No se ha encontrado el numero en el arreglo");
        } else {
            JOptionPane.showMessageDialog(null, "Dato encontrado en el arreglo: " + arreglo[iterador - 1]);
        }

    }

}
