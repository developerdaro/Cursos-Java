package ejercicios;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MostrarNumeros {

    public static void main(String[] args) {
        
        
        /*
        ENUNCIADO
        
        Leer 5 numeros, guardarlos en un arreglo y mostrarlos en el mismo
        orden introducido.
        */
        
        //Parametros
        int numeros;
        
        //Pedir numeros
        Scanner entrada=new Scanner(System.in);
        
        //Array
        int numeroArray[]=new int[5];
        
        //Introducir datos arreglo
        for (int i=0; i<numeroArray.length;i++){
            System.out.println("Ingresa un numero");
            numeroArray[i]=entrada.nextInt();
           
        }
        
        for(int elementos:numeroArray){
            System.out.println(elementos);
        }
        
        
        
    }

    
}
